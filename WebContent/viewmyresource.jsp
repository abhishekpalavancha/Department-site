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
<jsp:include page="menu2.jsp"></jsp:include>




<div style="float:left;">
<ul class="courses">
<br>
  <li><a href="addnewexam.jsp"></a></li>
  <li><a href="result.jsp"></a></li>
  <li><a href="postresult.jsp"></a></li>
  
</br>
</ul>
 </div>
<%ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("res");
 %>
<%} %>
<%
if(request.getAttribute("res")!=null){
ArrayList<String[]> n = (ArrayList<String[]>)request.getAttribute("res");
Iterator t = n.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();
out.println(s[0]);
out.println(s[1]);
out.println(s[2]);%>
<a href="deleteresourceservlet?identity=<%=s[0]%>&date=<%=s[1]%>&slot=<%=s[2]%>">delete</a>

</br>
<%}} %>
</body>
</html>