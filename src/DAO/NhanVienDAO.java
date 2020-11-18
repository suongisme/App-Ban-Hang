/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tienich.JDBCHelper;

/**
 *
 * @author SuongNguyen
 */
public class NhanVienDAO implements DAO<NhanVien, String>{

    private final String SQL_INSERT_NHANVIEN = "INSERT INTO nhanvien(manhanvien,tennhanvien,loainhanvien,gioitinh,ngaysinh,diachi,sdt,emai,matkhau,hesoluong,hinh)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    private final String SQL_UPDATE_NHANVIEN = "UPDATE nhanvien SET tennhanvien = ?, loainhanvien = ?, gioitinh = ?, ngaysinh = ?, diachi = ?, sdt = ?, emai = ?, matkhau = ?, hesoluong = ?, hinh WHERE manhanvine = ?";
    private final String SQL_DELETE_NHANVIEN = "DELETE FROM nhanvien where manhanvien = ?";
    private final String SQL_SELECT = "SELECT * FROM nhanvien";
    private final String SQL_SELECT_BY_ID = "SELECT * FROM nhanvien WHERE manhanvien = ?";
    
    @Override
    public void insert(NhanVien entity) {
        try {
            JDBCHelper.update(SQL_INSERT_NHANVIEN,  entity.getMaNhanVien(),
                                                    entity.getTenNhanVien(),
                                                    entity.getLoaiNhanVien(),
                                                    entity.isGioiTinh(),
                                                    entity.getNgaySinh(),
                                                    entity.getDiaChi(),
                                                    entity.getSdt(),
                                                    entity.getEmail(),
                                                    entity.getMatKhau(),
                                                    entity.getHeSoLuong(),
                                                    entity.getHinh());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Thêm thất bại");
        }
    }

    @Override
    public void delete(String id) {
        try {
            JDBCHelper.update(SQL_DELETE_NHANVIEN, id);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Xóa thất bại");
        }
    }

    @Override
    public void update(NhanVien entity) {
        try {
            JDBCHelper.update(SQL_UPDATE_NHANVIEN,  entity.getTenNhanVien(),
                                                    entity.getLoaiNhanVien(),
                                                    entity.isGioiTinh(),
                                                    entity.getNgaySinh(),
                                                    entity.getDiaChi(),
                                                    entity.getSdt(),
                                                    entity.getEmail(),
                                                    entity.getMatKhau(),
                                                    entity.getHeSoLuong(),
                                                    entity.getHinh(),
                                                    entity.getMaNhanVien());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Cập nhật thất bại");
        }
    }

    @Override
    public NhanVien selectByID(String id) {
        List<NhanVien> nhanVienList = selectBySQL(SQL_SELECT_BY_ID, id);
        if (nhanVienList.isEmpty()) {
            return null;
        }
        return nhanVienList.get(0);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySQL(SQL_SELECT);
    }

    @Override
    public List<NhanVien> selectBySQL(String sql,Object...x) {
        List<NhanVien> nhanVienList = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.queryResult(sql, x);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString("manhanvien"));
                nv.setTenNhanVien(rs.getString("tennhanvien"));
                nv.setLoaiNhanVien(rs.getString("loainhanvien"));
                nv.setGioiTinh(rs.getBoolean("gioitinh"));
                nv.setNgaySinh(rs.getDate("ngaysinh"));
                nv.setDiaChi(rs.getString("diachi"));
                nv.setSdt(rs.getString("sdt"));
                nv.setEmail(rs.getString("email"));
                nv.setMatKhau(rs.getString("matkhau"));
                nv.setHeSoLuong((float)rs.getDouble("hesoluong"));
                nv.setHinh(rs.getString("hinh"));
                nhanVienList.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nhanVienList;
    }
}
