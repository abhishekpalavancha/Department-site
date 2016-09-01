<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="menu.jsp"></jsp:include>
<body>
<table>
<tr>
<td>
  Office hours:
</td>
<td>
  <input type="text" name="officehours" placeholder="officehours">
</td>
</tr>
<tr>
<td>
  TA info:
</td>
<td>
  <input type="text" name="tainfo" placeholder="TA information">
</td>
</tr>
<tr>
<td>
  syllabus:
</td>
<td>
<textarea type="text" name="syllabus" placeholder="syllabus" rows="4" cols="50"> 
</textarea>
 
</td>
</tr>
</table>
<input type="submit" value="submit">
</body>
</html>