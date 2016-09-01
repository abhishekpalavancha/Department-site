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
<jsp:include page="menu2.jsp"></jsp:include><%} %>
<div>
<ul class="courses">
<br>
  
  <li><a href="viewresourceservlet">Reserve Resource</a></li>
  <li><a href="viewmyresourceservlet">View my Resource</a></li>
 
 </br>
</ul>
</div>	






<%
if(request.getAttribute("k")!=null){
ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k");
Iterator<String[]> t = al.iterator();

while(t.hasNext()){

String[] s=(String[])t.next();
/* out.println(s[4]); */
if(s[4].equals("staff")){ %>
<div>
<ul class="courses">
<br>
  <li><a href="addnewresource.jsp">Add New Resource</a></li>
  <li><a href="viewresourceservlet">Reserve Resource</a></li>
  <li><a href="viewmyresourceservlet">View my Resource</a></li>
 
 </br>
</ul>
</div>
	<% }
	else{%>
	
	<%}
 }} %>
</body>
</html>