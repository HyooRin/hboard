<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h1>Can you join us?</h1>
	<form action="/bulletinBoard/user?action=insert" method="post">

		<label for="email">
		 이메일 : 
		 <input type="text" name="emailId" id="emailId" required="required">
		  <span>@</span>
		 <select>
				<option>naver.com</option>
				<option>gmail.com</option>
				<option>daum.net</option>
				<option>nate.com</option>
				<option>hanmail.com</option>
		</select>
		</label> 
		<label for="password"> 
		비밀번호 : 
		<input type="password" name="password" id=password required="required">
		</label>
		 
		<label for="name"> 
		닉네임 : 
		<input type="text" name="nickName" id="name" required="required">
		</label> 
		<input type="submit" value="Join">

	</form>

</body>
</html>