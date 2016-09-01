<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="menu.css">
</head>
<body>
<%String message = (String)request.getAttribute("error");
HttpSession k = request.getSession();
String s =  (String)k.getAttribute("name");%>
<ul class="menu">
  <li><a class="active"  href="home.jsp">Home</a></li>
  <li><a href="courses.jsp">Courses</a></li>
  
  <li><a href="viewphdstudent">Phd Student</a></li>
  <li><a href="facultystaffservlet">Resource</a></li>
  <li><a href="announcement.jsp">Announcement</a></li>
   <li><a href="creatediscussion.jsp">Discussion Board</a></li>
   <li><a href="viewalumnistudent">Alumni info</a></li>
    <li><a href="exam.jsp">Exam</a></li>
    <li><a href="editprofileservlet">Edit Profile</a></li>
   <% 
if(s!= null){
	
	out.print(s);
}%> 
     <li style="float:right"><a  href="login.jsp">logout</a></li>




</ul>
</body>
</html>