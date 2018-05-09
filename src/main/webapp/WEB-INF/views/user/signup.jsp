<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>signup.jsp</title>
</head>
 <script type="text/javascript">
 
 function check(){
  var id 	= document.getElementById('id');
  var pw 	= document.getElementById('pw');
  var name 	= document.getElementById('name');
  var age 	= document.getElementById('age');
  var pnum 	= document.getElementById('pnum');
  var address = document.getElementById('address');
  
  if(id.value == '' || id.value == null){
   alert('아이디를 입력하세요');
   return false;
  }
  
  if(pw.value == '' || pw.value == null){
   alert('비밀번호를 입력하세요');
   return false;
  }
  
  if(name.value == '' || name.value == null){
   alert('이름을 입력하세요');
   return false;
  }
  
  if(age.value == '' || age.value == null){
   alert('나이를 입력하세요');
   return false;
  }
  
  if(pnum.value == '' || pnum.value == null){
   alert('전화번호를 입력하세요');
   return false;
  }
  
  if(address.value == '' || address.value == null){
   alert('주소를 입력하세요');
   return false;
  }
  
  return save();
 }
 
 function save(){
  var data = document.getElementById('sign_data');
  data.submit();
 }

 
 </script>



<body>
<h1>
    회원가입
</h1>
<form id="sign_data" action = "/sign.do" method="post">
	아이디: <input id="id" type="text"></input>
	<br/>
	비밀번호: <input id="pw" type="password"></input>
	<br/>
	이름: <input id="name" type="text"></input>
	<br/>
	나이: <input id="age" type="text"></input>
	<br/>
	전화번호: <input id="pnum" type="text"></input>
	<br/>
	주소: <input id="address" type="text"></input>
	<br/>
</form>
</body>
<br/>
<input type = "button" value="저장" onclick="javascript:check();" />
<input type = "button" value="취소" />

</html>