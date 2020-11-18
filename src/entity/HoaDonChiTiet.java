/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author SuongNguyen
 */
public class HoaDonChiTiet {
    private String maSanPham;
    private int maHoaDon;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String maSanPham, int maHoaDon) {
        this.maSanPham = maSanPham;
        this.maHoaDon = maHoaDon;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    
    
}
