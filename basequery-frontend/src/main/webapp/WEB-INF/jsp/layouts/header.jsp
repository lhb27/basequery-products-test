<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Left side column. contains the logo and sidebar -->
  <header class="main-header"> <a href="#" class="logo">
    <div class="logo-wrap"><img src="<%=request.getContextPath() %>/static/dist/img/images/eenet_standard_logo.png"></div>
    <span class="logo-mini"><b>管理员</b></span> <span class="logo-lg"><b>远程教育数据中心</b></span> </a>
    <nav class="navbar navbar-static-top" role="navigation"> <a href="<%=request.getContextPath() %>/static/#" class="sidebar-toggle" data-toggle="offcanvas" role="button"> <span class="sr-only">首页</span> </a>
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Notifications: style can be found in dropdown.less --> 
          <!-- Messages: style can be found in dropdown.less-->
          <li class="first-level-wrap">
            <ul class="first-level-menu">
              <c:if test="${adminUserLoginInfo.loginAccount eq 'account01' || adminUserLoginInfo.loginAccount eq 'admin' }">
		              <li data-id="1">学习中心查询</li>
              </c:if>
               <c:if test="${adminUserLoginInfo.loginAccount eq 'account02' || adminUserLoginInfo.loginAccount eq 'admin' }">
		              <li data-id="2">教学资源查询</li>
              </c:if>
               <c:if test="${adminUserLoginInfo.loginAccount eq 'account03' || adminUserLoginInfo.loginAccount eq 'admin' }">
		               <li data-id="3">产品平台查询</li>
              </c:if>
                <c:if test="${adminUserLoginInfo.loginAccount eq 'account04' || adminUserLoginInfo.loginAccount eq 'admin' }">
		              <li data-id="4">市场与营销查询</li>
              </c:if>
            </ul>
            <div class="dropdown operion-more-menu">
            <!-- 
            	<a class="dropdown-toggle" data-toggle="dropdown" href="#"> 更多 <i class="fa fa-fw fa-caret-down"></i> </a>
               --> 
              <ul class="dropdown-menu">
               <c:if test="${adminUserLoginInfo.loginAccount eq 'account01' || adminUserLoginInfo.loginAccount eq 'admin' }">
                <li data-id="1"> <a role="menuitem" href="#">学习中心查询</a>
                  <ul class="menu-temp hide">
                    <li class="header">学习中心查询</li>
                    <li class="treeview"> <a href="<%=request.getContextPath() %>/productQuery"> <i class="fa fa-dashboard"></i> <span>产品数据查询</span> <i class="fa fa-angle-left pull-right"></i> </a>
                    </li>
                    <li class="treeview"> <a href="<%=request.getContextPath() %>/getLCStudentStatus"> <i class="fa fa-dashboard"></i> <span>招生学籍查询</span> <i class="fa fa-angle-left pull-right"></i> </a>
                    </li>
                    <li class="treeview"> <a href="<%=request.getContextPath() %>/getLCStudentDyna"> <i class="fa fa-dashboard"></i> <span>招生学情查询</span> <i class="fa fa-angle-left pull-right"></i> </a>
                    </li>
                     <li class="treeview"> <a href="<%=request.getContextPath() %>/getLCReserveOrder"> <i class="fa fa-dashboard"></i> <span>预报读查询</span> <i class="fa fa-angle-left pull-right"></i> </a>
                    </li>
                  </ul>
                </li>
                </c:if>
                <c:if test="${adminUserLoginInfo.loginAccount eq 'account02' || adminUserLoginInfo.loginAccount eq 'admin' }">
                <li data-id="2"> <a role="menuitem" href="#">教学资源查询</a>
                  <ul class="menu-temp hide">
                    <li class="header">教学资源查询</li>
                    <li class="treeview"> <a href="<%=request.getContextPath() %>/getRECourse"> <i class="fa fa-dashboard"></i> <span>课程资源查询</span> <i class="fa fa-angle-left pull-right"></i> </a>
                    </li>
					<li class="treeview"> <a href="<%=request.getContextPath() %>/getREStudentAssess"> <i class="fa fa-dashboard"></i> <span>课程考核查询</span> <i class="fa fa-angle-left pull-right"></i> </a>
                    </li>
                    <li class="treeview"> <a href="<%=request.getContextPath() %>/getREStudentStatus"> <i class="fa fa-dashboard"></i> <span>报读学员查询</span> <i class="fa fa-angle-left pull-right"></i> </a>
                    </li>
                  </ul>
                </li>
                </c:if>
                <c:if test="${adminUserLoginInfo.loginAccount eq 'account03' || adminUserLoginInfo.loginAccount eq 'admin' }">
                <li data-id="3"> <a role="menuitem" href="#">产品平台查询</a>
                  <ul class="menu-temp hide">
                    <li class="header">产品平台查询</li>
                    <li class="treeview"> <a href="<%=request.getContextPath() %>/getPFStudent"> <i class="fa fa-dashboard"></i> <span>学员信息查询</span> <i class="fa fa-angle-left pull-right"></i> </a>
                    </li>
                     <li class="treeview"> <a href="<%=request.getContextPath() %>/getPFStudentDyna"> <i class="fa fa-dashboard"></i> <span>平台学籍查询</span> <i class="fa fa-angle-left pull-right"></i> </a>
                    </li>
                     <li class="treeview"> <a href="<%=request.getContextPath() %>/getPFStudentStatus"> <i class="fa fa-dashboard"></i> <span>平台学情查询</span> <i class="fa fa-angle-left pull-right"></i> </a>
                    </li>
                  </ul>
                </li>
                </c:if>
                <c:if test="${adminUserLoginInfo.loginAccount eq 'account04' || adminUserLoginInfo.loginAccount eq 'admin' }">
                <li data-id="4"> <a role="menuitem" href="#">市场与营销查询</a>
                  <ul class="menu-temp hide">
                    <li class="header">市场与营销查询</li>
                    <li class="treeview"> <a href="<%=request.getContextPath() %>/getSaleOrder"> <i class="fa fa-dashboard"></i> <span>销售信息查询</span> <i class="fa fa-angle-left pull-right"></i> </a>
                    </li>
                    <li class="treeview"> <a href="<%=request.getContextPath() %>/getSaleCustomer"> <i class="fa fa-dashboard"></i> <span>推广客户查询</span> <i class="fa fa-angle-left pull-right"></i> </a>
                    </li>
                    <li class="treeview"> <a href="<%=request.getContextPath() %>/getSaleStudent"> <i class="fa fa-dashboard"></i> <span>推广学员查询</span> <i class="fa fa-angle-left pull-right"></i> </a>
                    </li>
                    <li class="treeview"> <a href="<%=request.getContextPath() %>/getSaleStudentDyna"> <i class="fa fa-dashboard"></i> <span>推广学情查询</span> <i class="fa fa-angle-left pull-right"></i> </a>
                    </li>
                  </ul>
                </li>
                </c:if>
              </ul>
            </div>
          </li>
          <%-- 
          <li class="dropdown messages-menu"> <a href="<%=request.getContextPath() %>/static/#" class="dropdown-toggle" data-toggle="dropdown"> <i class="fa fa-envelope-o"></i> <span class="label label-success">4</span> </a>
            <ul class="dropdown-menu">
              <li class="header">You have 4 messages</li>
              <li> 
                <!-- inner menu: contains the actual data -->
                <ul class="menu">
                  <li><!-- start message --> 
                    <a href="<%=request.getContextPath() %>/static/#">
                    <div class="pull-left"> <img src="<%=request.getContextPath() %>/static/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image"> </div>
                    <h4> Support Team <small><i class="fa fa-clock-o"></i> 5 mins</small> </h4>
                    <p>Why not buy a new awesome theme?</p>
                    </a> </li>
                  <!-- end message -->
                  <li> <a href="<%=request.getContextPath() %>/static/#">
                    <div class="pull-left"> <img src="<%=request.getContextPath() %>/static/dist/img/user3-128x128.jpg" class="img-circle" alt="User Image"> </div>
                    <h4> AdminLTE Design Team <small><i class="fa fa-clock-o"></i> 2 hours</small> </h4>
                    <p>Why not buy a new awesome theme?</p>
                    </a> </li>
                  <li> <a href="<%=request.getContextPath() %>/static/#">
                    <div class="pull-left"> <img src="<%=request.getContextPath() %>/static/dist/img/user4-128x128.jpg" class="img-circle" alt="User Image"> </div>
                    <h4> Developers <small><i class="fa fa-clock-o"></i> Today</small> </h4>
                    <p>Why not buy a new awesome theme?</p>
                    </a> </li>
                  <li> <a href="<%=request.getContextPath() %>/static/#">
                    <div class="pull-left"> <img src="<%=request.getContextPath() %>/static/dist/img/user3-128x128.jpg" class="img-circle" alt="User Image"> </div>
                    <h4> Sales Department <small><i class="fa fa-clock-o"></i> Yesterday</small> </h4>
                    <p>Why not buy a new awesome theme?</p>
                    </a> </li>
                  <li> <a href="<%=request.getContextPath() %>/static/#">
                    <div class="pull-left"> <img src="<%=request.getContextPath() %>/static/dist/img/user4-128x128.jpg" class="img-circle" alt="User Image"> </div>
                    <h4> Reviewers <small><i class="fa fa-clock-o"></i> 2 days</small> </h4>
                    <p>Why not buy a new awesome theme?</p>
                    </a> </li>
                </ul>
              </li>
              <li class="footer"><a href="<%=request.getContextPath() %>/static/#">See All Messages</a></li>
            </ul>
          </li>
         
          <li class="dropdown notifications-menu"> <a href="<%=request.getContextPath() %>/static/#" class="dropdown-toggle" data-toggle="dropdown"> <i class="fa fa-bell-o"></i> <span class="label label-warning">10</span> </a>
            <ul class="dropdown-menu">
              <li class="header">You have 10 notifications</li>
              <li> 
                <!-- inner menu: contains the actual data -->
                <ul class="menu">
                  <li> <a href="<%=request.getContextPath() %>/static/#"> <i class="fa fa-users text-aqua"></i> 5 new members joined today </a> </li>
                  <li> <a href="<%=request.getContextPath() %>/static/#"> <i class="fa fa-warning text-yellow"></i> Very long description here that may not fit into the page and may cause design problems </a> </li>
                  <li> <a href="<%=request.getContextPath() %>/static/#"> <i class="fa fa-users text-red"></i> 5 new members joined </a> </li>
                  <li> <a href="<%=request.getContextPath() %>/static/#"> <i class="fa fa-shopping-cart text-green"></i> 25 sales made </a> </li>
                  <li> <a href="<%=request.getContextPath() %>/static/#"> <i class="fa fa-user text-red"></i> You changed your username </a> </li>
                </ul>
              </li>
              <li class="footer"><a href="<%=request.getContextPath() %>/static/#">View all</a></li>
            </ul>
          </li>
          <!-- Tasks: style can be found in dropdown.less -->
          <li class="dropdown tasks-menu"> <a href="<%=request.getContextPath() %>/static/#" class="dropdown-toggle" data-toggle="dropdown"> <i class="fa fa-flag-o"></i> <span class="label label-danger">9</span> </a>
            <ul class="dropdown-menu">
              <li class="header">You have 9 tasks</li>
              <li> 
                <!-- inner menu: contains the actual data -->
                <ul class="menu">
                  <li><!-- Task item --> 
                    <a href="<%=request.getContextPath() %>/static/#">
                    <h3> Design some buttons <small class="pull-right">20%</small> </h3>
                    <div class="progress xs">
                      <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"> <span class="sr-only">20% Complete</span> </div>
                    </div>
                    </a> </li>
                  <!-- end task item -->
                  <li><!-- Task item --> 
                    <a href="<%=request.getContextPath() %>/static/#">
                    <h3> Create a nice theme <small class="pull-right">40%</small> </h3>
                    <div class="progress xs">
                      <div class="progress-bar progress-bar-green" style="width: 40%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"> <span class="sr-only">40% Complete</span> </div>
                    </div>
                    </a> </li>
                  <!-- end task item -->
                  <li><!-- Task item --> 
                    <a href="<%=request.getContextPath() %>/static/#">
                    <h3> Some task I need to do <small class="pull-right">60%</small> </h3>
                    <div class="progress xs">
                      <div class="progress-bar progress-bar-red" style="width: 60%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"> <span class="sr-only">60% Complete</span> </div>
                    </div>
                    </a> </li>
                  <!-- end task item -->
                  <li><!-- Task item --> 
                    <a href="<%=request.getContextPath() %>/static/#">
                    <h3> Make beautiful transitions <small class="pull-right">80%</small> </h3>
                    <div class="progress xs">
                      <div class="progress-bar progress-bar-yellow" style="width: 80%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"> <span class="sr-only">80% Complete</span> </div>
                    </div>
                    </a> </li>
                  <!-- end task item -->
                </ul>
              </li>
              <li class="footer"> <a href="<%=request.getContextPath() %>/static/#">View all tasks</a> </li>
            </ul>
          </li>
           --%>
          <li class="dropdown user user-menu"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">
							<c:if test="${empty adminUserLoginInfo.userInfo.cardPhoto}">
			              		<img src="<%=request.getContextPath() %>/static/dist/img/images/user-placehoder.png" 	class="user-image" alt="User Image">
			              	</c:if>
			              	<c:if test="${not empty adminUserLoginInfo.userInfo.cardPhoto}">
			              		<img src="${adminUserLoginInfo.userInfo.cardPhoto }" 	class="user-image" alt="User Image">
			              	</c:if>
							<span class="hidden-xs">${adminUserLoginInfo.userInfo.name}</span> </a>
            <ul class="dropdown-menu">
              <!-- User image -->
              <li class="user-header">
              	<c:if test="${empty adminUserLoginInfo.userInfo.cardPhoto}">
              		<img src="<%=request.getContextPath() %>/static/dist/img/images/user-placehoder.png" 	class="img-circle" alt="User Image">
              	</c:if>
              	<c:if test="${not empty adminUserLoginInfo.userInfo.cardPhoto}">
              		<img src="${adminUserLoginInfo.userInfo.cardPhoto }" 	class="img-circle" alt="User Image">
              	</c:if>
                <p> 职位 <small>简介</small> </p>
              </li>
              
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-left"> <a href="#" class="btn btn-default btn-flat">我的资料</a> </div>
                <div class="pull-right"> <a href="<%=request.getContextPath() %>/logout" class="btn btn-default btn-flat">退出</a> </div>
              </li>
            </ul>
          </li>
          <!-- Control Sidebar Toggle Button --> 
          <!-- <li><a href="<%=request.getContextPath() %>/static/#" data-toggle="control-sidebar"> <i
							class="fa fa-gears"></i>
					</a></li> -->
        </ul>
      </div>
    </nav>
  </header>