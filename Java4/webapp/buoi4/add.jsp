<%--
  Created by IntelliJ IDEA.
  User: SonOtis21
  Date: 7/10/2024
  Time: 12:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Thêm sinh viên</h1>
    <form action="/sinh-vien/add" method="post">
        Ma sinh vien: <input type="text" name="maSinhVien"> <br>
        Ten: <input type="text" name="ten"> <br>
        Tuoi: <input type="text" name="tuoi"> <br>
        Gioi tinh: <input type="radio" name="gioiTinh" value="true" checked> Nam
        <input type="radio" name="gioiTinh" value="false"> Nu <br>
        <button type="submit">Add</button>
    </form>
</body>
</html>
