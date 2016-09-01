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
<%String al = request.getParameter("id");
%>
<%String p = request.getParameter("p");
%>

<form action="resultinfoservlet" method="post">

<tr>
<td>
  New Result:
</td>
<td>
  <input type="text" name="newresult" placeholder="newresult" required>
</td>
</tr>
<input type="hidden" name="stdid" value="<%=al%>">
<input type="hidden" name="p" value="<%=p%>">
<input  type="submit" value="submit">
</form>
</body>
</html>