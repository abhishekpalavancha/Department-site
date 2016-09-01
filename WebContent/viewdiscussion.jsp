<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import =  "java.util.Map" %>
    <%@ page import =  "java.util.List" %>
     <%@ page import =  "java.util.Iterator" %>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>view hash</title>
<link rel="stylesheet" type="text/css" href="courses.css">
</head>


<body> <!-- gets all values from searchservlet -->
<%String msg = (String)request.getAttribute("error");
HttpSession y = request.getSession();
String j =  (String)y.getAttribute("role");

if(j!=null && j.equals("faculty")){%>
<jsp:include page="menu.jsp"></jsp:include>
<div>
<ul class="courses">
<br>
  <li><a href=""></a></li>
  <li><a href=""></a></li>
  
 </br>
</ul>
</div>
</br>
<%}
else{ %>
<jsp:include page="menu2.jsp"></jsp:include>
<%} %>
<%String al = request.getParameter("identity");

%>
<div>
<ul class="courses">
<br>
  <li><a href=""></a></li>

 
 </br>
</ul>
</div>
<%String nk = (String)request.getAttribute("doc");
Map cn = (Map)request.getAttribute("dc");
List pst =(List) cn.get("content");
List rpt =(List) cn.get("reply");
List snt = (List) cn.get("ID");
out.println(nk);%>
<!-- goes to view servlet -->
<form action="ViewdiscussionServlet" method ="GET">
<textarea name = "name" rows="6" cols="60">
</textarea>
<input type="hidden" name="bring" value="<%=nk%>">
<input type="submit" value="post" name="submit">
</form>

<h3>
<% Iterator v = pst.iterator(); //go through list
Iterator r = rpt.iterator();   //go through list
Iterator w = snt.iterator();    //go through list

   while(v.hasNext())
  {
	   out.println(v.next());%>
	  <%--  <a href="jobinfoservlet?identity=<%=s[0]%>">delete</a> --%>
	   </h3>
	  
	  <% try{
		  List rft = (List)r.next();
		  Iterator f = rft.iterator();
		  while(f.hasNext()){
			  
			  out.println(f.next()); %><!-- print comm reply -->
			 <br></br> 
		 <%  }
	  }catch(Exception e){
		  
	  }
	  %><h3>
	   <form action="ViewdiscussionServlet" method ="GET">
<input type = "text" name = "rpt">
<input type="hidden" name="bring" value="<%=nk %>">

<input type="hidden" name="bid" value="<%out.print(w.next());%>"><!-- to get name of hash -->

<input type="submit" value="Reply" name="submit">

</form><br>
	 <%} %> 
   
   
 
</body>
</html>