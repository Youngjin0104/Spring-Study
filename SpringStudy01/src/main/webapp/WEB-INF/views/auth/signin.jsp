<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α���</title>
</head>
<body>
	�α���������
	
	<input type="hidden" id="signin-flag" value="${empty signinRespDto.signinFlag ? '' : signinRespDto.signinFlag}">

	<form action="/study/signin" method="post">
		���̵�: <input type="text" name="username" value="${signinRespDto.username}" required="required"><br> 
		��й�ȣ: <input type="password" name="password" value="${signinRespDto.password}" required="required"><br>
		<button>�α���</button>
	</form>
	<button type="button" onclick="location.href='/study/signup'">ȸ������</button>
	<input type="text" value="${principal.name}">
<script type="text/javascript">
	const signinFlag = document.querySelector('#signin-flag');
	if(signinFlag.value == '0') {
		alert('�������� �ʴ� ���̵� �Դϴ�.');
	}else if(signinFlag.value == '1') {
		alert('��й�ȣ�� Ʋ�Ƚ��ϴ�.')
	}
</script>
</body>
</html>