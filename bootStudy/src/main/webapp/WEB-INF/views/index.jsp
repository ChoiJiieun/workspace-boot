<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> hi </h1>
<c:forEach items="${memList }" var="arr">
	<h3>${arr.memNm} : ${arr.memId}</h3>
</c:forEach>
</body>
</html>