<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="menu.jsp"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="courses.css">
</head>
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
<%String al = request.getParameter("identity");
if(al==null)
	{al = request.getParameter("phdid"); }

%>
<form action="phdinfoServlet" method="get">
<table>
<tr>
<td>
  Number of  semester:
</td>
<td>
  <input type="text" name="semester" placeholder="semester" required>
</td>
</tr>
<tr>
<td>
  Other information :
</td>
<td>
<textarea type="text" name="otherinformation" placeholder="otherinformation" rows="4" cols="50"> 
</textarea>
 
</td>
</tr>
</table>
<input type="hidden" name="phdid" value="<%=al%>">
<input type="submit" value="submit">
</form>
<%
if(request.getAttribute("k")!=null){
ArrayList<String[]> n = (ArrayList<String[]>)request.getAttribute("k");
Iterator t = n.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();
%></br>
<%=s[0]%>  <%=s[1]%></br>
<%}} %>
</body>
</html>