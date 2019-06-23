<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Đà Nẵng</title>
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/logo.ico"/>
    <style>
        #main-body{
            text-align: center;
            margin-top: 100px;
        }
        .enormous-font{
            font-size: 10em;
            margin-bottom: 0em;
        }
        .big-font{
            font-size: 2em;
        }
        hr{
            width: 25%;
            height: 1px;
            background: #1f3759;
            border: 0px;
        }
    </style>
</head>

<body class="body-fixed">
<jsp:include page="masterPage.jsp"/>
<jsp:include page="header.jsp"/>
<div id="container-fluid">
    <div class="row">
        <div id="main-body">
            <p class="enormous-font">${errorCode}</p>
            <p class="big-font">${errorMsg}</p>
            <hr>
            <a href="${pageContext.request.contextPath}/">Trở về trang chủ</a>
        </div>
    </div>
</div>
</body>
</html>