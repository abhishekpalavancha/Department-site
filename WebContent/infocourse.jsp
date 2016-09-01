<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>

<body>
<%String message = (String)request.getAttribute("error");
HttpSession k = request.getSession();
String m =  (String)k.getAttribute("role");
if(m!=null && m.equals("faculty")){%>
<jsp:include page="menu.jsp"></jsp:include>
<%String al = request.getParameter("identity");

%>

<form action="infocourseservlet" method="get">
<table>
<tr>
<td>
  Professors Office hours:
</td>
<td>
  <input type="text" name="officehours" placeholder="officehours" >
</td>
</tr>
<tr>
<td>
  TA Mail id:
</td>
<td>
  <input type="text" name="tainfo" placeholder="TA information" >
</td>
</tr>
<tr>
<td>
  Other information:
</td>
<td>
<textarea type="text" name="syllabus" placeholder="syllabus" rows="4" cols="50"> 
</textarea>
 
</td>
</tr>
</table>
<input type="hidden" name="courseid" value="<%=al%>">
<input type="submit" value="submit">
</form>
<%}%>
<%if(m!=null && m.equals("student")){%>
<jsp:include page="menu2.jsp"></jsp:include>
<%} %>
<%

ArrayList<String[]> n = (ArrayList<String[]>)request.getAttribute("details");
Iterator t = n.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();
%></br>
Professors Office hours:
<%=s[0]%></br>
TA mail id :
<%-- <a href="mailto:<%=s[1]%>@albany.edu?Subject=Hello%20again" target="_top"><%=s[1]%></a> --%>
 <a href="https://login.microsoftonline.com" target="_top"><%=s[1]%></a>
<%-- <%=s[1]%> --%></br>
Other information:</br>
<%=s[2]%></br>
<%} %>
</body>
</html>