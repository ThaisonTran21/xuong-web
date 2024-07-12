<%--
  Created by IntelliJ IDEA.
  User: SonOtis21
  Date: 7/10/2024
  Time: 12:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Update sinh viên</h1>
    <form action="/sinh-vien/update" method="post">
        Mã sinh viên: <input type="hidden" name="maSinhVien" value="${sv.maSinhVien}"> <br>
        Tên: <input type="text" name="ten" value="${sv.ten}"> <br>
        Tuổi: <input type="number" name="tuoi" value="${sv.tuoi}"> <br>
        Giới tính:  <input type="radio" name="gioiTinh" value="true" ${sv.gioiTinh ? "checked" : ""}>Nam
                    <input type="radio" name="gioiTinh" value="false" ${sv.gioiTinh ? "" : "checked"}>Nu <br>

        <button type="submit">Update sinh viên</button>
    </form>
</body>
</html>
