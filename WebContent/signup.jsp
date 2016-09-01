<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="nameofexam" method="post">
<tr>
<td>
 Name:
</td>
<td>
  <input type="text" name="name" placeholder="Name of exam" required>
</td>
</tr>
<tr>
<td>
  Date of exam:
</td>
<td>
  <input type="text" name="dateofexam" placeholder="Date of exam" required>
</td>
</tr>

<tr>
<td>
  Optional links:
</td>
<td>
  <input type="text" name="optionallinks" placeholder="Optional links" required>
</td>
</tr>
<input  type="submit" value="submit">
</form>

</body>
</html>