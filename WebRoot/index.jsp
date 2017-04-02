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
    显示所有的信息:<br/>
    <c:forEach items="${infoList }" var="info">
    	${info.id }====>${info.name }=====>${info.birthday }<br/>
    
    </c:forEach>
  </body>
</html>
