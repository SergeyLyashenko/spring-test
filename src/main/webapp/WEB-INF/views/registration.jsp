<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<form:form method="post" action="/registration" modelAttribute="newUser">

    <form:label path="name">Name</form:label>
    <form:input type="text" path="username"/>

    <form:label path="password">Password</form:label>
    <form:input path="password" type="password"/>

    <form:label path="email">Email</form:label>
    <form:input path="email" type="text"/>
    <button type="submit">Log In</button>
</form:form>

</body>
</html>