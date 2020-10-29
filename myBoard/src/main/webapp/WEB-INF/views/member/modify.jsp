<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>kuzuro 게시판</title>
</head>
<body>

<form role="form" method="post" autocomplete="off">
	
	<p>
		<label for="userName">닉네임</label>
		<input type="text" id="userName" name="userName" value="${member.userName}" readonly="readonly"/>
<%-- 매퍼에 있는 쿼리에는 닉네임(userName)을 받아서 조건으로 사용하기 때문에, 
name값이 userName인 인풋박스의 value에 ${member.userName}를 넣고 읽기전용(readonly)속성을 설정합니다.
여기서 ${member.userName} 는 로그인하면서 받은 세션에 부여된 값입니다. --%>
	</p>
	
	<p>
		<label for="userPass">새로운 패스워드</label>
		<input type="password" id="userPass" name="userPass" />
	</p>
	<p>
		<button type="submit">회원정보 수정</button>
	</p>		
	
	<p>
		<a href="/">처음으로</a>
	</p>
	
</form>


</body>
</html>