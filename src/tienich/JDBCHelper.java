/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienich;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SuongNguyen
 */
public class JDBCHelper {

    private static Connection con;
    private static final String USER = "admin";
    private static final String PASSWORD = "123@123";
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String CONNECT = "jdbc:sqlserver://localhost:1433;databasename=AppBanHang";

    public static void openConnection() throws SQLException, ClassNotFoundException {
        Class.forName(DRIVER);
        con = DriverManager.getConnection(CONNECT, USER, PASSWORD);
    }

    private static PreparedStatement getPrepareStatement(String sql, Object... parameter) throws SQLException {
        PreparedStatement pre = compareTo(sql);
        addParameterTo(pre, parameter);
        return pre;
    }

    // kiem tra sql la procedure stored hay sql binh thuong
    private static PreparedStatement compareTo(String sql) throws SQLException {
        return sql.startsWith("{") ? con.prepareCall(sql) : con.prepareStatement(sql);
    }

    // them cac tham so vao PreparedStatement
    private static void addParameterTo(PreparedStatement pre, Object... x) throws SQLException {
        for (int i = 0; i < x.length; i++) {
            pre.setObject(i + 1, x[i]);
        }
    }

    public static int update(String sql, Object... parameter) throws SQLException {
        return getPrepareStatement(sql, parameter).executeUpdate();
    }

    public static ResultSet queryResult(String sql, Object... parameter) throws SQLException {
        return getPrepareStatement(sql, parameter).executeQuery();
    }
}
