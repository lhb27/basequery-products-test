<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html class="reset">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>远程教育数据中心</title>
<jsp:include page="/WEB-INF/jsp/common/jslibs.jsp"/>
</head>
<body class="inner-page-body">
  <!-- 
<section class="content-header">
  <h1>
  课程查询
  </h1>
  <ol class="breadcrumb">
    <li><a href="/"><i class="fa fa-home"></i> 首页</a></li>
    <li class="active">产品查询</li>
  </ol>
</section>
   -->
<section class="content">
  <div class="box">
     <div class="box-body">
     <form method="post">
	    <div class="box-footer fr left120" style="border-top:0;">
	      <div><button type="button" class="btn btn-primary">搜索</button></div>
	      <div class="margin_t20"><button type="button" class="btn btn-default down_btn">高级搜索</button></div>
	    </div>
    
      <div class="form-horizontal oh slide_box">
        <div class="row reset-form-horizontal pad-t15">
          
       <div class="col-md-12	">
				<div class="form-group">
				  <label class="control-label col-sm-3">发布时间</label>
				  <div class="col-sm-4">
					<input type="hidden"  value="publishDt"  name="conditions[0].fieldName"/> 
					<input type="hidden"  value="LESS2GREAT"  name="conditions[0].rangeType"/> 
					<input type="text" class="form-control "   value="${queryCondition.conditions[0].rangeFrom}"  id="publishDtId01" name="conditions[0].rangeFrom">
				  </div>
				  <div class="col-sm-1" style="text-align: center;line-height: 34px;">
					至
				  </div>
				   <div class="col-sm-4">
					<input type="text" class="form-control "   value="${queryCondition.conditions[0].rangeTo}"  id="publishDtId02" name="conditions[0].rangeTo">
				  </div>
				</div>
			  </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">院校</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="schoolChineseName"  name="conditions[1].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[1].rangeType"/> 
                 <input type="text" class="form-control "   value="${queryCondition.conditions[1].rangeFrom}" name="conditions[1].rangeFrom">
              </div>
            </div>
          </div>
           <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">课程</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="courseName"  name="conditions[2].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[2].rangeType"/> 
                <input type="text" class="form-control "   value="${queryCondition.conditions[2].rangeFrom}" name="conditions[2].rangeFrom">
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">课程类型</label>
              <div class="col-sm-9">
                <input type="hidden"  value="courseType"  name="conditions[3].fieldName"/> 
              	<input type="hidden"  value="EQUAL"  name="conditions[3].rangeType"/> 
              	<select class="form-control" name="conditions[3].rangeFrom">
              		<option value="" >全部</option>
                 	<option value="1" <c:if test="${queryCondition.conditions[3].rangeFrom == '1'}" >selected</c:if> >网络课程</option>
                    <option value="4" <c:if test="${queryCondition.conditions[3].rangeFrom == '4'}" >selected</c:if> >微课程</option>
                </select>
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">课程状态</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="courseStatus"  name="conditions[4].fieldName"/> 
              	<input type="hidden"  value="EQUAL"  name="conditions[4].rangeType"/> 
                <select class="form-control" name="conditions[4].rangeFrom">
                  <option value="" >全部</option>
                  <option value="active"  <c:if test="${queryCondition.conditions[3].rangeFrom == 'active'}" >selected</c:if> >已发布</option>
                  <option value="closed" <c:if test="${queryCondition.conditions[3].rangeFrom == 'closed'}" >selected</c:if> >已关闭</option>
                  <option value="editing" <c:if test="${queryCondition.conditions[3].rangeFrom == 'editing'}" >selected</c:if> >编辑中</option>
                </select>
              </div>
            </div>
          </div>
         
        </div>
      </div>
    </div> 
    </div> 
  
  <div class="box margin-bottom-none">
    <div class="box-header with-border">
      <div class="fr">
      <!-- 
        <button class="btn btn-block btn-success btn-outport"><i class="fa fa-fw fa-sign-out"></i> 导出学员信息</button>
         -->
      </div>
    </div>
    <div class="box-body">
      <table id="dtable" class="table table-bordered table-striped table-container">
      <thead>
        <tr>
        <th><input type="checkbox" class="select-all"></th>
        <th>院校</th>     
        <th>课程状态</th>
        <th>课程类型</th>
        <th>发布时间</th>
        <th>课程</th>
        <th>创建时间</th>
        </tr>
      </thead>
      <tbody>
        <c:choose>
        	<c:when test="${not empty resultMap.resultSet }">
        	<c:forEach items="${resultMap.resultSet }"  var="resultSet">
        <tr>
		          <td><input type="checkbox"></td>
		          <td>${resultSet.schoolChineseName }<c:if test="${ empty resultSet.schoolChineseName }">暂无</c:if></td>
		          <td>${resultSet.courseStatusName}<c:if test="${ empty resultSet.courseStatusName }">暂无</c:if></td>
		          <td>${resultSet.courseTypeName}<c:if test="${ empty resultSet.courseTypeName }">暂无</c:if></td>
		          <td><fmt:formatDate  value="${resultSet.publishDt }"  type="both" pattern="yyyy-MM-dd " /></td>
		          <td>${resultSet.courseName }<c:if test="${ empty resultSet.courseName }">暂无</c:if></td>
		          <td><fmt:formatDate  value="${resultSet.createdDt }"  type="both" pattern="yyyy-MM-dd " /></td>
        </tr>
          	</c:forEach>
          	</c:when>
          	<c:otherwise>
          			<td colspan="7"  align="center">暂无数据</td>
          	</c:otherwise>
           </c:choose>
      </tbody>
      </table>
      <jsp:include page="/WEB-INF/jsp/common/pagination.jsp"/>
      </form>
    </div>
  </div>
<jsp:include page="/WEB-INF/jsp/layouts/footer.jsp" />
</section>
</body>
<script>
    $("#publishDtId01").datepicker({language: 'zh-CN', autoclose: true, todayHighlight: true});  
    $("#publishDtId02").datepicker({language: 'zh-CN',autoclose: true, todayHighlight: true,
        onSelect: function(dateText,inst){  
            var time=dateText.split("-");  
            var year = time[0];  
            var month = time[1];  
            var day = time[2];  
            $("#publishDtId02").datepicker(  
                'option', 'minDate', new Date(year, month - 1, day)  
            );  
        }  
    });  
</script>
</html>
