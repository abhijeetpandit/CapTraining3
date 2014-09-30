<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b>CreateEmployee</b><br/><br/>
	${message}<br/><br/>
	<form action="saveEmployee" method="get">
	Employee id : <input type="text" name="employeeId"> <br/><br/>
	First name : <input type="text" name="firstName"> <br/><br/>
	Last name : <input type="text" name="lastName"> <br/><br/>
	department : <input type="text" name="department"> <br/><br/>
	
	<br/><br/>
	
	ADDRESS:-  <br/><br/>
	
	Area : <input type="text" name="address.area"> <br/><br/>
	Street : <input type="text" name="address.street"> <br/><br/>
	City : <input type="text" name="address.city"> <br/><br/>
	State : <input type="text" name="address.state"> <br/><br/>
	Country : <input type="text" name="address.country"> <br/><br/>
	
	<input type="submit" value="Save">
	</form>
</body>
</html>