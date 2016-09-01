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
<%HttpSession k = request.getSession();
String m =  (String)k.getAttribute("name");%>
<div>
<ul class="courses">
<br>
  <li><a href="">new</a></li>
  <li><a href="">new</a></li>
  
 </br>
</ul>
</div>
<form action="discussionservlet" method="post">
<table>
<tr>
<td>
<textarea type="text" name="discussiontopic" placeholder=""> 
</textarea>

</td>
</tr>
</br>

</table>
<input  type="submit" value="submit">
</br></br></br>
</form>
<%
if(request.getAttribute("k")!=null){
ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k");
Iterator<String[]> t = al.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();

out.println("<a>");%> 
<a href="discussion.jsp?identity=<%=s[0]%>"><%=s[0]%></a>
<% out.println("<a>");%>

<%-- 
<% if(m.equals(s[1])){%>
<a href="jobinfo.jsp?identity=<%=s[0]%>">edit</a>
<a href="jobinfoservlet?identity=<%=s[0]%>">delete</a>
<%}else{ %><a href="alumniinfo.jsp?identity=<%=s[0]%>"></a>
	<%}%>
<% 
out.println( "</a></br>");--%><%
}} %> 
</body>

</html>