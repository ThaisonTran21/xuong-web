<%--
  Created by IntelliJ IDEA.
  User: SonOtis21
  Date: 6/26/2024
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/crud/them" method="post">
        Username: <input type="text" name="usr">
        <br>
        Quoc gia:
        <select name="quocGia">
            <option value="vn" label="Viet Nam"></option>
            <option value="usa" label="My"></option>
        </select>
        <br>
        Gioi tinh:
        Nam <input type="radio" name="gioiTinh" value="nam" checked>
        Nu <input type="radio" name="gioiTinh" value="nu">
        <br>
        Doc than khong?: <input type="checkbox" name="docThan">
        <br>
        <button type="submit">Login</button>
    </form>
</body>
</html>
