<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="newsinfoservlet" method="post">
<table>
<textarea type="text" name="description" placeholder="otherinformation" rows="4" cols="50"> 
</textarea>
 
</td>
</tr>
</table>
<%String l = request.getParameter("identity");
out.print(l);
%>
<input type="hidden" name="newsid" value="<%=l%>">
<% %>
<input type="submit" value="submit">
</form>

</body>
</html>