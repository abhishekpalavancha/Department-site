<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: left;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="courses.css">
</head>
<jsp:include page="menu2.jsp"></jsp:include>
<body>
<%ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("mail"); 
 Iterator t = al.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();

if(s[3] !=null && s[3].equals("faculty")){
	%>
<%--
<%=s[0] %>  
<a href="mailto:<%=s[2] %>"><%=s[2] %></a> 
<a href=""></a> --%>

</br>
<%-- <a href="alumniinfo.jsp?identity=<%=s[0]%>"></a></br> --%>



<table style="width:100%">
  <caption>Details of Professors</caption>
  <tr>
    <th>Name</th>
    <th><%=s[0] %></th>
  </tr>
  <tr>
    <td>Mail id</td>
    <td><a href="https://login.microsoftonline.com" target="_top"><%=s[2] %></a></td>
  </tr>
 </br>
</table>
<%} %>
<%} %>
</body>
</html>