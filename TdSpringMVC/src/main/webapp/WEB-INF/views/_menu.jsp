<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
</head>
<body>

<div style="border: 1px solid #ccc;padding:5px;margin-bottom:20px;">

  <a href="${pageContext.request.contextPath}/welcome">Home</a>

  | &nbsp;
 
   <a href="${pageContext.request.contextPath}/userInfo">User Info</a>
 
  | &nbsp;
 
  <a href="${pageContext.request.contextPath}/admin">Admin</a>
 
  <c:if test="${pageContext.request.userPrincipal.name != null}">
 
     | &nbsp;
     <a href="${pageContext.request.contextPath}/logout">Logout</a>
    
  </c:if>
 
</div>

</body>
</html>