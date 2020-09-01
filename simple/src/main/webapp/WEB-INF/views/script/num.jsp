<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	String str = "안녕하세요!";
	int a = 5, b = -5;

	public int abs(int n) {
		if (n < 0) {
			n = -n;
		}
		
		return n;
	}
	
	
%>
<%
	int num1 = 20;
	int num2 = 10;
	int add = num1 + num2;
	out.print(num1 + " + " + num2 + " = " + add + "<br>");
	out.print(str + "<br>");
	out.print(a + "의 절대값 : " + abs(a) + "<br>");
	out.print(b + "의 절대값 : " + abs(b) + "<br>");
%>

<%!
	int global_cnt = 0;
%>

<%
	int local_cnt = 0;

	out.print("<br> local_cnt : ");
	out.print(++local_cnt);
	out.print("<br> global_cnt : ");
	out.print(++global_cnt);
	out.print("<br><br>");
%>
<%= "표현식" +  global_cnt %>
<%= str %> <br>
<%= a %>의 절대값 : <%= abs(a) %><br>
<%= b %>의 절대값 : <%= abs(b) %><br>
</body>
</html>