<%-- 
    Document   : showQT
    Created on : Oct 24, 2023, 8:48:04 PM
    Author     : admin
--%>

<%@page import="entity.MatHang"%>
<%@page import="java.util.List"%>
<%@page import="dao.StudentDao"%>
<%-- 
    Document   : index
    Created on : Oct 23, 2023, 9:48:41 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>

    <head>
        <title>Management Application</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
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

        <div class="row">
            <div class="container">
                <h3 class="text-center">Giá bán các mặt hàng có giá > 100.000</h3>
                <hr>
                <br>
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>Tên hàng</th>
                            <th>Giá bán</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%  
                            StudentDao std = new StudentDao();
                            List<MatHang> listStudentByClass = std.getStudentByClass();
                            for(MatHang student : listStudentByClass){
                        %>
                        <tr>
                            <td><%= student.getTenHang()%></td>
                            <td><%= student.getGiaBan() %></td>
                        </tr>
                            
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
            <div class="container text-left">
                <a href="<%=request.getContextPath()%>/" class="btn btn-success">Back</a>
            </div>
        </div>
    </body>

</html>

