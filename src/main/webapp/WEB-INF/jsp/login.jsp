<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="kr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://kit.fontawesome.com/412dbb4333.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/styles.css" />
    <title>Login / MakaoTalk</title>
</head>
<body class="login-body">
<main class="login-screen">
    <div class="login-screen__image">
        <img src="${pageContext.request.contextPath}/resource/images/logo.png" class="login-screen__image logo" />
    </div>
    <div class="login-screen__main">
        <form id="form" method="get" action="/user/login">
            <input type="text" class="main__name" name="userName" placeholder="카카오 계정"/>
            <input type="password" class="main__pass" name="userPassword" placeholder="비밀번호"/>
        </form>
        <button class="main_button" name="login">로그인</button>
        <span class="login-screen__checkboxArea">
            <input type="checkbox" name="auto_login" class="checkbox__box" placeholder="">
            <label class="checkbox__text">
                실행시 자동 로그인
            </label>
        </span>
    </div>
</main>
<nav>
    <span class="nav__account">
        <a href="${pageContext.request.contextPath}/view/sign-up">회원가입</a> &verbar;
        <a href="#">마카오계정 찾기</a> &verbar;
        <a href="#">비밀번호 찾기</a>
    </span>
</nav>
<div class="bigScreen">
    <span class="bigScreen__text">Please make your screen small! 😣</span>
</div>
</body>
<script type="text/javascript">

    function loginClick() {

        const form = document.querySelector("#form");
        const name = document.querySelector("input[name=userName]");
        const password = document.querySelector("input[name=userPassword]");

        if(name.value === "" || name.value == null){
            alert("아이디를 입력해주세요.");
            name.focus();
            return false;
        }
        if(password.value === "" || password.value == null){
            alert("비밀번호를 입력해주세요.");
            password.focus();
            return false;
        }
        form.submit();


    }


    document.addEventListener("DOMContentLoaded",function(){
        document.querySelector('.main_button').onclick = () => {
            loginClick();
        };
    });
</script>
</html>