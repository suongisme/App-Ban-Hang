/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Luong;
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
public class LuongDAO implements DAO<Luong, Integer>{

    private final String SQL_INSERT_LUONG = "INSERT INTO luong(manhanvien,ngaydilam,gioden,giove,ghichu) VALUES(?,?,?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM luong";
    
    @Override
    public void insert(Luong entity) {
        try {
            JDBCHelper.update(SQL_INSERT_LUONG, entity.getMaNhanVien(),
                                                entity.getNgayDiLam(),
                                                entity.getGioDen(),
                                                entity.getGioVe(),
                                                entity.getGhiChu());
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
    public void update(Luong entity) {
        // không hỗ trợ
    }

    @Override
    public Luong selectByID(Integer id) {
        // không hỗ trợ
        return null;
    }

    @Override
    public List<Luong> selectAll() {
        return this.selectBySQL(SQL_SELECT);
    }

    @Override
    public List<Luong> selectBySQL(String sql,Object...x) {
        List<Luong> luongList = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.queryResult(sql, x);
            while (rs.next()) {
                Luong lg = new Luong();
                lg.setMaLuong(rs.getInt("maluong"));
                lg.setMaNhanVien(rs.getString("manhanvien"));
                lg.setNgayDiLam(rs.getDate("ngaydilam"));
                lg.setGioDen(rs.getFloat("gioden"));
                lg.setGioVe(rs.getFloat("giove"));
                lg.setGhiChu(rs.getString("ghichu"));
                luongList.add(lg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return luongList;
    }
    
    public List<Luong> getLuongByDate(int year, int month, int date) throws SQLException {
        String sql = "SELECT * FROM luong where ngaydilam = ?";

        Calendar a = Calendar.getInstance();
        a.set(year, month-1, date);
        Date dt = a.getTime();
        
        return this.selectBySQL(sql, dt);
    }
}
