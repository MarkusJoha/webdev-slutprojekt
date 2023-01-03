<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>OpenWeather</title>
</head>
<body>

		<form action="OWservlet" method="get" >
			City:<input type="text" name="city" id="para1" required /><br /> 
			Country:<input type="text" name="country" id="para1" required /><br /> 
					<input type="submit" value="Check the Weather" id="para1"/>
		</form>
	
</body>
</html>