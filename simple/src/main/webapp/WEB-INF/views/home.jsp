<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="/board/listAll">ListAll</a>
<a href="/board/listCri">ListCri</a>
<a href="/board/listPage">ListPage</a>
<a href="/board/listPageJS">ListPageJS</a>
<a href="/board/register">등록</a>
</body>
</html>
