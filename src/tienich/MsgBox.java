/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienich;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author SuongNguyen
 */
public class MsgBox {
    public static void notify(String message, Component com) {
        JOptionPane.showMessageDialog(com, message, "Thông báo", JOptionPane.WARNING_MESSAGE);
    }
    
    public static boolean confirm(String message, Component com) {
        int answer = JOptionPane.showConfirmDialog(com, message, "Xác nhận",JOptionPane.YES_NO_OPTION);
        return answer == JOptionPane.YES_OPTION;
    }
}
