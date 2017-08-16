<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${product.category.name}</title>
</head>
<body>
<h2>${product.category.name}</h2>
<table>
    <!-- here should go some titles... -->


        <tr>
            <td>
                <a>
                    <c:out value="${product.name}"/>
                </a>
            </td>
            <td>
                <a>
                    <c:out value="${product.description}"/>
                </a>
            </td>
            <td>
                <a>
                    <c:out value="${product.price}"/>
                </a>
            </td>

        </tr>

</table>
</body>
</html>