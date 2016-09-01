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
<jsp:include page="menu2.jsp"></jsp:include>
<body>
<table> 
<tr>
<td>
<ul class="courses">
<br>
  <li><a href="viewnameofexam2">exam information</a></li>
  
  <li><a href="studentresultservlet">View Result</a></li>
  
</br>
</ul>
 
</td>
</tr>
</table>
<%
if(request.getAttribute("k")!=null){
ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k");
Iterator<String[]> t = al.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();

out.println("<a>");
out.println(s[0]);
out.println( "</a></br>");
}} %>

</body>
</html>