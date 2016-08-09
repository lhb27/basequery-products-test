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
  平台查询
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
					<input type="text" class="form-control "  value="${queryCondition.conditions[0].rangeFrom}"   id="createdDtId01" name="conditions[0].rangeFrom">
				  </div>
				  <div class="col-sm-1" style="text-align: center;line-height: 34px;">
					至
				  </div>
				   <div class="col-sm-4">
					<input type="text" class="form-control "   value="${queryCondition.conditions[0].rangeTo}"  id="createdDtId02" name="conditions[0].rangeTo">
				  </div>
				</div>
			  </div>
			  <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">学籍状态</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="rollStatus"  name="conditions[6].fieldName"/> 
              	<input type="hidden"  value="EQUAL"  name="conditions[6].rangeType"/> 
                  <select class="form-control" name="conditions[6].rangeFrom">
                  <option value="">全部</option>
                  <option value="1"  <c:if test="${queryCondition.conditions[6].rangeFrom == '1'}" >selected</c:if> >开除学籍</option>
                  <option value="2" <c:if test="${queryCondition.conditions[6].rangeFrom == '2'}" >selected</c:if> >正常注册</option>
                  <option value="3" <c:if test="${queryCondition.conditions[6].rangeFrom == '3'}" >selected</c:if> >未正常注册</option>
                  <option value="4" <c:if test="${queryCondition.conditions[6].rangeFrom == '4'}" >selected</c:if> >休学</option>
                  <option value="5" <c:if test="${queryCondition.conditions[6].rangeFrom == '5'}" >selected</c:if> >退学</option>
                  <option value="6" <c:if test="${queryCondition.conditions[6].rangeFrom == '6'}" >selected</c:if> >学习期限已过</option>
                  <option value="7" <c:if test="${queryCondition.conditions[6].rangeFrom == '7'}" >selected</c:if> >延期</option>
                </select>
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">院校</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="schoolchinesename"  name="conditions[1].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[1].rangeType"/> 
                 <input type="text" class="form-control "  value="${queryCondition.conditions[1].rangeFrom}"    name="conditions[1].rangeFrom">
              </div>
            </div>
          </div>
           <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">学习中心</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="learncenterName"  name="conditions[2].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[2].rangeType"/> 
                <input type="text" class="form-control "  value="${queryCondition.conditions[2].rangeFrom}"     name="conditions[2].rangeFrom">
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">单位</label>
              <div class="col-sm-9">
                <input type="hidden"  value="customerName"  name="conditions[3].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[3].rangeType"/> 
                 <input type="text" class="form-control "    value="${queryCondition.conditions[3].rangeFrom}"  name="conditions[3].rangeFrom">
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">产品名称</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="productName"  name="conditions[4].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[4].rangeType"/> 
                <input type="text" class="form-control "   value="${queryCondition.conditions[4].rangeFrom}"   name="conditions[4].rangeFrom">
              </div>
            </div>
          </div>
                <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">年级</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="gradeName"  name="conditions[5].fieldName"/> 
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
        <th>院校</th>
        <th>学习中心</th>
        <th>单位</th>
        <th>产品类别</th>
        <th>产品</th>
        <th>级/培训期</th>
        <th>层次</th>
        <th>学籍状态</th>
        <th>学制</th>
        <th>学习开始时间</th>
        <th>学习结束时间</th>
        </tr>
      </thead>
      <tbody>
        <c:choose>
        	<c:when test="${not empty resultMap.resultSet }">
        	<c:forEach items="${resultMap.resultSet }"  var="resultSet">
        <tr>
		          <td><input type="checkbox"></td>
		          <td>${resultSet.studentName }</td>
		          <td>	${resultSet.schoolChineseName }<c:if test="${ empty resultSet.schoolChineseName }">暂无</c:if></td>
		          <td>	${resultSet.learncenterName }<c:if test="${ empty resultSet.learncenterName }">暂无</c:if></td>
		          <td>${resultSet.customerName }<c:if test="${ empty resultSet.customerName }">暂无</c:if></td>
		          <td>${resultSet.productTypeName }<c:if test="${ empty resultSet.productTypeName }">暂无</c:if></td>
		          <td>${resultSet.productName }<c:if test="${ empty resultSet.productName }">暂无</c:if></td>
		          <td>${resultSet.gradeName }<c:if test="${ empty resultSet.gradeName }">暂无</c:if></td>
		          <td>${resultSet.educationLevelName }<c:if test="${ empty resultSet.educationLevelName }">暂无</c:if></td>
		          <td>${resultSet.rollStatusName }<c:if test="${ empty resultSet.rollStatusName }">暂无</c:if></td>
		          <td>${resultSet.studyPeriod }<c:if test="${ empty resultSet.studyPeriod }">暂无</c:if></td>
		          <td><fmt:formatDate  value="${resultSet.learningStart }"  type="both" pattern="yyyy-MM-dd " /></td>
		          <td><fmt:formatDate  value="${resultSet.learningEnd }"  type="both" pattern="yyyy-MM-dd " /></td>
        </tr>
          	</c:forEach>
          	</c:when>
          	<c:otherwise>
          			<td colspan="12"  align="center">暂无数据</td>
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
    $("#createdDtId01").datepicker();  
    $("#createdDtId02").datepicker({  
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
