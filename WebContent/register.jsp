<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UAlbany Computer Science Department Website</title>
</head>
<body>
<h2>UAlbany Computer Science Department Website</h2>
<div>
<form action="RegisterServlet" method="post">
<table>
<tr>
<td>
  Net ID:
</td>
<td>
  <input type="text" name="netid" placeholder="NET ID" required>
</td>
</tr>
<tr>
<td>
  Password:
</td>
<td>
  <input type="password" name="password" placeholder="password" required>
</td>
</tr>

<tr>
<td>
First Name
</td>
<td>
  <input type="text" name="firstname" placeholder="firstname" required>
</td>
</tr>
<tr>
<td>
Last Name
</td>
<td>
  <input type="text" name="lastname" placeholder="lastname" required>
</td>

</tr>
<tr>
<td>
Email id:
</td>
<td>
  <input type="text" name="emailid" placeholder="emailid">
</td>

</tr>
<tr>
<td>
Role:
</td>
<td>
<input type="radio" name="role" value="student" id="stdradio"> student

  <input type="radio" name="role" value="faculty" id="stdfaculty" required> faculty

  <input type="radio" name="role" value="staff" id="stdstaff"> staff
</td>
</tr>

<tr style="display:none" id="std1">
<td>
Year of Joining

</td>
<td>
<select name="year">
  <option value="2016" >2016</option>
  <option value="2015">2015</option>
  <option value="2014">2014</option>
  <option value="2013">2013</option>
</select>
</td>
</tr>
<tr style="display:none" id="std2">
<td>
Program
</td>
<td>
<select name="program">
  <option value="bs">BS</option>
  <option value="ba">BA</option>
  <option value="ms">MS</option>
  <option value="phd">Phd</option>
</select>
</td>
</tr>


  </table>
  <input type="submit" name="submit" value="submit">
</form>
</div>

<%String message = (String)request.getAttribute("error");
if(message!= null){
	out.print(message);
}%>
<script src="jquery.min.js"></script>
<script>
$(document).ready(function(){
	
	$("#stdradio").change(function(){
		$("#std1").show();
		$("#std2").show();
	});
	$("#stdfaculty").change(function(){
		$("#std1").hide();
		$("#std2").hide();
	});
	$("#stdstaff").change(function(){
		$("#std1").hide();
		$("#std2").hide();
	});
	
});

</script>
</body>
</html>