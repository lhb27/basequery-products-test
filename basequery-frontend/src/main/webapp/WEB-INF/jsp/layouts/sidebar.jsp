 <%@ page contentType="text/html; charset=UTF-8"%>
<aside class="main-sidebar">
    <section class="sidebar">
      <div class="user-panel">
        <%--
        <div class="pull-left image"> 
        <c:if test="${empty adminUserInfo.cardPhoto}">
       		<img src="<%=request.getContextPath() %>/static/dist/img/images/user-placehoder.png" 	class="user-image"  width="25px" height="25px" alt="User Image">
       	</c:if>
       	<c:if test="${not empty adminUserInfo.cardPhoto}">
       		<img src="${adminUserInfo.cardPhoto }" 	class="user-image" width="25px" height="25px" alt="User Image">
       	</c:if>
         </div>
        <div class="pull-left info">
          <p>管理员</p>
       	 --%>
    <%-- 
          <a href="<%=request.getContextPath() %>/static/#"><i class="fa fa-circle text-success"></i> 在线</a> 
          </div>
          --%>
      </div>
      <!-- search form (Optional)
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="搜索...">
          <span class="input-group-btn">
          <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i></button>
          </span> </div>
      </form>
       -->
      <!-- /.search form -->
      <ul class="sidebar-menu"></ul>
    </section>
    <!-- /.sidebar --> 
  </aside>