<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
  </head>
  
  <body>
    显示所有组长的信息:<br/>
    <c:forEach items="${infoList }" var="info">
    	<a href="${pageContext.request.contextPath}/zuyuanController/list.do?zuzhangid=${info.id}">${info.id }====>${info.name }=====>${info.birthday }</a>
    	
    	<a href="${pageContext.request.contextPath}/infoController/editUI.do?id=${info.id}">修改</a> &nbsp;&nbsp;
    	<a href="${pageContext.request.contextPath}/infoController/delete.do?id=${info.id }">删除</a>
    	<br/>
    
    </c:forEach>
    
    <a href="${pageContext.request.contextPath}/infoController/addUI.do">新增</a>
  </body>
</html>
