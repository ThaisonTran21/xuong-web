<%--
  Created by IntelliJ IDEA.
  User: SonOtis21
  Date: 7/12/2024
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách Giang Vien</title>
</head>
<body>
    Mã Giang Vien: ${gv.maGiangVien} <br>
    Địa chỉ: ${gv.diaChi} <br>
    Lương: ${gv.luong} <br>
    Ngày Sinh: ${gv.ngaySinh} <br>
    Gioi tính: ${gv.gioiTinh ? "Nam" : "Nữ"}

</body>
</html>
