<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Show All Books</title>


<style type ="text/css">

table{
 border: 2px solid blue;
 border-collapse:collapse;
 margin-left :auto;
 margin-left :auto;
}
tr,td,th{

 border: 2px solid blue;
 }

</style>


</head>
<body>

<%@include file="mneu.html" %>

<table>
  <tr>
    <th> S.No  </th>
    <th> Book Name </th>
  </tr>
  <c:forEach items="${requestScope.bookList}" var=eachBook varStatus="status"> 

  <tr>

    <td> <c:out value="${status.index+1}"></c:out></td>
    <td> <c:out value="${eachBook}"></c:out></td>
  </tr>

  </c:forEach>

</table>

</body>
</html>