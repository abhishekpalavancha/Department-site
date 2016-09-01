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
<div style="float:left;">
<ul class="courses">
<br>
  <li><a href="addnewexam.jsp"></a></li>
  <li><a href="result.jsp"></a></li>
  <li><a href="postresult.jsp"></a></li>
  
</br>
</ul>
 </div>
<form action="jobinfoservlet" method="post">
<table>
<textarea type="text" name="description" placeholder="otherinformation" rows="4" cols="50"> 
</textarea>
 
</td>
</tr>
</table>
<%String l = request.getParameter("identity");

%>
<%-- <%
if(request.getAttribute("k")!=null){
ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k");
Iterator<String[]> t = al.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();
out.println(s[0]);
%> --%>

<input type="hidden" name="jobid" value="<%=l%>">
<% %>
<input type="submit" value="submit">
</form>
</body>
</html>