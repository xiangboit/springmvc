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
    显示组长${info.name }的组员信息:<br/>
    <c:forEach items="${info.zuyuan }" var="info">
    	${info.id }====>${info.name }=====>${info.birthday }
    	
    	<a href="${pageContext.request.contextPath}/zuyuanController/editUI.do?id=${info.id}">修改</a> &nbsp;&nbsp;
    	<a href="${pageContext.request.contextPath}/zuyuanController/delete.do?id=${info.id }">删除</a>
    	<br/>
    
    </c:forEach>
    
    <a href="${pageContext.request.contextPath}/zuyuanController/addUI.do?zuzhangid=${info.id}">新增</a>
  </body>
</html>
