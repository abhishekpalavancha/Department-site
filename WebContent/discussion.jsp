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
<form action="discussiontopicservlet" method ="GET">
<textarea name = "comment" rows="6" cols="60">
</textarea>
<input type="hidden" name="discusionnumber" value="<%=al%>">
<input type="submit" value="post" name="submit">
</form>

<%
if(request.getAttribute("k")!=null){
ArrayList<String[]> a = (ArrayList<String[]>)request.getAttribute("k");
Iterator<String[]> t = a.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();

out.println("<a>");
out.println(s[3]);
out.println( "</a></br>");
%>
<form action="replyservlet" method ="GET">
<input type = "text" name = "rpt">
<input type="submit" value="submit">
</form><br>
<%} }%>
</br>
</body>
</html>