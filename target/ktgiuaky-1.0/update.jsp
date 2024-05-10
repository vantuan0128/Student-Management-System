<%-- 
    Document   : add
    Created on : Oct 23, 2023, 9:35:06 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

    <head>
        <title>Management Application</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>

    <body>

        <header>
            <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                <div>
                    <a href="" class="navbar-brand"> 
                        Management App </a>
                </div>

            </nav>
        </header>
        <br>
        <div class="container col-md-5">
            <div class="card">
                <div class="card-body">
                    <form action="update" method="post">

                        <caption>
                            <h2>Chỉnh sửa mặt hàng</h2>
                        </caption>
                        <fieldset class="form-group">
                            <label>Mã hàng</label>
                            <input type="text" readonly value="<c:out value='${obj.getMaHang()}' />" class="form-control" name="maHang">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>Tên hàng</label> <input type="text" value="<c:out value='${obj.getTenHang()}' />" class="form-control" name="tenHang" required>
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Số lượng</label> <input type="text" value="<c:out value='${obj.getSoLuong()}' />" class="form-control" name="soLuong" required>
                        </fieldset>

                        <button type="submit" class="btn btn-success">Save</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
