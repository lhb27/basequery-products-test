<%@ page contentType="text/html; charset=UTF-8"%>
 <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <div class="overlay-wrapper loading" style="display: none;"><div class="overlay"><i class="fa fa-refresh fa-spin" style="top:200px !important"></i></div></div>
    <div class="page-tabs-box">
      <div class="page-tabs-content clearbox">
        <div class="dropdown page-group-control yahei"> <a class="dropdown-toggle" data-toggle="dropdown" href="<%=request.getContextPath() %>/static/#"> 关闭操作 <span class="caret"></span> </a>
          <ul class="dropdown-menu">
            <li role="presentation" class="close-all-tabs"><a role="menuitem" tabindex="-1" href="#">关闭全部选项卡</a></li>
            <li role="presentation" class="close-other-tabs"><a role="menuitem" tabindex="-1" href="#">关闭其他选项卡</a></li>
          </ul>
        </div>
        <div class="page-tabs-div clearbox">
          <div class="page-left-btn"><i class="fa fa-fw fa-angle-left"></i></div>
          <div class="page-right-btn"><i class="fa fa-fw fa-angle-right"></i></div>
          <div class="page-tabs">
            <ul class="clearbox">
              <li class="home-tab" data-id="0"><a href="#">首页</a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
    <div class="page" data-id="0">
        <iframe src="<%=request.getContextPath() %>/static/welcome.jsp" frameborder="0" scrolling="auto"  
       					 style="min-height: 1000px;"  allowtransparency="true"></iframe>
    </div> 
  </div>
</div>
<!-- ./wrapper --> 