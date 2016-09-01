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

<body align="center">
<div>
<ul class="courses">
<br>
  <li><a href="addnewresource.jsp">Add New Resource</a></li>
  <li><a href="reserveresource.jsp">Reserve Resource</a></li>
  
 </br>
</ul>
</div>
<form action="addresourceservlet" method="post">
<table align="center">
<tr>
<td>
  Name of Resource:
</td>
<td>
  <input type="text" name="nameofresource" placeholder="name of resource" required>
</td>
</tr>
<tr>
<td>
  type of Resource:
</td>
<td>
<select name="typeofresource">
  <option value="projector" >projector</option>
  <option value="room">room</option>
  <option value="others">others</option>
  <option value="computer">computer</option>
</select></br>
</td>
</tr>
<!-- <tr>
<td>
  Type of Resource:
</td>
<td>
  <input type="text" name="typeofresource" placeholder="Type of resource">
</td>
</tr> -->
<tr>
<td>
  other details:
</td>
<td>
<textarea type="text" name="otherdetails" placeholder=""> 
</textarea>
 
</td>
</tr>

</table>
</br>
<input  type="submit" value="submit">
</form>
<h style=text-align:"center">
<%ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k"); 
if(al!=null){
	out.println("resource added");
}
%>

</body>

</html>