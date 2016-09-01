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
<%-- <jsp:include page="menu.jsp"></jsp:include> --%>
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
out.println(al);%>
<%HttpSession k = request.getSession();
String m =  (String)k.getAttribute("name");%>

<%String message = (String)request.getAttribute("error");
HttpSession b = request.getSession();
String z =  (String)b.getAttribute("role");
if(z!=null && z.equals("faculty")){%>
<jsp:include page="menu.jsp"></jsp:include>

<form action="postresultservlet" method="get">
<tr>
<td>
 Student ID:
</td>
<td>
  <input type="text" name="studentid" placeholder="Student ID">
</td>
</tr>
<tr>
<td>
 Result:
</td>
<td>
  <input type="text" name="result" placeholder="Result">
</td>
</tr>
<input type="hidden" name="nameofexam" value="<%=al%>">
 <input type="submit" name="submit" value="submit">
 </form>
 <%} %>
<%

ArrayList<String[]> l = (ArrayList<String[]>)request.getAttribute("res");
if(l!=null){
Iterator<String[]> t = l.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();

out.println("<a>");
if(al.equals(s[2])){



out.println("<a>");

out.println(s[0]);
out.println(s[1]);
/* out.println(s[2]); */
%>

<% if(m.equals(s[3])){%>
<a href="editinfo.jsp?id=<%=s[0]%>&p=<%=s[2]%>">edit</a>
<a href="resultinfoservlet?identity=<%=s[0]%>&a=<%=s[2]%>">delete</a>
<%}else{ %><a href="alumniinfo.jsp?identity=<%=s[0]%>"></a>
	<%}}}}%> 
</br>
</body>
</html>