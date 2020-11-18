/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author SuongNguyen
 */
public class Luong {
    private int maLuong;
    private String maNhanVien;
    private Date ngayDiLam;
    private float gioDen;
    private float gioVe;
    private String ghiChu;

    public Luong() {
    }

    public Luong(int maLuong, String maNhanVien, Date ngayDiLam, float gioDen, float gioVe, String ghiChu) {
        this.maLuong = maLuong;
        this.maNhanVien = maNhanVien;
        this.ngayDiLam = ngayDiLam;
        this.gioDen = gioDen;
        this.gioVe = gioVe;
        this.ghiChu = ghiChu;
    }

    public int getMaLuong() {
        return maLuong;
    }

    public void setMaLuong(int maLuong) {
        this.maLuong = maLuong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Date getNgayDiLam() {
        return ngayDiLam;
    }

    public void setNgayDiLam(Date ngayDiLam) {
        this.ngayDiLam = ngayDiLam;
    }

    public float getGioDen() {
        return gioDen;
    }

    public void setGioDen(float gioDen) {
        this.gioDen = gioDen;
    }

    public float getGioVe() {
        return gioVe;
    }

    public void setGioVe(float gioVe) {
        this.gioVe = gioVe;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    
    
    
}
