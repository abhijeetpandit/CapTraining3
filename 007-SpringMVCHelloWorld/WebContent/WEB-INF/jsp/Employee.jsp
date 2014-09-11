<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Employee:<br/><br/><br/>
	
	
	<table border=1>
		<tr>
			<th>KIN id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Mobile</th>
			<th>email</th>
		</tr>
		<c:forEach items="${employees}" var="empObj">
			<tr>
				<td>${empObj.kinId}</td>
				<td>${empObj.empFirstName}</td>
				<td>${empObj.empLastName}</td>
				<td>${empObj.mobileNo}</td>
				<td>${empObj.emailId}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>