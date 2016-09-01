<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script src="http://www.w3schools.com/lib/w3data.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="courses.css">
</head>
<jsp:include page="menu.jsp"></jsp:include>
<body>


<div>
<ul class="courses">
<br>
  <li><a href="viewcoursesservlet">View all courses</a></li>
  <li><a href="addcourses.jsp">Add courses</a></li>
  <li><a href="officehoursservlet">view my courses</a></li>
 </br>
</ul>
</div>
<div>

</div>

<div w3-include-html="footer.html"></div> 
<script>
w3IncludeHTML();
</script>
</body>
</html>