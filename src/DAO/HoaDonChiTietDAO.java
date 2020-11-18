/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.HoaDonChiTiet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import tienich.JDBCHelper;

/**
 *
 * @author SuongNguyen
 */
public class HoaDonChiTietDAO implements DAO<HoaDonChiTiet, Integer>{

    private final String SQL_SELECT_BY_MAHOADON = "SELECT * FROM hoadonchitiet WHERE mahoadon = ?";
    
    @Override
    public void insert(HoaDonChiTiet entity) {
       // không hỗ trợ
    }

    @Override
    public void delete(Integer id) { 
        // không hỗ trợ
    }

    @Override
    public void update(HoaDonChiTiet entity) {
        // không hỗ trợ
    }

    @Override
    public HoaDonChiTiet selectByID(Integer id) {
        // không hỗ trợ
        return null;
    }

    @Override
    public List<HoaDonChiTiet> selectAll() {
        // không hỗ trợ
        return null;
    }

    @Override
    public List<HoaDonChiTiet> selectBySQL(String sql,Object...x) {
        List<HoaDonChiTiet> luongList = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.queryResult(sql, x);
            while (rs.next()) {
                HoaDonChiTiet hdct = new HoaDonChiTiet();
                hdct.setMaHoaDon(rs.getInt("mahoadon"));
                hdct.setMaSanPham(rs.getString("masanpham"));
                luongList.add(hdct);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return luongList;
    }
    
    public List<HoaDonChiTiet> selectByMaHoaDon(int mahoadon) {
        return this.selectBySQL(SQL_SELECT_BY_MAHOADON, mahoadon);
    }
   
}
