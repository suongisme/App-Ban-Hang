/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tienich.JDBCHelper;

/**
 *
 * @author SuongNguyen
 */
public class ThongKeDAO {
    public static List<Object[]> doanhThu(int nam, int thang) throws SQLException {
        String cols[] = {"thang","donlonnhat","donnhonhat","tongtien"};
        String sqlpro = "{CALL pro_mathangbanchay(?,?,?)}";
        
        return getProcedure(sqlpro, cols, nam, thang);
    }
    
    public static List<Object[]> matHangBanChay(int thang, int nam, boolean isForeigner) throws SQLException{
        String cols[] = {"masanpham","tensanpham","thoigian","soluong"};
        String sqlpro = "{CALL pro_mathangbanchay(?,?,?)}";
        
        return getProcedure(sqlpro, cols, thang, nam, isForeigner);
    }
    
    public static List<Object[]> luongNhanVien(int thang, int nam) throws SQLException{
        String cols[] = {"manhanvien","tennhanvien","thoigian","tonggiolam"};
        String sqlpro = "{CALL pro_luongnhanvien(?,?)}";
        
        return getProcedure(sqlpro, cols, thang, nam);
    }
    
    private static List<Object[]> getProcedure(String sqlPro,String[] cols, Object...parameter) throws SQLException {
        List<Object[]> obList = new ArrayList<>();
        ResultSet rs = JDBCHelper.queryResult(sqlPro, parameter);
        while (rs.next()) {
            Object[] obArray = new Object[cols.length];
            for (int i = 0; i < obArray.length; i++) {
                obArray[i] = cols[i];
            }
            obList.add(obArray);
        }
        return obList;
    }
}
