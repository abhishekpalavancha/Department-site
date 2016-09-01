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

<%String message = (String)request.getAttribute("error");
HttpSession k = request.getSession();
String m =  (String)k.getAttribute("role");

if(m!=null && m.equals("faculty")){%>
<jsp:include page="menu.jsp"></jsp:include>


<%}else{ %>
<jsp:include page="menu2.jsp"></jsp:include>


<%} %>
<tr>
<td>
<ul class="courses">
<br>
  <li><a href=""></a></li>
  
  <li><a href=""></a></li>
  
</br>
</ul>
 
</td>
</tr>

<form action="reserveresourceservlet" method="get">
<!-- <tr>
<td>
  type of Resource:
</td>
<td>
<select name="typeofresource" onchange="location=this.options[this.selectedIndex].value;">
  <option value="reserveresourceservlet" >projector</option>
  <option value="reserveresourceservlet">room</option>
  <option value="reserveresourceservlet">others</option>
  <option value="reserveresourceservlet">computer</option>
</select></br>
</td>
</tr> -->
<%ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k");
%>
<% Iterator t = al.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();
%>
Name of Resource:
<a href="datetimeresource.jsp?identity=<%=s[0]%>"><%=s[0]%></a></br>

<%} %>

</form>
</body>
</html>