<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="menu.css">
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
  <li><a href=""></a></li>
 </br>
</ul>
</div>
</br>
<h style=text-align:"center">
<%
if(request.getAttribute("k")!=null){
ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k");
Iterator<String[]> t = al.iterator();
while(t.hasNext()){%>
	<h3><%
String[] s=(String[])t.next();
out.println("netid: "+s[0]);%><% 
/* out.println("password: "+s[1]); */%>

</br>
<% 

out.println("firstname: "+s[2]);
%>

</br>
<% 

out.println("lastname: "+s[3]);
%>

</br>

<% 

out.println("Role: "+s[4]);
%>
</br>
<% 

out.println("Year of Joining: "+s[5]);
%>
</br>
<% 

out.println("Program: "+s[6]);
%>

<a href="profileinfo.jsp?yoj=<%=s[1]%><%=s[2]%><%=s[3]%><%=s[4]%><%=s[5]%><%=s[6]%>">edit</a>
</br></h3>
<% out.println( "</a></br></br>");
%>


<% } %>
<% } %>
</h> 
</body>
</html>