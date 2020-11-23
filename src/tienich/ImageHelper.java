/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienich;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author SuongNguyen
 */
public class ImageHelper {
    public static ImageIcon getImage(String nameImage, int width, int height) {
        ImageIcon im = new ImageIcon("hinhanh\\"+nameImage);
        Image i = im.getImage().getScaledInstance(width, height, 0);
        return new ImageIcon(i);
    }
}
