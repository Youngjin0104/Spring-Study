<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
	ȸ������ ������

	<form action="/study/signup" method="post">
		<label class="ip-names">���̵�</label>
		<input type="text" class="signup-ip" name="username" required="required">
		<button type="button" id="id-check">�ߺ�Ȯ��</button><br>
		
		<label class="ip-names">��й�ȣ</label> 
		<input type="password" class="signup-ip" name="password" required="required"><br> 
		<label class="ip-names">�̸�</label>
		<input type="text" class="signup-ip" name="name" required="required"><br> 
		<label class="ip-names">�̸���</label>
		<input	type="email" class="signup-ip" name="email" required="required"><br>
		<button type="button" id="signup-btn">ȸ������</button>
		<button type="reset">���ۼ�</button>
	</form>
	
	<div class="test-text">�ȳ��ϼ���</div>
	
	<button type="button" onclick="location.href='/study/signin'">�α���</button>
	
	<script src="/study/resources/signupAjax.js"></script>
	
</body>
</html>