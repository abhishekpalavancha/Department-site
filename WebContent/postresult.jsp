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
<tr>
<td>
<div style="float:left;">
<ul class="courses">
<br>
  <li><a href="addnewexam.jsp"></a></li>
  <li><a href="result.jsp"></a></li>
  <li><a href="postresult.jsp"></a></li>
  
</br>
</ul>
 </div>

</td>
</tr>
<form action="postresultservlet" method="post">
<table>
<tr>
<td>
  Name of Exam:
</td>
<td>
  <input type="text" name="nameofexam" placeholder="Name of exam">
</td>
</tr>
<!-- <tr>
<td>
  result of Exam:
</td>
<td>
<textarea  name="resultofexam" placeholder="result of exam" rows="4" cols="50"> 
</textarea>
  
</td>
</tr> -->
</table>

<input type="submit" value="submit">
</form>
<%
if(request.getAttribute("k")!=null){
ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("k");
Iterator<String[]> t = al.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();

out.println("<a>");

/* out.println(s[1]); */%>
<a href="postresultservlet?nameofexam=<%=s[0]%>"><%= s[1]%></a>
<%}}
%>

</body>
</html>