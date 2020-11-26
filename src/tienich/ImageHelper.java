/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienich;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
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
    
    public static void copy(String path) throws IOException {
        File from = new File(path);
        File to = new File("hinhanh\\",from.getName());
        if (to.exists()) return;
        Files.copy(from.toPath(), to.toPath());
    }
    
    public static void delete(String nameImage) throws IOException {
        File file = new File("hinhanh\\",nameImage);
        if (!file.exists()) return;
        Files.delete(file.toPath());
    }
}
