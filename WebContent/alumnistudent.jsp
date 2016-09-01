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

<body>
<%String msg = (String)request.getAttribute("error");
HttpSession y = request.getSession();
String j =  (String)y.getAttribute("role");

if(j!=null && j.equals("faculty")){%>
<jsp:include page="menu.jsp"></jsp:include>
<div>
<ul class="courses">
<br>
  <li><a href=""></a></li>
  <li><a href=""></a></li>
  
 </br>
</ul>
</div>
</br>


<div>
<ul class="courses">
<br>
  <li><a href="Jobviewservlet"></a></li>
  
 </br>
</ul>
</div>
<tr>
<td>
<form action="alumniinfoservlet" method="post">
<tr>
<td>
  Name:
</td>
<td>
  <input type="text" name="name" placeholder="Name of alumni" required>
</td>
</tr>
<tr>
<td>
  Description:
</td>
<td>
  <input type="text" name="description" placeholder="description" required>
</td>
</tr>

<input  type="submit" value="submit">
</form>
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
</br>


<div>
<%} %>

<%
if(request.getAttribute("k")!=null){
ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k");
Iterator<String[]> t = al.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();
out.println("Name: "+s[1]);%>
</br>
<% 
out.println("Description: "+s[2]);

if(j!=null && j.equals("faculty")){%>
<a href="alumniinfo.jsp?identity=<%=s[0]%>">edit</a><%} %>
<% out.println( "</a></br></br>");
%>


<% } %>
<% } %>
</td>
</tr>


</table>
</body>
</html>