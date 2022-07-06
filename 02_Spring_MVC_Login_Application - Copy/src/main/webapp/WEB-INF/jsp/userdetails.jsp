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
	<form action="userdetailsaction" method="post">
		First Name <input type="text" name="firstName"><br><br>
		Last Name <input type="text" name="lastName"><br><br>
		Gender <input type="radio" name="gender" value="Male"> Male<br>
		<input type="radio" name="gender" value="Female"> Female<br><br>
		Qualification <select name="qualification">
			<option>--- Select One ----</option>
			<option>Graduate</option>
			<option>Masters</option>
		</select><br><br>
		<input type="submit" value="Submit">
	</form>
		
	
</body>
</html>