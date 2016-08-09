package com.eenet.basequery.authen;

import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;

import javax.crypto.Cipher;

import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.json.JSONException;
import org.json.JSONObject;

import com.eenet.authen.AdminUserLoginAccount;
import com.eenet.baseinfo.user.AdminUserInfo;

public class AuthenUtils {
	
	public static void main(String[] a) throws IllegalArgumentException, Exception{
		HashMap<String,String> tokenMap = grantToken(grantCode());
		//getAdminUserInfo(tokenMap.get("userId"),tokenMap.get("accessToken"));
		
	}
	
	

	
	public static AdminUserLoginAccount getAdminUserInfo(String adminUserId,String accessToken) throws Exception{
		HashMap<String,String> paramMap = new HashMap<String,String>();
		paramMap.put("appId", Constant.appId);
		paramMap.put("appSecretKey", AuthenUtils.encrypt(Constant.appSecretKey+"##"+System.currentTimeMillis()));
		paramMap.put("userAccessToken", accessToken);
		paramMap.put("userId", adminUserId);
		paramMap.put("userType", "adminUser");
		paramMap.put("adminUserId", adminUserId);
		
		 HttpClientUtil httpUtil = HttpClientUtil.getInstance("UTF-8");	        
	     String returnMessage = httpUtil.getResponseBodyAsString(Constant.getAdminUserURL,paramMap);
		
//	     System.out.println("getAdminUserInfo:returnMessage: : " + returnMessage);
		 JSONObject jsonObject = new JSONObject(returnMessage);
		 Boolean successful = (Boolean)jsonObject.get("successful");
		 AdminUserLoginAccount adminUserLoginAccount = null;
		 AdminUserInfo adminUserInfo = null;
		 if(successful){
			 adminUserLoginAccount = new AdminUserLoginAccount();
			 adminUserInfo = new AdminUserInfo();
			 adminUserLoginAccount.setUserInfo(adminUserInfo);
			 adminUserInfo.setAtid(getJsonObject(jsonObject,"atid"));
			 adminUserInfo.setName(getJsonObject(jsonObject,"name"));
			 adminUserInfo.setEmail(getJsonObject(jsonObject,"eamil"));
			 if(!"".equals(getJsonObject(jsonObject,"mobile")))
				 adminUserInfo.setMobile(Long.valueOf(getJsonObject(jsonObject,"mobile")));
			 
		 }
		return adminUserLoginAccount;
	}
	
	public static String loginUserGrantCode(String account,String password) throws IllegalArgumentException, Exception{
		/* 获得登录授权码 */
		HashMap<String,String> paramMap = new HashMap<String,String>();
		paramMap.put("appId", Constant.appId);
		paramMap.put("redirectURI", Constant.appDomain);
		paramMap.put("loginAccount", account);
		paramMap.put("password", AuthenUtils.encrypt(password+"##"+System.currentTimeMillis()));
		
		 HttpClientUtil httpUtil = HttpClientUtil.getInstance("UTF-8");	        
	     String returnMessage = httpUtil.getResponseBodyAsString(Constant.getAdminSignOnGrantURL,paramMap);
		
//		System.out.println("returnMessage : " + returnMessage);
		JSONObject jsonObject = new JSONObject(returnMessage);
		Boolean successful = (Boolean)jsonObject.get("successful");
		if(successful){
			String grantCode = jsonObject.get("grantCode").toString();
//			System.out.println("grantCode : " + grantCode);
			return grantCode;
		}
		return "";
	}
	
	public static String grantCode() throws IllegalArgumentException, Exception{
		/* 获得登录授权码 */
		HashMap<String,String> paramMap = new HashMap<String,String>();
		paramMap.put("appId", Constant.appId);
		paramMap.put("redirectURI", Constant.appDomain);
		paramMap.put("loginAccount", Constant.adminAccount);
		paramMap.put("password", AuthenUtils.encrypt(Constant.adminPassword+"##"+System.currentTimeMillis()));
		
		 HttpClientUtil httpUtil = HttpClientUtil.getInstance("UTF-8");	        
	     String returnMessage = httpUtil.getResponseBodyAsString(Constant.getAdminSignOnGrantURL,paramMap);
		
//		System.out.println("returnMessage : " + returnMessage);
		JSONObject jsonObject = new JSONObject(returnMessage);
		Boolean successful = (Boolean)jsonObject.get("successful");
		if(successful){
			String grantCode = jsonObject.get("grantCode").toString();
//			System.out.println("grantCode : " + grantCode);
			return grantCode;
		}
		return "";
	}
	
	public static HashMap<String,String> grantToken(String grantCode) throws IllegalArgumentException, Exception{
		/* 获得访问令牌 */
		HashMap<String,String> paramMap = new HashMap<String,String>();
		paramMap.put("appId", Constant.appId);
		paramMap.put("grantCode", grantCode);
		paramMap.put("appSecretKey", AuthenUtils.encrypt(Constant.appSecretKey+"##"+System.currentTimeMillis()));
		
		HttpClientUtil httpUtil = HttpClientUtil.getInstance("UTF-8");	        
	    String returnMessage = httpUtil.getResponseBodyAsString(Constant.getAdminAccessTokenURL,paramMap);
		
//		System.out.println("returnMessage : " + returnMessage);
	    JSONObject jsonObject = new JSONObject(returnMessage);
		String accessToken = jsonObject.get("accessToken").toString();
		
		String userInfoJson = jsonObject.get("userInfo").toString();
		JSONObject userInfoJsonObj = new JSONObject(userInfoJson);
		String userId = userInfoJsonObj.getString("atid");
//		System.out.println("accessToken : " + accessToken + ", refreshToken : " + refreshToken + " user atid: "+userId);
		HashMap<String,String> tokenMap = new HashMap<String,String>();
		tokenMap.put("accessToken", accessToken);
		tokenMap.put("userId", userId);
		return tokenMap;
	}
	
	public static String encrypt(String plaintext) throws Exception {
		String sslPublicKey = 
				"MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC3ofG3TuzCBaolNYFuTVkOv8yN" + "\r" +
				"B+u3KvSwqqMYsqAKK/q518kyVnl5Mq2h4kqE6YKaV1hJgsd0n4McjCg06xXQP1nh" + "\r" +
				"w3kjX/cL0W6jKTTERDnNDK6ifIdczsFOsaFMSxuA9T3Laji3WmTz4sDpkBN7Ymql" + "\r" +
				"yzqa7HG12GH4zODWtwIDAQAB" + "\r";
		
		byte[] buffer= Base64.decodeBase64(sslPublicKey);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		X509EncodedKeySpec keySpec= new X509EncodedKeySpec(buffer);
		RSAPublicKey pubKey = (RSAPublicKey) keyFactory.generatePublic(keySpec);
		
		Cipher cipher= Cipher.getInstance("RSA/ECB/PKCS1Padding", new BouncyCastleProvider());//RSA是加密方法，ECB是加密模式，PKCS1Padding是填充方式
		cipher.init(Cipher.ENCRYPT_MODE, pubKey);
		byte[] output= cipher.doFinal(plaintext.getBytes("UTF-8"));
		
		return Base64.encodeBase64String(output);
	}
	
	private  static String getJsonObject(JSONObject jsonObject,String key){
		try{
			return  jsonObject.get(key).toString();
		}catch( JSONException e){
		}
		return "";
	}
}