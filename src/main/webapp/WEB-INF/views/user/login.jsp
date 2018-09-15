<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>내담씨앤시 경력관리 시스템</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<style>
html, table, tr, td{  font: inherit; }
.navi{ padding: 10px;}
.navi_menu{ padding: 10px 30px 10px 30px; }
.main_menu a{text-align: center; font-size: 18px; font-weight: bold; margin: 25%; color: #000000; text-decoration: none;}
.content .title{ font-size: 30px; margin-left: 35%; margin-top: 20px;}
.content .description{ font-size: 17px; margin-left: 23%; margin-top: 5px;}
.login_box{border: 3px solid #55555573; margin: 10% 30%;}
.btn_login{ background-color: #008CBA; text-decoration: none; border: 1px solid #045FB4; color: white; padding: 14px;}
.login_bo tr, login_bo td{padding: 10px;}
</style>

<body>
	<div class="navi">
		<hr>
			<div class="navi_menu">
				<div class="logo">
					<a href="http://www.ndcc.co.kr/"><img src="http://www.ndcc.co.kr//assets/images/main/logo_color.png" alt="Logo"></a>
					<span class="main_menu"><a href="#">경력관리</a></span>
				</div>
			</div>
		<hr>	
		<div class="content">
			<div class="title">ND SW기술자 경력관리 시스템</div>		
			<div class="description">ND기술자의 경력을 체계적 관리하고, 개발자 배치를 효율적으로 관리 하는 시스템입니다.</div>
		</div>
		
		<table class="login_box">
			<tr>
				<td>회원로그인</td>
			</tr>
			<tr>
				<td>아이디 </td><td><input type="text" id="user_id"></td>
				<td rowspan="2"><button type="button" class="btn_login" id="btnLogin">로그인</button></td>
			</tr>
			<tr>
				<td>비밀번호 </td><td><input type="password" id="user_pw"></td>
			</tr>
		</table>
	</div>	
</body>
<script>

</script>
</html>
