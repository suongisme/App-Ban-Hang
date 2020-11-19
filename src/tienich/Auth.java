/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienich;

import entity.NhanVien;

/**
 *
 * @author SuongNguyen
 */
public class Auth {
    public static NhanVien user;
    
    public static boolean isManger() {
        return "Quản lý".equalsIgnoreCase(user.getLoaiNhanVien());
    }
    
    public static void logout() {
        user = null;
    }
}
