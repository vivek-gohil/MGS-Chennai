<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
	<h3>User Details</h3>
	<hr>
	<%-- 	<h4>Full Name ${fullName}</h4> --%>
	<%-- 	<h4>Gender ${gender}</h4> --%>
	<%-- 	<h4>Qualification ${qualification}</h4> --%>

	<h4>Full Name ${ userDetails.firstName} ${userDetails.lastName}</h4>
	<h4>Gender ${userDetails.gender}</h4>
	<h4>Qualification ${userDetails.qualification }</h4>

</body>
</html>