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


<body style="text-align:center">
<%String message = (String)request.getAttribute("error");
HttpSession b = request.getSession();
String h =  (String)b.getAttribute("role");

if(h!=null && h.equals("faculty")){%>
<jsp:include page="menu.jsp"></jsp:include>

<%}
else{ %>
<jsp:include page="menu2.jsp"></jsp:include>
<%} %>
	<div>
<ul class="courses">
<br>
  
  <li><a href="viewresourceservlet"></a></li>
  <li><a href="viewmyresourceservlet"></a></li>
 
 </br>
</ul>
</div>
<%HttpSession k = request.getSession();
String m =  (String)k.getAttribute("name");
if(h!=null && h.equals("faculty")){%>
<form action="jobsservlet" method="post">
<table align="center">
<tr>

<td>
<textarea  name="jobs" placeholder="jobs" rows="4" cols="50"> 
</textarea>
 
</td>
</tr>
</table>
<input type="submit" value="submit" id="submit">
</form>
<%} %>
<h3 style="text-align:center">
<%
if(request.getAttribute("k")!=null){
ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k");
Iterator<String[]> t = al.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();

out.println("<a>");

out.println(s[2]);
if(h!=null && !h.equals("faculty")){%>
<a href="applyjobservlet?student=<%=s[0]%>">apply</a>
<% 	
}
%>

<% if(m.equals(s[1])){%>
<a href="jobinfo.jsp?identity=<%=s[0]%>">edit</a>
<a href="jobinfoservlet?identity=<%=s[0]%>">delete</a>
<%}else{ %><a href="alumniinfo.jsp?identity=<%=s[0]%>"></a>
	<%}%>
<% 
out.println( "</a></br>");
}} %>
</h3>


</body>
</html>