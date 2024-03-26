<%--
  Created by IntelliJ IDEA.
  User: Phong
  Date: 3/19/2024
  Time: 12:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách Người yêu</title>
</head>
<body>
    <h1>Danh sách Người yêu</h1>
    <a href="khai-bao-nguoi-yeu">Khai báo người yêu</a>

    <form action="nguoi-yeu">
        <input type="text" name="keyword" value="${param.keyword}"/>
        <input type="submit" value="Tìm kiếm"/>
    </form>
    <table border="1">
        <tr>
            <th> Mã người yêu </th>
            <th> Tên người yêu </th>
            <th> Sinh nhật </th>
            <th> Chiều cao </th>
            <th> Cân nặng </th>
        </tr>
        <c:forEach items="${dsNguoiYeu}" var="nguoiYeu">
            <tr>
                <td>
                    <a href="khai-bao-nguoi-yeu?id=${nguoiYeu.ma}"> ${nguoiYeu.ma} </a>
                </td>
                <td> ${nguoiYeu.hoTen} </td>
                <td> ${nguoiYeu.sinhNhat} </td>
                <td> ${nguoiYeu.chieuCao} </td>
                <td> ${nguoiYeu.canNang} </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
