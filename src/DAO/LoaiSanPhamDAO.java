/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.LoaiSanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tienich.JDBCHelper;

/**
 *
 * @author SuongNguyen
 */
public class LoaiSanPhamDAO implements DAO<LoaiSanPham, Integer>{

    private final String SQL_INSERT_LOAISANPHAM = "INSERT INTO hoadon(tenloaisanpham) VALUES(?)";
    private final String SQL_DELETE_LOAISANPHAM = "DELETE FROM LoaiSanPham WHERE maloaisanpham = ?";
    private final String SQL_SELECT = "SELECT * FROM LoaiSanPham";
    private final String SQL_SELECT_BY_ID = "SELECT * FROM LoaiSanPham WHERE mahoadon = ?";
    
    @Override
    public void insert(LoaiSanPham entity) {
        try {
            JDBCHelper.update(SQL_INSERT_LOAISANPHAM, entity.getTenLoaiSanPham());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Thêm thất bại");
        }
    }

    @Override
    public void delete(Integer id) { 
        try {
            JDBCHelper.update(SQL_DELETE_LOAISANPHAM, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(LoaiSanPham entity) {
        // không hỗ trợ
    }

    @Override
    public LoaiSanPham selectByID(Integer id) {
        List<LoaiSanPham> hoaDonList = this.selectBySQL(SQL_SELECT_BY_ID, id);
        if (hoaDonList.isEmpty())
            return null;
        return hoaDonList.get(0);
    }

    @Override
    public List<LoaiSanPham> selectAll() {
        return this.selectBySQL(SQL_SELECT);
    }

    @Override
    public List<LoaiSanPham> selectBySQL(String sql,Object...x) {
        List<LoaiSanPham> luongList = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.queryResult(sql, x);
            while (rs.next()) {
                LoaiSanPham lsp = new LoaiSanPham();
                lsp.setMaLoaiSanPham(rs.getInt("maloaisanpham"));
                lsp.setTenLoaiSanPham(rs.getString("tenloaisanpham"));
                luongList.add(lsp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return luongList;
    }
}
