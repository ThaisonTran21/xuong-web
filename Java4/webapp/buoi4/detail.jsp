<%--
  Created by IntelliJ IDEA.
  User: SonOtis21
  Date: 7/10/2024
  Time: 12:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Mã Sinh Viên : ${sv.maSinhVien} <br>
    Tên : ${sv.ten} <br>
    Tuổi : ${sv.tuoi} <br>
    Giới Tính : ${sv.gioiTinh ? "Nam" : "Nữ"} <br> <br>
    <a href="/sinh-vien/hien-thi">Quay lại danh sách sinh viên</a>
</body>
</html>
