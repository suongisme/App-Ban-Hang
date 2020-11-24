/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienich;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author SuongNguyen
 */
public class ExcelHelper {
    
    public static List<Object[]> readExcelFile(String path, int sheet) throws FileNotFoundException, IOException {
        List<Object[]> obList = new ArrayList<>();
        File file = new File(path);
        FileInputStream input = new FileInputStream(file);
        Workbook wb = new XSSFWorkbook(input);
        Sheet sh = wb.getSheetAt(sheet);
        for (Row row : sh) {
            Object[] obArray = new Object[6];
            for (int i=0; i<6; i++) {
                obArray[i] = row.getCell(i);
            }
            obList.add(obArray);
        }
        return obList;
    }
}
