<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Page</title>
</head>
<body>

<p> Row Added: </p><c:out value="${rowAdded}"/>

<form:form method="post" action="customers"> 

<frorm:label path="id">Customer ID </frorm:label>
<form:input path = "id"/>

<frorm:label path="customerName">Customer Name </frorm:label>
<form:input path = "customerName"/>

<frorm:label path="email">Customer Email </frorm:label>
<form:input path = "email"/>

<input type="submit" value="Submit"/>
</form:form>

</body>
</html>