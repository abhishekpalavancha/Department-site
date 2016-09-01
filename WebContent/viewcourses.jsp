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
</head>

<style>
.h{
text-align:center;}
</style>
<body>
<%String msg = (String)request.getAttribute("error");
HttpSession y = request.getSession();
String j =  (String)y.getAttribute("role");

if(j!=null && j.equals("faculty")){%>
<jsp:include page="menu.jsp"></jsp:include>
<div>
<ul class="courses">
<br>
  <li><a href="viewcoursesservlet">View all courses</a></li>
  <li><a href="addcourses.jsp">Add courses</a></li>
  
 </br>
</ul>
</div>
</br>
<%}
else{ %>
<jsp:include page="menu2.jsp"></jsp:include>
<div>
<ul class="courses">
<br>
  <li><a href=""></a></li>
  <li><a href=""></a></li>
  
 </br>
</ul>
</div>
<%} %>

<%ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k"); %>

<h style=text-align:"center">
<% Iterator t = al.iterator();
HttpSession b = request.getSession();
String h =  (String)b.getAttribute("role");

while(t.hasNext()){
String[] s=(String[])t.next();
%>

<% if(h!=null && h.equals("student")){%>
<a href="viewofficehoursservlet?identity=<%=s[0]%>"><%=s[1] %></a>
<a href="enrollservlet?identity=<%=s[0]%>">enroll</a></br></br>
<%-- <a href="alumniinfo.jsp?identity=<%=s[0]%>"></a></br> --%>
<%}else{ out.println(s[1]); }%>
<%if(s[2].equals("")) {%>
<%String message = (String)request.getAttribute("error");

if(h!=null && h.equals("faculty")){%>
<a href="teachservlet?identity=<%=s[0]%>">teach</a></br>


<%}}else{%>
</br>
<%}


} %>

</h> 
</body>
</html>