<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset='utf-8'>
    <title>Home page</title>
    <jsp:include page="common/masterPage.jsp"/>
</head>

<body class="body-fixed">
<%-- Main Menu --%>
<jsp:include page="common/header.jsp"/>
<%-- Main content --%>
<div class="container-fluid">
    Welcome to homepage.
</div>
</body>
</html>