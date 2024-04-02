<%--
  Created by IntelliJ IDEA.
  User: Phong
  Date: 3/28/2024
  Time: 12:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>List of Product</h1>
    <table border="1">
        <tr>
            <th>Product Id</th>
            <th>Product Name</th>
            <th>Quantity</th>
            <th>Price</th>
        </tr>
        <c:forEach items="${products}" var="product">
            <tr>
                <td> ${product.productId} </td>
                <td> ${product.productName} </td>
                <td> ${product.quantity} </td>
                <td> ${product.price} </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
