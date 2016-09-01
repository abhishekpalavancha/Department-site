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
  <li><a href="addnewresource.jsp"></a></li>
  <li><a href="reserveresource.jsp"></a></li>
  
 </br>
</ul>
</div>
<%String al = request.getParameter("identity");
out.print(al);
%>
<form action="alumniinfoservlet" method="get">
<table>
<tr>
<td>
  name:
</td>
<td>
  <input type="text" name="name" placeholder="name" required>
</td>
</tr>
<tr>
<td>
  description :
</td>
<td>
<textarea type="text" name="description" placeholder="otherinformation" rows="4" cols="50"> 
</textarea>
 
</td>
</tr>
</table>
<input type="hidden" name="alumniid" value="<%=al%>" required>
<input type="submit" value="submit">
</form>
<%
if(request.getAttribute("k")!=null){
ArrayList<String[]> n = (ArrayList<String[]>)request.getAttribute("k");
Iterator t = n.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();
%>
<a href=""><%=s[0]%><%=s[1]%></a></br>
<%}} %>
</body>
</html>