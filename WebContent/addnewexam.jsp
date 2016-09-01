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
<jsp:include page="menu.jsp"></jsp:include>
<body>  
<div>
<ul class="courses">
<br>
  <li><a href="viewcoursesservlet"></a></li>
  <li><a href="addcourses.jsp"></a></li>

 </br>
</ul>
</div>
<form action="nameofexam" method="post">
<tr>
<td>
  Name of Exam:
</td>
<td>
  <input type="text" name="nameofexam" placeholder="Name of exam" required>
</td>
</tr>
<tr>
<td>
  Date of exam:
</td>
<td>
  <input type="text" name="dateofexam" placeholder="Date of exam" required>
</td>
</tr>

<tr>
<td>
  Optional links:
</td>
<td>
  <input type="text" name="optionallinks" placeholder="Optional links" required>
</td>
</tr>
<input  type="submit" value="submit">
</form>
</br></br>
<%
if(request.getAttribute("k")!=null){
ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k");
Iterator<String[]> t = al.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();

out.println("<a>");
out.println("Name of exam:\t"+s[0]);
out.println("Date of exam:\t"+s[1]);%> 
<%
out.println("Optional links:\t");%>
<a href="<%=s[2]%>"><%=s[2] %></a>
<%
}} %>
</body>
</html>