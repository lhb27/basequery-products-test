<%@ page contentType="text/html; charset=UTF-8"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link type="text/css" rel="stylesheet" href="http://css.gzedu.com/common/v2/common.css">
<link type="text/css" rel="stylesheet" href="http://css.gzedu.com/common/components/style/base.css">
<script type="text/javascript" src="http://css.gzedu.com/common/js/jquery.js"></script>
<title>远程教育数据中心</title>
</head>
<body>
<div class="error404">
	<div class="error404_ctn">
    	<h1 class="error404_logo"><a href="#">
    		<!-- 
    		<img src="http://css.gzedu.com/lhzyee_com/portal/v1.0/images/logo.png" />
    		 -->
    		</a></h1>
        <div class="info yahei">
        	<p class="font24 d_red">喔哦！系统出小差了，请稍后再访问！</p>
            <p class="font14 gray3">3 秒后自动返回上一页</p>
         <!-- 
            <p class="gray6 top20">非常抱歉，链接资源不存在。若有疑问，请您联系 <a class="d_red" href="#">课程顾问</a><br>感谢您对我们工作的大力支持。</p>
             -->
            <div style="margin-top:40px;">
              <!-- 
                <a class="medbtn medbtn-orange right20" href="javascript:;"><span>刷新本页面</span></a>
                   -->
                <a class="medbtn medbtn-green" href="javascript:go();"><span>返回上一页</span></a>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
	$(function(){
		window.setTimeout("go()",3000);
	})
	function go(){
		window.history.go(-1);
	}
</script>
</html>
