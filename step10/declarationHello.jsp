<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%!
	String hello = "Hello!";
	String world = "World!";
	
	public int add (int a, int b){
// 		str="test2";
		return a+b;
	}
%>
<html>
	<body>
		<% String str="test";%>
		<% int num = add(2,3); 
			String test = "Hello";
		%>
		<%=num %> 번 반복합니다. <br/>
		<%
			for(int i=1 ; i <= num ; i++){
		%>
				<%=hello %> <%=world %> <br/>
				<%=str %>
		<%
			}
		%>
	</body>
</html>

