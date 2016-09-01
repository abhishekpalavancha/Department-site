<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<link rel="stylesheet" type="text/css" href="courses.css">
</head>
<jsp:include page="menu2.jsp"></jsp:include>
<body>
<div>
<ul class="courses">
<br>
  <li><a href="viewcoursesservlet"></a></li>
  <li><a href="addcourses.jsp"></a></li>

 </br>
</ul>
</div>
</br>
<%
if(request.getAttribute("k")!=null){
ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k");
Iterator<String[]> t = al.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();

out.println("<a>");
out.println("Name of exam:\t"+s[1]);
out.println("Date of exam:\t"+s[2]);%> 
<%
out.println("Optional links:\t");%>

<a href="<%=s[3]%>"><%=s[3] %></a>


<a href="signupservlet?id=<%=s[1]%>&examid=<%=s[0]%>">sign up</a>
</br></br>
<% 
 }}%>

</body>
</html>