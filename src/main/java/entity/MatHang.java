/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author TunazZz
 */
public class MatHang {
    private String maHang, tenHang, soLuong;
    private int giaBan;

    public MatHang(String tenHang, int giaBan) {
        this.tenHang = tenHang;
        this.giaBan = giaBan;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    
    
    public MatHang() {
    }

    public MatHang(String tenHang, String soLuong) {
        this.tenHang = tenHang;
        this.soLuong = soLuong;
    }

    
    public MatHang(String maHang, String tenHang, String soLuong) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
