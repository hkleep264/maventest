<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>
    user list  
</h1>
<table border="1">
    <tr align="center">
        <td width="100px">아이디</td>
        <td width="100px">비밀번호</td>
        <td width="100px">이름</td>
        <td width="100px">나이</td>
        <td width="100px">전화번호</td>
        <td width="200px">주소</td>
        <td width="200px">가입날짜</td>
    </tr>
<c:forEach var="user" items="${users}">
    <tr align="center">
        <td>${user.id}</td>
        <td>${user.pass}</td>
        <td>${user.name}</td>
        <td>${user.age}</td>
        <td>${user.pnum}</td>
        <td>${user.address}</td>
        <td>${user.created}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>