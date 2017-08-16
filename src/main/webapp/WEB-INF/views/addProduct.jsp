<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Kate
  Date: 04.05.17
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addProduct</title>
</head>
<body>
<h2>
    <c:if test="${not empty productName}">
        <div class="msg">${productName} added successfully</div>
    </c:if>
</h2>
<form:form method="post" action="/product/add" modelAttribute="product">

    <form:label path="name">Product Name</form:label>
    <form:input type="text" path="name"/>

    <form:label path="description">Description</form:label>
    <form:input path="description" type="text"/>

    <form:label path="price">Price</form:label>
    <form:input path="price" type="text"/>

    <form:label path="category.id">Category</form:label>
    <form:select path="category.id">
            <form:options items="${allCategories}" itemValue="id" itemLabel="name"/>
    </form:select>
    <button type="submit" >Add</button>
</form:form>

</body>
</html>
