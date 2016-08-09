<%@ page contentType="text/html; charset=UTF-8"%>

<html class="reset">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>远程教育数据中心</title>
<!-- Tell the browser to be responsive to screen width -->
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<!-- Bootstrap 3.3.5 -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/bootstrap/css/bootstrap.min.css">
<link href="<%=request.getContextPath() %>/static/bootstrap/css/bootstrap-select.min.css"  rel="stylesheet">
<link href="<%=request.getContextPath() %>/static/bootstrap/css/bootstrap-table.css"  rel="stylesheet">
<!-- Font Awesome -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/font-awesome/4.4.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/ionicons/2.0.1/css/ionicons.min.css">

<!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/dist/css/skins/skin-blue.min.css">
<!-- iCheck -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/plugins/iCheck/flat/blue.css">
<!-- Morris chart -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/plugins/morris/morris.css">
<!-- jvectormap -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
<!-- Date Picker -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/plugins/datepicker/datepicker3.css">
<!-- Daterange picker -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/plugins/daterangepicker/daterangepicker-bs3.css">
 <!-- Select2 -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/plugins/select2/select2.min.css">
<!-- iCheck for checkboxes and radio inputs -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/plugins/iCheck/all.css">
<!-- bootstrap wysihtml5 - text editor -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
<!-- DataTables -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/plugins/datatables/dataTables.bootstrap.css">
<!-- Theme style -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/dist/css/AdminLTE.min.css">
<!-- jquery-ui -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/plugins/jQueryUI/css/jquery-ui.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/static/dist/css/reset.css">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="<%=request.getContextPath() %>/static/https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="<%=request.getContextPath() %>/static/https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="hold-transition fixed skin-blue sidebar-mini">
<div class="wrapper"> 
  
    <!-- header -->
  	<jsp:include page="/WEB-INF/jsp/layouts/header.jsp" />
  <!--/ header -->
  
      <!-- sidebar -->
  	<jsp:include page="/WEB-INF/jsp/layouts/sidebar.jsp" />
   <!--/ sidebar -->

  <!-- Content Wrapper. Contains page content -->
       <!-- tabs -->
  	<jsp:include page="/WEB-INF/jsp/layouts/tabs.jsp" />
    <!--/ tabs -->
<!-- ./wrapper --> 
 


<!-- IE8及以下的浏览器弹出提示窗口 -->
<div id="dialog-message" title="温馨提示" style="display:none">
  <p style="padding:20px 10px;margin:0;"> 本管理系统支持IE9以上版本浏览器，为了获取更好的体验，建议
    使用Firefox、Chrome、Opera等浏览器。 </p>
</div>
<!-- jQuery 2.1.4 --> 
<!--[if gte IE 9]>
	<script src="<%=request.getContextPath() %>/static/plugins/jQuery/jQuery-2.1.4.min.js"></script>
	<![endif]--> 

<!--[if !IE]><!--> 
<script src="<%=request.getContextPath() %>/static/plugins/jQuery/jQuery-2.1.4.min.js"></script> 
<!--<![endif]--> 

<!--[if lt IE 9]>
		<script src="<%=request.getContextPath() %>/static/plugins/jQuery/jquery-1.9.0.min.js"></script>
	<![endif]--> 

<script src="<%=request.getContextPath() %>/static/plugins/jQueryUI/jquery-ui.min.js"></script> 

<!--[if lt IE 9]>
	<script>
		$(function() {
		var dialog=$( "#dialog-message" ).dialog({
		  modal: true,
		  width: 600,
		  create: function( event, ui ) {
			//$("html").css("overflow","hidden")
		  },
		  buttons: {
			'我知道了': function() {
			  $( this ).dialog( "close" );
			}
		  }
		}).dialog( "instance" );
		dialog.uiDialog.css("z-index",10001);
		dialog.overlay.css("z-index",10000);
		});
	</script>
	<![endif]--> 

<script src="<%=request.getContextPath() %>/static/bootstrap/js/bootstrap.min.js"></script> 
<script src="<%=request.getContextPath() %>/static/bootstrap/js/bootstrap-select.js"></script> 
<script src="<%=request.getContextPath() %>/static/bootstrap/js/bootstrap-table.js"></script> 
<script src="<%=request.getContextPath() %>/static/bootstrap/js/bootstrap-table-zh-CN.js"></script> 
<script src="<%=request.getContextPath() %>/static/bootstrap/js/defaults-zh_CN.js"></script> 

<!-- date-range-picker --> 
<script src="<%=request.getContextPath() %>/static/ajax/libs/moment.js/2.10.2/moment.min.js"></script> 
<script src="<%=request.getContextPath() %>/static/plugins/daterangepicker/daterangepicker.js"></script> 
<!-- Select2 --> 
<script src="<%=request.getContextPath() %>/static/plugins/select2/select2.full.min.js"></script> 
<!-- 选项卡滚动 --> 
<script src="<%=request.getContextPath() %>/static/plugins/tabsSroll/sunny_scroll.js"></script> 
<!-- DataTables --> 
<script src="<%=request.getContextPath() %>/static/plugins/datatables/jquery.dataTables.js"></script> 
<script src="<%=request.getContextPath() %>/static/plugins/datatables/dataTables.bootstrap.js"></script> 
<!-- iCheck 1.0.1 -->
<script src="<%=request.getContextPath() %>/static/plugins/iCheck/icheck.min.js"></script>
<!-- SlimScroll 1.3.0 --> 
<script src="<%=request.getContextPath() %>/static/plugins/slimScroll/jquery.slimscroll.min.js"></script> 
<!-- Morris.js charts -->
<script src="<%=request.getContextPath() %>/static/plugins/morris/raphael-min.js"></script>
<script src="<%=request.getContextPath() %>/static/plugins/morris/morris.min.js"></script>
<!-- ckeditor --> 
<script src="<%=request.getContextPath() %>/static/plugins/ckeditor/ckeditor.js"></script> 
<!-- AdminLTE App --> 
<script src="<%=request.getContextPath() %>/static/dist/js/app.min.js"></script>  
<!-- common js --> 
<script src="<%=request.getContextPath() %>/static/dist/js/common.js"></script>
<script src="<%=request.getContextPath() %>/static/dist/js/index.js"></script>
</body>
</html>
