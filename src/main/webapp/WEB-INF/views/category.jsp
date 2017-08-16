<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${category.name}</title>
</head>
<body>
<table>
    <!-- here should go some titles... -->
    <tr>
        <th>ISBN</th>
        <th>Title</th>
        <th>Authors</th>
        <th>Version</th>
    </tr>
    <c:forEach  var="product" items="${category.products}">
        <tr>
            <td>
                <a href="<c:out value="/product?id=${product.id}"/>">
                    <c:out value="${product.name}"/>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="<c:out value="/product/add"/>">Add</a>
</body>
</html>
