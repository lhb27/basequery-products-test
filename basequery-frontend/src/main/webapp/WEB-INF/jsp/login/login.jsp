<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>远程教育数据中心</title>
<link rel="stylesheet" type="text/css" href="http://css.gzedu.com/admin/style/login_default/base.css" />
<script type="text/javascript" src="http://css.gzedu.com/common/js/jquery.js"></script>
<script type="text/javascript" src="http://css.gzedu.com/admin/js/login.js"></script>
<!--[if lte IE 6]>
<script type="text/javascript" src="http://css.gzedu.com/common/js/DD_belatedPNG_0.0.8a.js"></script>
<script type="text/javascript">
	DD_belatedPNG.fix('.bg_png, .login_contianer, .ico_lock, .ico_user, .login_header .left, .login_header .right, .login_header .mid, .login_header .mid1, .login_content .left, .login_content .right, .login_bottom .left, .login_bottom .right, .login_bottom .mid');
</script>
<![endif]-->
<script type="text/javascript">
	if(window.top && window.top.document.URL!=document.URL){
		window.top.location = "<%=request.getContextPath() %>/";
	}
</script>
</head>

<body>
<div class="body_container" id="bodyContainer">
	<div class="loading" id="loading"></div>
    <div class="login_main hide" id="loginMain">
    	<div class="main_contianer">
        <div class="login_contianer">
            <div class="login_header">
                <div class="left"></div>
                <div class="right"></div>
                <div class="mid">
                	<!-- 
                	<img id="logoImg" src="http://html.eezyjy.com/oucnet_zy/images/logo.png" alt="" width="400px">
                	 -->
                	<span style="margin-left:15px;display:inline-block;vertical-align:middle;">远程教育数据中心</span>
                </div>
            </div>
            	<form id="myform" action="<%=request.getContextPath() %>/login" method="post">
	            <div class="login_content">
	                <div class="left"></div>
	                <div class="right"></div>
	                <div class="mid">
	                    <div class="content_inner">
	                        <div class="row_wrapper">
	                            <div class="input_box float_left">
	                                <span>
	                                    <i class="icon ico_user margin_r5"></i><ins id="user_warpper"><input type="text" id='loginAccount' name="loginAccount" class="input_text common_input2" value="请输入用户名" onfocus="userclick();"/></ins>
	                                </span>
	                            </div>
	                      </div>
	                     <div class="row_wrapper">
	                        <div class="input_box" style="*float:left;">
	                            <span>
	                                  <i class="icon ico_lock margin_r5"></i><ins id="pwd_warpper"><input type="text" id="password" name="password" class="input_text common_input2" value="请输入密码" onfocus="showpassword();" /></ins>
	                            </span>
	                        </div>
	                     </div>
	                    <p class="row_wrapper">
	                    	<a href="javascript:;" class="login_in" onfocus="this.blur()" onclick="loginUser()"></a>
	                    </p>
	                    <p class="row_wrapper prompt" id="errorMsg">${errMsg}</p>
	                    </div>
	                    
	                 </div>
	            </div>
            </form>
            <div class="login_bottom">
                <div class="left"></div>
                <div class="right"></div>
                <div class="mid"></div>
            </div>
        </div>
        <div class="copyright">
			<footer class="pro_edu_footer pro_edu_footer_bg pagewidth">
			    <div class="footer_information">
			        <div class="information_logo">
			            <p class="clearfix bottom5">
			            	<span class="fl">主办单位：广州远程教育中心 </span>
			            </p>
			           
			        </div>
			    </div>
			</footer>
		</div>
    </div>
    </div>
    <div class="bg_main hide" id="mainBg">
        <img src="http://css.gzedu.com/admin/style/login_default/images/bg_main01.jpg" orgwidth="1920" orgheight="1024" />
    </div>
</div>
<script type="text/javascript">
	
	function loginUser() {
		if(document.getElementById("loginAccount").value==''){
			$('#errorMsg').html("请输入用户名!").show().delay(5000).hide(0);
			return false;
		}else if(document.getElementById("loginAccount").value=='请输入用户名'){
			$('#errorMsg').html("请输入用户名!").show().delay(6000).hide(0);
			return false; 
		}
		if(document.getElementById("password").value==''){
			$('#errorMsg').html("请输入密码!").show().delay(6000).hide(0);
			return false;
		}else if(document.getElementById("password").value=='请输入密码'){
			$('#errorMsg').html("请输入密码!").show().delay(6000).hide(0);
			return false; 
		}	
		$("#password").attr("name","password");
		$("#myform").submit();
	}
	
	document.onkeydown=function(){
		if(window.event.keyCode==13){
			loginUser();
		}
	}
	
	$(function(){
		$("#password").attr("type","text");
	});
</script>
</body>
</html>
