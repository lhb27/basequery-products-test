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
  产品查询
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
	      <!-- <div class="pull-right"><button type="button" class="btn btn-default">重置</button></div> -->
	      <div><button type="submit" class="btn btn-primary">搜索</button></div>
	      <div class="margin_t20"><button type="button" class="btn btn-default down_btn">高级搜索</button></div>
	    </div>
    
      <div class="form-horizontal oh slide_box">
        <div class="row reset-form-horizontal pad-t15">
          
       <div class="col-md-12	">
				<div class="form-group">
				  <label class="control-label col-sm-3">产品报名时间</label>
				  <div class="col-sm-4">
					<input type="hidden"  value="applyStartDt"  name="conditions[0].fieldName"/> 
					<input type="hidden"  value="EQUAL_GREATER"  name="conditions[0].rangeType"/> 
					<input type="text" class="form-control "  value="${queryCondition.conditions[0].rangeFrom}"   id="applyStartDtId" name="conditions[0].rangeFrom">
				  </div>
				  <div class="col-sm-1" style="text-align: center;line-height: 34px;">
					至
				  </div>
				   <div class="col-sm-4">
					<input type="hidden"  value="applyEndDt"  name="conditions[1].fieldName"/> 
					<input type="hidden"  value="EQUAL_LESS"  name="conditions[1].rangeType"/> 
					<input type="text" class="form-control "  value="${queryCondition.conditions[1].rangeFrom}"  id="applyEndDtId" name="conditions[1].rangeFrom">
				  </div>
				</div>
			  </div>
			  <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">上架状态</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="onShelvesStatus"  name="conditions[5].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[5].rangeType"/> 
                <select class="form-control" name="conditions[5].rangeFrom">
                  <option value="" >全部</option>
                  <option value="N"  <c:if test="${queryCondition.conditions[5].rangeFrom == 'N'}" >selected</c:if> >待审核或者未上架</option>
                  <option value="Y" <c:if test="${queryCondition.conditions[5].rangeFrom == 'Y'}" >selected</c:if> >审核通过或者已上架</option>
                  <option value="O" <c:if test="${queryCondition.conditions[5].rangeFrom == 'O'}" >selected</c:if> >审核不通过</option>
                </select>
              </div>
            </div>
          </div>
           <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">销售状态</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="salesStatus"  name="conditions[6].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[6].rangeType"/> 
                <select class="form-control" name="conditions[6].rangeFrom">
                  <option value="" >全部</option>
                  <option value="A" <c:if test="${queryCondition.conditions[6].rangeFrom == 'A'}" >selected</c:if> >在售</option>
                  <option value="B" <c:if test="${queryCondition.conditions[6].rangeFrom == 'B'}" >selected</c:if> >预售</option>
                  <option value="C" <c:if test="${queryCondition.conditions[6].rangeFrom == 'C'}" >selected</c:if> >停售</option>
                </select>
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">网院</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="schoolChineseName"  name="conditions[2].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[2].rangeType"/> 
                 <input type="text" class="form-control "    value="${queryCondition.conditions[2].rangeFrom}" name="conditions[2].rangeFrom">
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">年级</label>
              <div class="col-sm-9">
                <input type="hidden"  value="gradeTerm"  name="conditions[3].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[3].rangeType"/> 
                 <input type="text" class="form-control "   value="${queryCondition.conditions[3].rangeFrom}"  name="conditions[3].rangeFrom">
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">产品名称</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="productName"  name="conditions[4].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[4].rangeType"/> 
                <input type="text" class="form-control "   value="${queryCondition.conditions[4].rangeFrom}"  name="conditions[4].rangeFrom">
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
        <th>产品分类</th>
        <th>产品名称</th>
        <th>学费说明</th>
        <th>学习周期</th>
        <th>学时</th>
        <th>年级/培训期</th>
        <th>报读基数</th>
        <th>销售状态</th>
        <th>销售模式</th>
        <th>收费审核状态</th>
        <th>上架审核状态</th>
        <th>报名开始时间</th>
        <th>报名结束时间</th>
        </tr>
      </thead>
      <tbody>
        <c:choose>
        	<c:when test="${not empty resultMap.resultSet }">
        	<c:forEach items="${resultMap.resultSet }"  var="resultSet">
        <tr>
		          <td><input type="checkbox"></td>
		          <td>${resultSet.schoolChineseName }</td>
		          <td>${resultSet.productCode }<c:if test="${ empty resultSet.productCode }">暂无</c:if></td>
		          <td>${resultSet.productName }<c:if test="${ empty resultSet.productName }">暂无</c:if></td>
		          <td>${resultSet.feeDesc }<c:if test="${ empty resultSet.feeDesc }">暂无</c:if></td>
		          <td>${resultSet.studyPreriod }<c:if test="${ empty resultSet.studyPreriod }">暂无</c:if></td>
		          <td>${resultSet.productHour }<c:if test="${ empty resultSet.productHour }">暂无</c:if></td>
		          <td>${resultSet.gradeName }<c:if test="${ empty resultSet.gradeName }">暂无</c:if></td>
		          <td>${resultSet.baseNum }<c:if test="${ empty resultSet.baseNum }">暂无</c:if></td>
		          <td>${resultSet.salesStatusName }<c:if test="${ empty resultSet.salesStatusName }">暂无</c:if></td>
		          <td>${resultSet.salesModelName}<c:if test="${ empty resultSet.salesModelName }">暂无</c:if></td>
		          <td>${resultSet.feeAuditStatusName }<c:if test="${ empty resultSet.feeAuditStatusName }">暂无</c:if></td>
		          <td>${resultSet.onShelvesStatusName} <c:if test="${ empty resultSet.onShelvesStatusName }">暂无</c:if></td>
		          <td><fmt:formatDate  value="${resultSet.applyStartDt }"  type="both" pattern="yyyy-MM-dd " /></td>
		          <td><fmt:formatDate  value="${resultSet.applyEndDt }"  type="both" pattern="yyyy-MM-dd " /></td>
        </tr>
          	</c:forEach>
          	</c:when>
          	<c:otherwise>
          			<td colspan="14" align="center">暂无数据</td>
          	</c:otherwise>
           </c:choose>
      </tbody>
      </table>
      <jsp:include page="/WEB-INF/jsp/common/pagination.jsp"/>
   </form>
    </div>
  </div>
</section>
<jsp:include page="/WEB-INF/jsp/layouts/footer.jsp" />
</body>
<script>
    $("#applyStartDtId").datepicker({language: 'zh-CN', autoclose: true, todayHighlight: true});  
    $("#applyEndDtId").datepicker({language: 'zh-CN',autoclose: true, todayHighlight: true,
        onSelect: function(dateText,inst){  
            var time=dateText.split("-");  
            var year = time[0];  
            var month = time[1];  
            var day = time[2];  
            $("#applyEndDtId").datepicker(  
                'option', 'minDate', new Date(year, month - 1, day)  
            );  
        }  
    });  
</script>
</html>
