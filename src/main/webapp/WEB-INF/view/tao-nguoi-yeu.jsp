<%--
  Created by IntelliJ IDEA.
  User: Phong
  Date: 3/21/2024
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Khai báo người yêu</title>
</head>
<body>
    <h1> Khai báo người yêu mới </h1>
    <form action="khai-bao-nguoi-yeu" method="POST">
        <p>
            Họ tên <input type="text" name="hoTen" value="${nguoiYeu.hoTen}"/>
        </p>
        <p>
            Sinh nhật<input type="date" name="sinhNhat" value="${nguoiYeu.sinhNhatHTML}"/>
        </p>
        <p>
            Cân nặng (50 ~ 100) <input type="range" name="canNang" min="50" max="100" value="${nguoiYeu.canNang}"/>
        </p>
        <p>
            Chiều cao <input type="number" name="chieuCao" step="0.01" value="${nguoiYeu.chieuCao}"/>
        </p>
        <p>
            Giới tính
            <input type="radio" name="gioiTinh" value="Nam" <c:if test="${nguoiYeu.gioiTinh}">checked</c:if> /> Nam
            <input type="radio" name="gioiTinh" value="Nữ" <c:if test="${not nguoiYeu.gioiTinh}">checked</c:if> /> Nữ
        </p>
        <p>
            Quê quán
            <select name="queQuan">
                <c:forEach items="${dsTinhThanh}" var="tinhThanh">
                <option value="${tinhThanh}"
                        <c:if test="${nguoiYeu.queQuan eq tinhThanh}"> selected </c:if>
                >
                        ${tinhThanh.name}
                </option>
                </c:forEach>
            </select>
        </p>
        <p>
            <input type="submit" value="Save">
        </p>
    </form>
</body>
</html>
