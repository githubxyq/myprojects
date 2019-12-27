<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=">
<title></title>
</head>
<body>
<%@ include file="public/top.jsp" %>
<div style="width:100%;height:500px">
<!-- 显示用户信息 -->
名前：田
<br>
<jsp:useBean id="Email" class="com.bean.Email" scope="page"></jsp:useBean>
<jsp:getProperty property="dateTime" name="Email"/>
<br>
EL:${Email.dateTime}
<br/>
<jsp:getProperty property="str" name="Email"/>
</div>
<%@ include file="public/food.jsp" %>
</body>
</html>