<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1>Pincode Details</h1>
<table>
<tr>
<th>Pincode</th>
<th>Location</th>

</tr>
<c:forEach items="${data}" var="data" varStatus="tagStatus">
  <tr>
    <td>${data.pincode}</td>
    <td>${data.location}</td>
  </tr>
</c:forEach>
</table>
</body>
</html>