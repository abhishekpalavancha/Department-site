<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="courses.css">
</head>

<body>
<%String message = (String)request.getAttribute("error");
HttpSession k = request.getSession();
String m =  (String)k.getAttribute("role");

if(m!=null && m.equals("faculty")){%>
<jsp:include page="menu.jsp"></jsp:include>

<%} 
else{ %>
<jsp:include page="menu2.jsp"></jsp:include>
<%} %>
<div>
<ul class="courses">
<br>
  <li><a href=""></a></li>
  <li><a href=""></a></li>
  
 </br>
</ul>
</div>
<%String al = request.getParameter("yoj");
%>
<form action="profileinfoservlet" method="post">
<h5>Please enter all details</h5>
<tr>
<td>
  Password:
</td>
<td>
  <input type="password" name="password" placeholder="password" required>
</td>
</tr>
<tr>
<td>
  FirstName:
</td>
<td>
  <input type="text" name="firstname" placeholder="firstname" required>
</td>
</tr>

<tr>
<td>
  LastName:
</td>
<td>
  <input type="text" name="lastname" placeholder="lastname" required>
</td>
</tr>


<!-- <tr>
<td>
  Year of Joining:
</td>
<td>
  <input type="text" name="yearofjoining" placeholder="yearofjoining">
</td>
</tr> -->
<input type="hidden" name="netid" value="<%=al%>">
<input  type="submit" value="submit">
</form>

</body>
</html>