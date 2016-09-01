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
<div style="float:left;">
<ul class="courses">
<br>
  <li><a href=""></a></li>
  <li><a href=""></a></li>
  <li><a href=""></a></li>
  
</br>
</ul>
 </div>
<table align="center">
<tr>
<td>
  <%
if(request.getAttribute("k")!=null){
ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k");
Iterator<String[]> t = al.iterator();
while(t.hasNext()){

String[] s=(String[])t.next();

out.println("<a>");%>
<a href="phdinfo.jsp?identity=<%=s[0]%>"><%= s[1]%></a>
<% out.println( "</a></br>");
%>


<% } %>
 
<%-- <a href="infocourse.jsp?identity=<%=s[0]%>"></a> --%>
<%} %>
  <!-- <a style="padding-right:30px" href="infocourse.jsp">abhishek</a></td>
  <td><a href="infocourse.jsp"><button type="button">view</button></a></td>
  <td><a href="updatephd.jsp"><input type="button" value="update"></a></td>
   -->
  

</td>
</tr>


</table>


</body>
</html>