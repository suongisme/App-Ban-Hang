/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.HoaDon;
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
public class HoaDonDAO implements DAO<HoaDon, Integer>{

    private final String SQL_INSERT_HOADON = "INSERT INTO hoadon(manhanvien,loaikhachhang,ngayxuathd) VALUES(?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM hoadon";
    private final String SQL_SELECT_BY_ID = "SELECT * FROM hoadon WHERE mahoadon = ?";
    
    @Override
    public void insert(HoaDon entity) {
        try {
            JDBCHelper.update(SQL_INSERT_HOADON, entity.getMaNhanVien(),entity.isLoaiKhachHang(),entity.getNgayXuatHoaDon());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Thêm thất bại");
        }
    }

    @Override
    public void delete(Integer id) { 
        // không hỗ trợ
    }

    @Override
    public void update(HoaDon entity) {
        // không hỗ trợ
    }

    @Override
    public HoaDon selectByID(Integer id) {
        List<HoaDon> hoaDonList = this.selectBySQL(SQL_SELECT_BY_ID, id);
        if (hoaDonList.isEmpty())
            return null;
        return hoaDonList.get(0);
    }

    @Override
    public List<HoaDon> selectAll() {
        return this.selectBySQL(SQL_SELECT);
    }

    @Override
    public List<HoaDon> selectBySQL(String sql,Object...x) {
        List<HoaDon> luongList = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.queryResult(sql, x);
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt("mahoadon"));
                hd.setMaNhanVien(rs.getString("manhanvien"));
                hd.setLoaiKhachHang(rs.getBoolean("loaikhachang"));
                hd.setNgayXuatHoaDon(rs.getDate("ngayxuathd"));
                luongList.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return luongList;
    }
    
    public List<HoaDon> getLuongByDate(int year, int month, int date) throws SQLException {
        String sql = "SELECT * FROM hoadon where ngayxuathd = ?";

        Calendar a = Calendar.getInstance();
        a.set(year, month-1, date);
        Date dt = a.getTime();
        
        return this.selectBySQL(sql, dt);
    }
}
