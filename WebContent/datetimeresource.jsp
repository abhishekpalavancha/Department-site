<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="courses.css">

  <meta charset="utf-8">
  <title>jQuery UI Datepicker - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    $( "#datepicker" ).datepicker();
  });
  </script>
</head>
</head>

<body >
<%String message = (String)request.getAttribute("error");
HttpSession k = request.getSession();
String m =  (String)k.getAttribute("role");

if(m!=null && m.equals("faculty")){%>
<jsp:include page="menu.jsp"></jsp:include>


<%}else{ %>
<jsp:include page="menu2.jsp"></jsp:include>


<%} %>
<%String al = request.getParameter("identity");
String date = request.getParameter("date");
out.print(al);
%>

<form action="datetimesourceservlet" method="get">
 
Date: <input type="text" id="datepicker" name="date">
<input type="hidden" name="nos" value="<%=al%>">
 <input type="submit" name="submit" value="submit">
 </form>
 <%
if(request.getAttribute("k")!=null){
ArrayList<String> n = (ArrayList<String>)request.getAttribute("k");
if(n!=null){
Iterator t = n.iterator();
%>
<form action="datetimesourceservlet" method="post">

<% 
while(t.hasNext()){
String a =(String)t.next();%>
<input type="radio" name="timeslot" value="<%=a%>"> <%=a%>
<input type="hidden" name="nos" value="<%=al%>">
<input type="hidden" name="date" value="<%=date%>">
</br>


<%} }%>
 <input type="submit" name="submit" value="submit">
</form>
<%} %>
</body>
</body>
</html>