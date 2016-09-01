<!DOCTYPE html>
<html>
<head>
<title>createpage</title>
<link rel="stylesheet" type="text/css" href="courses.css">
</head>

<style>


</style>
<body>
<jsp:include page="menu.jsp"></jsp:include> 

<div>
<ul class="courses">
<br>
  <li><a href="listservlet">view discussion</a></li>

 
 </br>
</ul>
</div>
<form action="Creatediscussionservlet" method ="GET"><%String n = (String)request.getAttribute("msg");%>
<b>
Create Discussion: <input type="text"  name="hash"></b>
<input type="submit" value="submit"> 

</form>


</body>
</html>