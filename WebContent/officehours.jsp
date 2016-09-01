<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="officehours.css">
<link rel="stylesheet" type="text/css" href="courses.css">
</head>
<jsp:include page="menu.jsp"></jsp:include>
<body>
<%ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k"); %>
<div>
<ul class="courses">
<br>
  <li><a href="infocourse.jsp"></a></li>
  <li><a href="#news"></a></li>
</br>
</ul>
</div>
</br>
<h style=text-align:"center">

<% Iterator t = al.iterator();
//out.print(al);
while(t.hasNext()){
String[] s=(String[])t.next();
%>
</br>
 <a href="viewofficehoursservlet?identity=<%=s[0]%>"><%= s[1]%></a> 
<%} %></h>
</br>
</body>
</html>