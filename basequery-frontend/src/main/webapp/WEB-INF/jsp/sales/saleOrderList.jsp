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
				  <label class="control-label col-sm-3">下单时间</label>
				  <div class="col-sm-4">
					<input type="hidden"  value="addDate"  name="conditions[0].fieldName"/> 
					<input type="hidden"  value="LESS2GREAT"  name="conditions[0].rangeType"/> 
					<input type="text" class="form-control " value="${queryCondition.conditions[0].rangeFrom}"   id="addDateId01" name="conditions[0].rangeFrom">
				  </div>
				  <div class="col-sm-1" style="text-align: center;line-height: 34px;">
					至
				  </div>
				   <div class="col-sm-4">
					<input type="text" class="form-control "   value="${queryCondition.conditions[0].rangeTo}"  id="addDateId02" name="conditions[0].rangeTo">
				  </div>
				</div>
			  </div>
			    <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">订单状态</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="orderStatus"  name="conditions[6].fieldName"/> 
              	<input type="hidden"  value="EQUAL"  name="conditions[6].rangeType"/> 
                <select class="form-control" name="conditions[6].rangeFrom">
                  <option value="" >全部</option>
                  <option value="0"  <c:if test="${queryCondition.conditions[6].rangeFrom == '0'}" >selected</c:if>>未完成</option>
                  <option value="1" <c:if test="${queryCondition.conditions[6].rangeFrom == '1'}" >selected</c:if>>待发货</option>
                  <option value="2" <c:if test="${queryCondition.conditions[6].rangeFrom == '2'}" >selected</c:if> >待发货</option>
                  <option value="3" <c:if test="${queryCondition.conditions[6].rangeFrom == '3'}" >selected</c:if> >交易成功</option>
                  <option value="4" <c:if test="${queryCondition.conditions[6].rangeFrom == '4'}" >selected</c:if> >交易关闭</option>
                  <option value="5" <c:if test="${queryCondition.conditions[6].rangeFrom == '5'}" >selected</c:if> >退费申请中</option>
                  <option value="6" <c:if test="${queryCondition.conditions[6].rangeFrom == '6'}" >selected</c:if> >部分退费</option>
                  <option value="7" <c:if test="${queryCondition.conditions[6].rangeFrom == '7'}" >selected</c:if> >已退费</option>
                  <option value="8" <c:if test="${queryCondition.conditions[6].rangeFrom == '8'}" >selected</c:if> >申请退费</option>
                  <option value="9" <c:if test="${queryCondition.conditions[6].rangeFrom == '9'}" >selected</c:if> >待退费</option>
                  <option value="10" <c:if test="${queryCondition.conditions[6].rangeFrom == '10'}" >selected</c:if> >待退费</option>
                </select>
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">支付状态</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="payStatus"  name="conditions[7].fieldName"/> 
              	<input type="hidden"  value="EQUAL"  name="conditions[7].rangeType"/> 
                <select class="form-control" name="conditions[7].rangeFrom">
              	  <option value="" >全部</option>
                  <option value="Y"  <c:if test="${queryCondition.conditions[7].rangeFrom == 'Y'}" >selected</c:if>>未支付</option>
                  <option value="N" <c:if test="${queryCondition.conditions[7].rangeFrom == 'N'}" >selected</c:if> >已支付</option>
                </select> 
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">订单号</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="orderSn"  name="conditions[8].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[8].rangeType"/> 
                 <input type="text" class="form-control "   value="${queryCondition.conditions[8].rangeFrom}"  name="conditions[8].rangeFrom">
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">院校</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="schoolChineseName"  name="conditions[1].fieldName"/> 
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
                <input type="text" class="form-control "   value="${queryCondition.conditions[2].rangeFrom}"  name="conditions[2].rangeFrom">
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">产品</label>
              <div class="col-sm-9">
                <input type="hidden"  value="productName"  name="conditions[3].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[3].rangeType"/> 
                 <input type="text" class="form-control "   value="${queryCondition.conditions[3].rangeFrom}"   name="conditions[3].rangeFrom">
              </div>
            </div>
          </div>
          <div class="col-md-12">
            <div class="form-group">
              <label class="control-label col-sm-3">销售人员</label>
              <div class="col-sm-9">
              	<input type="hidden"  value="staffName"  name="conditions[4].fieldName"/> 
              	<input type="hidden"  value="INCLUDE"  name="conditions[4].rangeType"/> 
                <input type="text" class="form-control "  value="${queryCondition.conditions[4].rangeFrom}"   name="conditions[4].rangeFrom">
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
        <th>销售人员</th>     
        <th>学员</th>
        <th>网院</th>
        <th>学习中心</th>
        <th>产品</th>
        <th>订单号</th>
        <th>订单状态</th>
        <th>支付状态</th>
        <th>下单时间</th>
        </tr>
      </thead>
      <tbody>
        <c:choose>
        	<c:when test="${not empty resultMap.resultSet }">
        	<c:forEach items="${resultMap.resultSet }"  var="resultSet">
        <tr>
		          <td><input type="checkbox"></td>
		      	  <td>${resultSet.staffName }</td>
		          <td>	${resultSet.studentName }<c:if test="${ empty resultSet.studentName }">暂无</c:if></td>
		          <td>	${resultSet.schoolChineseName }<c:if test="${ empty resultSet.schoolChineseName }">暂无</c:if></td>
		          <td>${resultSet.learncenterName }<c:if test="${ empty resultSet.learncenterName }">暂无</c:if></td>
		          <td>${resultSet.productName }<c:if test="${ empty resultSet.productName }">暂无</c:if></td>
		          <td>${resultSet.orderSn }<c:if test="${ empty resultSet.orderSn }">暂无</c:if></td>
		          <td>${resultSet.orderStatusName}<c:if test="${ empty resultSet.orderStatusName }">暂无</c:if></td>
		          <td>${resultSet.payStatusName}<c:if test="${ empty resultSet.payStatusName }">暂无</c:if></td>
		         <td><fmt:formatDate  value="${resultSet.addDate }"  type="both" pattern="yyyy-MM-dd " /></td>
        </tr>
          	</c:forEach>
          	</c:when>
          	<c:otherwise>
          			<td colspan="9"  align="center">暂无数据</td>
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

    $("#addDateId01").datepicker();  
    $("#addDateId02").datepicker({  
        onSelect: function(dateText,inst){  
            var time=dateText.split("-");  
            var year = time[0];  
            var month = time[1];  
            var day = time[2];  
            $("#addDateId01").datepicker(  
                'option', 'minDate', new Date(year, month - 1, day)  
            );  
        }  
    });  
</script>
</html>