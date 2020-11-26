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
public class LoaiSanPham {
    private String maLoaiSanPham;
    private String tenLoaiSanPham;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String maLoaiSanPham, String tenLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
        this.tenLoaiSanPham = tenLoaiSanPham;
    }

    public String getMaLoaiSanPham() {
        return maLoaiSanPham;
    }

    public void setMaLoaiSanPham(String maLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
    }

    public String getTenLoaiSanPham() {
        return tenLoaiSanPham;
    }

    public void setTenLoaiSanPham(String tenLoaiSanPham) {
        this.tenLoaiSanPham = tenLoaiSanPham;
    }

    @Override
    public String toString() {
        return this.getTenLoaiSanPham();
    }
    
    
    
}
