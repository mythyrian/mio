<%@page import="com.example.model.Actor"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<Actor> act = (ArrayList)request.getAttribute("tutti");
	for(Actor a: act){
		out.println("Nome: " + a.getFirst_name() + " " + a.getLast_name());
	}


%>
</body>
</html>