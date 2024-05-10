/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.StudentDao;
import entity.MatHang;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TunazZz
 */
@WebServlet(urlPatterns={"/formcontrol"})
public class ShowFormControl extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentDao stu = new StudentDao();
        String studentId = req.getParameter("maHang");
        if(studentId != null){
            MatHang x = stu.getStudentById(studentId);
            req.setCharacterEncoding("UTF-8");
            resp.setCharacterEncoding("UTF-8");
            req.setAttribute("obj", x);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/update.jsp");
            dispatcher.forward(req, resp);
        }
        else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/add.jsp");
            dispatcher.forward(req, resp);
        }
    }
    
}
