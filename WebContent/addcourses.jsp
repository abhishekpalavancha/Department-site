<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="courses.css">
</head>
<jsp:include page="menu.jsp"></jsp:include>
<body>
<form action="addcoursesservlet" method="post">
<div>
<ul class="courses">
<br>
  <li><a href="viewcoursesservlet">View all courses</a></li>
  <li><a href="addcourses.jsp">Add courses</a></li>

 </br>
</ul>
</div>
<tr>
<td>
 course id:
</td>
<td>
  <input type="text" name="courseid" placeholder="Course ID" required>
</td>
</tr>
<tr>
<td>
 course Name:
</td>
<td>
  <input type="text" name="coursename" placeholder="Course Name" required>
</td>
</tr>
 <input type="submit" name="submit" value="submit">
 </form>
</body>
</html>