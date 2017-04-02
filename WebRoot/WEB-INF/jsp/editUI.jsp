<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
  </head>
  
  <body>
     <form name="" method="post" action="${pageContext.request.contextPath}/infoController/edit.do">
     	
     	<input type="hidden" name="id" value="${info.id }" />
     	用户名:<input type="text" name="name" value="${info.name }"/><br/>
     	
     	生日:<input type="text" name="birthday" value="${info.birthday }"/><br/>
     	
     	<input  type="submit" value="修改" />
     
     </form>
  </body>
</html>
