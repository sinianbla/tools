<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<link href="https://cdn.bootcss.com/bootstrap/4.1.1/css/bootstrap.css"
	rel="stylesheet">
</head>
<body>
	<div id="login" style="padding-top: 28px">
		<div class="">
			<label class="col-2" for="loginName"
				style="text-align: right">登录名：</label> <input id="loginName"
				name="loginName" v-model="loginName">
		</div>
		<div>
			 <label class="col-2" for="password"
				style="text-align: right">密码：</label> <input id="password"
				name="password" type="password" v-model="password">
			<button id="loginBtn" class="btn btn-primary" v-on:click="login">登录</button>
		</div>
	</div>
	<div id="loginInfo">
		<h1 id="userInfo"></h1>
	</div>
</body>
<script src="../static/js/vue-2.5.17.js"></script>
<script src="../static/js/login/login.js"></script>
<script src="../static/js/axios-0.18.0.js"></script>
</html>