<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*, java.util.*, javax.servlet.*, java.text.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display Current Date & Time</title>
</head>
<body>
<center>	
	<h1>Xin chao the gioi, toi la Hai. :D</h1>
</center>
<%
	Date date = new Date();
	out.print( "<h2 align=center>" +date.toString()+"</h2>");
//	Date dNow = new Date();
//	SimpleDateFormat dateFormat = new SimpleDateFormat("E dd/MM/yyyy HH:mm:ss a zzz");
//	out.print("<h2 align=\"center\">" + dateFormat.format(dNow) + "</h2>" );
%>
</body>
</html>