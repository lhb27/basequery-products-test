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
   -->
</section>
<section class="content">
  <div class="box">
     <div class="box-body">
     <form method="post">
	    <div class="box-footer fr left120" style="border-top:0;">
	      <div><button type="submit" class="btn btn-primary">搜索</button></div>
	      <div class="margin_t20"><button type="button" class="btn btn-default down_btn">高级搜索</button></div>
	    </div>
    
      <div class="form-horizontal oh slide_box">
        <div class="row reset-form-horizontal pad-t15">
          
       <div class="col-md-12	">
				<div class="form-group">
				  <label class="control-label col-sm-3">入学时间</label>
				  <div class="col-sm-4">
					<input type="hidden"  value="createdDt"  name="conditions[0].fieldName"/> 
					<input type="hidden"  value="LESS2GREAT"  name="conditions[0].rangeType"/> 
					<input type="text" class="form-control "  value="${queryCondition.conditions[0].rangeFrom}"  id="createdDtId01" name="conditions[0].rangeFrom">
				  </div>
				  <div class="col-sm-1" style="text-align: center;line-height: 34px;">
					至
				  </div>
				   <div class="col-sm-4">
					<input type="text" class="form-control "  value="${queryCondition.conditions[0].rangeTo}"   id="createdDtId02" name="conditions[0].rangeTo">
				  </div>
				</div>
			  </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">院校</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="schoolChineseName"  name="conditions[1].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[1].rangeType"/> 
                 <input type="text" class="form-control "  value="${queryCondition.conditions[1].rangeFrom}"   name="conditions[1].rangeFrom">
              </div>
            </div>
          </div>
           <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">省</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="productName"  name="conditions[2].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[2].rangeType"/> 
                <input type="text" class="form-control "   value="${queryCondition.conditions[2].rangeFrom}"  name="conditions[2].rangeFrom">
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">单位</label>
              <div class="col-sm-9">
                <input type="hidden"  value="customerName"  name="conditions[3].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[3].rangeType"/> 
                 <input type="text" class="form-control "  value="${queryCondition.conditions[3].rangeFrom}"   name="conditions[3].rangeFrom">
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">产品名称</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="productName"  name="conditions[4].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[4].rangeType"/> 
                <input type="text" class="form-control "    value="${queryCondition.conditions[4].rangeFrom}"  name="conditions[4].rangeFrom">
              </div>
            </div>
          </div>
                <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">学员</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="studentName"  name="conditions[5].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[5].rangeType"/> 
                <input type="text" class="form-control "   value="${queryCondition.conditions[5].rangeFrom}"   name="conditions[5].rangeFrom">
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
        <th>学员</th>     
        <th>性别</th>
        <th>身份证</th>
        <th>所属单位</th>
        <th>报读网院</th>
        <th>报读产品</th>
        <th>培养层次</th>
        <th>省</th>
        <th>市</th>
        <th>区</th>
        </tr>
      </thead>
      <tbody>
        <c:choose>
        	<c:when test="${not empty resultMap.resultSet }">
        	<c:forEach items="${resultMap.resultSet }"  var="resultSet">
        <tr>
		          <td><input type="checkbox"></td>
		          <td>${resultSet.studentName}</td>
		          <td>
		          		${resultSet.sex}<c:if test="${ empty resultSet.sex }">暂无</c:if>
		          </td>
		          <td>${resultSet.idCard }<c:if test="${ empty resultSet.idCard }">暂无</c:if></td>
		          <td>${resultSet.customerName }<c:if test="${ empty resultSet.customerName }">暂无</c:if></td>
		          <td>${resultSet.schoolChineseName }</td>
		          <td>${resultSet.productName }</td>
		          <td>${resultSet.educationLevelName }<c:if test="${ empty resultSet.educationLevelName}">暂无</c:if></td>
		          <td>${resultSet.provinceName }<c:if test="${ empty resultSet.provinceName }">暂无</c:if></td>
		          <td>${resultSet.cityName }<c:if test="${ empty resultSet.cityName }">暂无</c:if></td>
		          <td>${resultSet.districtName }<c:if test="${ empty resultSet.districtName }">暂无</c:if></td>
        </tr>
          	</c:forEach>
          	</c:when>
          	<c:otherwise>
          			<td colspan="10"  align="center">暂无数据</td>
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
    $("#createdDtId01").datepicker({language: 'zh-CN', autoclose: true, todayHighlight: true});  
    $("#createdDtId02").datepicker({language: 'zh-CN',autoclose: true, todayHighlight: true,
        onSelect: function(dateText,inst){  
            var time=dateText.split("-");  
            var year = time[0];  
            var month = time[1];  
            var day = time[2];  
            $("#createdDtId02").datepicker(  
                'option', 'minDate', new Date(year, month - 1, day)  
            );  
        }  
    });  
</script>
</html>
