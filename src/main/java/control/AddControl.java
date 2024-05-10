/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.StudentDao;
import entity.MatHang;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TunazZz
 */
@WebServlet(urlPatterns={"/insert"})
public class AddControl extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentDao std = new StudentDao();
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String studentId = req.getParameter("maHang");
        String firstName = req.getParameter("tenHang");
        String lastName = req.getParameter("soLuong");
        MatHang x = new MatHang(studentId,firstName,lastName);
        std.insertStudent(x);
        resp.sendRedirect("index.jsp");
    }
    
}
