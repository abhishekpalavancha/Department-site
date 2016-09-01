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
<jsp:include page="menu2.jsp"></jsp:include>
<h3>Your Status:</h3>
<%
if(request.getAttribute("status")!=null){
ArrayList<String[]> l = (ArrayList<String[]>)request.getAttribute("status");

Iterator<String[]> t = l.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();

out.println("<a>");%>
Program enrolled:
<%
out.println(s[1]);%></br>
Year of Joining:
<% 
out.println(s[0]);
out.println( "</a></br>");
}} %>

<h3>Your Courses:</h3>
<%
if(request.getAttribute("details")!=null){
ArrayList<String[]> al = (ArrayList<String[]>)request.getAttribute("details");

Iterator<String[]> t = al.iterator();
while(t.hasNext()){
String[] s=(String[])t.next();

out.println("<a>");
out.println(s[0]);
out.println( "</a></br>");
}} %>


<h3>General Program B.A.:</h3>
Computer Systems and Science Core (18 credits): I CSI 201, 210, 310, 333, and 404
</br>Programming Principles and Practice (3 credits): one of I CSI 311 or 405
</br>Intensive Software Development (3 credits): one of I CSI 402 or 418 or other course with intensive software development as approved by the department
</br>Mathematics (11 credits): A MAT 111 or 112 or 118; 113 or 119; and 367
</br>Electives (6 credits): two I CSI courses numbered 400-470 or 500-550 or specially approved by the department.
</br>
</br>
</br>
 <h3>Computer Science M.S/PHD:</h3>
 </br>
 Computer Science core (13-14 credits): 
 CSI 503 and CSI 518 plus two courses chosen from CSI 500, CSI 508, CSI 509, or CSI 519,A 3.0 average must be attained in these core courses
 </br>Elective subjects (15 credits): Computer Science courses or courses in other academic departments as approved by the department. Approval of non-departmental electives is based on the individual student's overall academic program and preparation.
</br>Master's Project, Thesis, or Internship (3 credits): Satisfactory completion of (a) any Master's Project course (CSI 68X). The project includes the design and implementation of a computer program of significant scope, unless this is waived by the project faculty supervisor for a student who has sufficient programming experience. The project must include a written report.; (b) CSI 699, Master's Thesis; or  (c) CSI 698, Internship.
</br>

<h3>Courses suggested for each concentration:</h3>
<h3>For Graduate students:</h3>
<h4>Application:</h4>
</br>CSI 508  database system
</br> CSI 535 artificial intelligence I
</br> CSI 635 artificial intelligence II
</br> CSI 531 Data Mining
</br> CSI 608 Database system II
</br><h4>Systems:</h4>
csi 500 Operating Systems
</br>csi 504 computational
</br>csi 671 computer design II
</br>
<h4>Theory :</h4>
csi 530 introduction to maths and logic
</br>csi 519 Advance Programming concepts.
</br>csi 538 computational logic

</body>
</html>