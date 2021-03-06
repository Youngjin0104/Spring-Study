const inputNames = document.querySelectorAll('.ip-names');
const signupInputs = document.querySelectorAll('.signup-ip');
const idCheck = document.querySelector('#id-check');
const signupForm = document.querySelector('form');
const signupBtn = document.querySelector('#signup-btn');


var idCheckFlag = false;

function usernameCheck() {
	let signupObj = {
		username: signupInputs[0].value,
		password: signupInputs[1].value,
		name: signupInputs[2].value,
		email: signupInputs[3].value
	}
	
	$.ajax({
		type: "get",
		url: "/study/signup/username-check",
		data: signupObj,
		dataType: "text",
		success: function(data){
			let signupRespObj = JSON.parse(data);
			
			idCheckFlag = signupRespObj.idCheckFlag;
			
			if(signupRespObj.idCheckFlag == true){
				alert('가입 가능한 아이디입니다.');
			}else{
				alert('이미 존재하는 아이디 입니다.');
			}
		},
		error: function(){
			alert('비동기처리오류');
		}
	});
}

idCheck.onclick = () => {
	let checkFlag = isEmpty(signupInputs[0], inputNames[0].textContent);
	if(checkFlag != 0) return;
	usernameCheck();
}

function isEmpty(signupInput, inputName) {
	let flag = 0;
	if(signupInput.value.length == 0) {
		flag = 1;
		alert(inputName + '을(를) 입력해 주세요.');
	}
	return flag;
}

signupBtn.onclick = () => {
	let checkFlag = 0; 
	
	for(let i = 0; i < signupInputs.length; i++) {
		checkFlag = isEmpty(signupInputs[i], inputNames[i].textContent);
		if(checkFlag != 0) return;
	}

	if(idCheckFlag != true) {
		alert('아이디 중복확인을 해주세요.');
		return;
	}

	signupForm.submit();
	
}

/*
signupValues[0].onblur = () => {
	const testText = document.querySelector('.test-text');
	testText.style.display = 'none';
	testText.innerHTML = '<a href="#">테스트</a>'
	const aTag = document.createElement('a');
	const href = document.createAttribute('href');
	aTag.setAttributeNode(href);
	aTag.href = '#';
	const text = document.createTextNode('테스트');
	aTag.appendChild(text);
	testText.appendChild(aTag);
}
*/