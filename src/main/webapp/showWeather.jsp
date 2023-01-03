<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import= "model.weatherBean"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>The Weather</title>
</head>
<body>

	<%
	weatherBean wBean = (weatherBean) request.getAttribute("wBean");
	out.print("The weather in " + wBean.getCityStr() + " is now a " + wBean.getCloudsStr() + " and there is " + wBean.getTemperature() + " degrees Celsius.");
	out.print(" The date is " + wBean.getDate());
	%>
	
	<jsp:include page="./index.jsp"></jsp:include>
	
		
	<a href="OWservlet?city=${cookie['cityCookie'].getValue()}&country=${cookie['countryCookie'].getValue()}">${cookie["cityCookie"].getValue()}, ${cookie["countryCookie"].getValue()}</a>
	
</body>
</html>