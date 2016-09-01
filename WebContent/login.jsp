<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="courses.css">
</head>
<style>

	body {
    background-image: url("ua.jpg") width: 500px;
    
}</style>
<body align="center" class="login">
<%HttpSession k = request.getSession();
String m =  (String)k.getAttribute("res");%>
<form action="loginservlet" method="get" >
</br></br></br>
<table align="center">
<tr>
<td>
  Net ID:
</td>
<td>
  <input type="text" name="netid" placeholder="NET ID" required>
</td>
</tr>
<tr>
<td>
  Password:
</td>
<td>
  <input type="password" name="password" placeholder="password" required>
</td>
</tr>
</table>
</br>
<%-- <input type="hidden" name="role" value="<%=m%>"> --%>
<input type="submit" name="submit" value="submit">
</form>

</body>
</html>