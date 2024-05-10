<%-- 
    Document   : index
    Created on : Oct 23, 2023, 9:48:41 AM
    Author     : admin
--%>

<%@page import="entity.MatHang"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.List"%>
<%@page import="dao.StudentDao"%>
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
                <h3 class="text-center">Danh sách mặt hàng</h3>
                <hr>
                <br>
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>Mã hàng</th>
                            <th>Tên hàng</th>
                            <th>Số lượng</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            StudentDao std = new StudentDao();
                            List<MatHang> listStudent = std.getAllStudent();
                            for(MatHang student : listStudent){
                        %>
                        <tr>
                            <td><%= student.getMaHang() %></td>
                            <td><%= student.getTenHang() %></td>
                            <td><%= student.getSoLuong() %></td>
                            <td><a href="formcontrol?maHang=<%= student.getMaHang()%>">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; 
                                <a href="delete?maHang=<%= student.getMaHang()%>"">Delete</a></td>
                        </tr>
                            
                        <%
                            }
                        %>

                    </tbody>

                </table>
                <div class="container text-left">
                    <a href="<%=request.getContextPath()%>/formcontrol" class="btn btn-success">Add</a>
                </div>
                <div class="container text-right">
                    <a href="<%=request.getContextPath()%>/findQT" class="btn btn-success">Find</a>
                </div>
            </div>
        </div>
    </body>

</html>
