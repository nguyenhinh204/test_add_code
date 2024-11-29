<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>
<div class="container">
    <h2 class="mb-4 text-center">Danh Sách màu sắc</h2>
    <a href="/asm/addms" class="btn btn-primary mb-3">Thêm Mới màu sắc</a>
    <form action="/asm/searchms" method="get">
        <input type="text" name="id">
        <button type="submit">Search</button>
    </form>
</div>
<table border="1" class="table">
    <thead>
    <tr>
        <th>id màu sắc</th>
        <th>mã màu sắc</th>
        <th>tên màu sắc</th>
        <th>trang thái</th>
        <th>action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listms}" var="ms">
        <tr>

            <td>${ms.id}</td>
            <td>${ms.mams}</td>
            <td>${ms.tenms}</td>
            <td>${ms.trangThai?"hết màu":"còn màu"}</td>
            <td>
                <button type="submit"><a href="/asm/xoams?id=${ms.id}">xoá </a></button>
                <button type="submit"><a href="/asm/updatems?id=${ms.id}">sửa </a></button>
                <button type="submit"><a href="/asm/detailsms?id=${ms.id}">detail </a></button>


            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/asm/view"
   style="background-color: #007bff; border-color: #007bff; color: #ffffff; padding: 10px 15px; border-radius: 5px; text-decoration: none; display: inline-block; font-weight: bold; text-align: center; margin-top: 20px;">Quay
    lại</a>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>