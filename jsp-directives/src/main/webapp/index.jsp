<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Century Link</title>

<style type="text/css">

ul>li{
display:inline;
padding : 10px  10px;
}
</style>
</head>
<body>

<c:set var="title" value="Lumen Technologies" scope="page"/>
<h1 style-align:center; color:"0000ff" > </h1>


<c:out value="${title}"></c:out>


<%@ include file="mneu.html" %>

</body>
</html>