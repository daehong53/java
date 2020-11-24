<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<body>
<%
	String hello = "Hello!";
	String world = "World!";
	
	String id = request.getParameter("id");
	//if (id == null) id = "";
%>
<%=hello %>   <%=world %>

<hr/>
<input type="text" value="<%= ((id == null) ? "아이디 입력!" : id) %>" />
<hr/>
<input type="text" value="아이디 입력!" />
<input type="text" value="testId" />
 
</body>
</html>


