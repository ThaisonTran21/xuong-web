<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: SonOtis21
  Date: 7/12/2024
  Time: 3:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách Giang Vien</title>
</head>
<body>
<button><a href="/giang-vien/view-add">Thêm giảng viên</a></button>
 <h1>Danh sách giảng viên</h1>
<table>
    <thead>
        <th>STT</th>
        <th>Mã giảng viên</th>
        <th>Địa chỉ</th>
        <th>Lương</th>
        <th>Ngày sinh</th>
        <th>Giới tính</th>
        <th colspan="3">Hành động</th>
    </thead>
    <tbody>
        <c:forEach items="${lstgv}" var="gv" varStatus="i">
            <tr>
                <td>${i.index + 1}</td>
                <td>${gv.maGiangVien}</td>
                <td>${gv.diaChi}</td>
                <td>${gv.luong}</td>
                <td>${gv.ngaySinh}</td>
                <td>${gv.gioiTinh ? "Nam" : "Nữ"}</td>
                <td>
                    <a href="/giang-vien/detail?id=${gv.maGiangVien}">Detail</a>
                    <a href="/giang-vien/view-update?id=${gv.maGiangVien}">Update</a>
                    <a href="/giang-vien/delete?id=${gv.maGiangVien}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
