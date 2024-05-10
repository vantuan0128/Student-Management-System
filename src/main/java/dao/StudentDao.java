/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import entity.MatHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TunazZz
 */
public class StudentDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<MatHang> getAllStudent() {
        try {
            String query = "select * from mathang;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            List<MatHang> list = new ArrayList<>();
            while (rs.next()) {
                MatHang a;
                a = new MatHang(rs.getString(1), rs.getString(2), rs.getString(3));
                list.add(a);
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public void insertStudent(MatHang student) {
        String query = "insert into mathang(maHang,tenHang,soLuong) VALUES (?,?,?);";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, student.getMaHang());
            ps.setString(2, student.getTenHang());
            ps.setString(3, student.getSoLuong());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteStudent(String id) {
        String query = "delete from mathang where maHang = ? ;";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateStudent(MatHang student) {
        String query = "update mathang set tenHang = ?, soLuong = ? where maHang = ?;";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, student.getTenHang());
            ps.setString(2, student.getSoLuong());
            ps.setString(3, student.getMaHang());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<MatHang> getStudentByClass() {
        try {
            String query = "select distinct mathang.tenHang, (nhatkybanhang.giaBan / nhatkybanhang.soLuong) as giaGoc\n" +
                            "from nhatkybanhang, mathang\n" +
                            "where nhatkybanhang.giaBan / nhatkybanhang.soLuong > 100000\n" +
                            "and mathang.maHang = nhatkybanhang.maHang;";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            List<MatHang> list = new ArrayList<>();
            while (rs.next()) {
                MatHang a;
                a = new MatHang(rs.getString(1), 
                                rs.getInt(2));
                list.add(a);
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public MatHang getStudentById(String id) {
        String query = "select * from mathang where maHang = ?;";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getString(1), 
                                   rs.getString(2), 
                                   rs.getString(3),
                                   rs.getString(4),
                                   rs.getString(5),
                                   rs.getString(6));
            }

        } catch (Exception e) {
        }
        return null;
    }
}
