/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienich;

import java.awt.Dimension;
import javax.swing.JFileChooser;

/**
 *
 * @author SuongNguyen
 */
public class WindowChoose extends JFileChooser {

    public static String path;
    private static JFileChooser file = new JFileChooser();
    private static Dimension size = new Dimension(700, 500);

    public static boolean openSave() {
        file.setPreferredSize(size);
        int a = file.showOpenDialog(null);
        if (a == JFileChooser.APPROVE_OPTION) {
            path = file.getSelectedFile().getAbsolutePath();
            return true;
        }
        return false;
    }

    public static boolean openChoose() {
        file.setPreferredSize(size);
        int a = file.showOpenDialog(null);
        if (a == JFileChooser.APPROVE_OPTION) {
            path = file.getSelectedFile().getAbsolutePath();
            return true;
        }
        return false;
    }
}
