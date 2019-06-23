<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="navbar-header">
        <img src="${pageContext.request.contextPath}/resources/images/logo.png"
             style="height: 40px; float: left;" alt="logo">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/home"></a>
    </div>

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/home">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Blogs
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Spring</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Javascript</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Angular</a>
                </div>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Demo
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">JWT</a>
                </div>
            </li>
        </ul>
    </div>
</nav>