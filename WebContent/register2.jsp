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
<form>
<table>
<tr>
<td>
  Net ID:
</td>
<td>
  <input type="text" name="netid" placeholder="NET ID">
</td>
</tr>
<tr>
<td>
  Password:
</td>
<td>
  <input type="password" name="password" placeholder="password">
</td>
</tr>

<tr>
<td>
First Name
</td>
<td>
  <input type="text" name="firstname" placeholder="firstname">
</td>
</tr>
<tr>
<td>
Last Name
</td>
<td>
  <input type="text" name="lastname" placeholder="lastname">
</td>

</tr>
<tr>
<td>
Role:
</td>
<td>
<input type="radio" name="role" value="student"> student

  <input type="radio" name="role" value="faculty"> faculty

  <input type="radio" name="role" value="staff"> staff
</td>
</tr>
<div>
<tr>
<td>
Year of Joining

</td>
<td>
<select>
  <option value="year">2016</option>
  <option value="year">2015</option>
  <option value="year">2014</option>
  <option value="year">2013</option>
</select>
</td>
</tr>
<tr>
<td>
Program
</td>
<td>
<select>
  <option value="program">BS</option>
  <option value="program">BA</option>
  <option value="program">MS</option>
  <option value="program">Phd</option>
</select>
</td>
</tr>
</div>

  </table>
</form>
</div>

<button type="button">submit</button>
</body>
</html>