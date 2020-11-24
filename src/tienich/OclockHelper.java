/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienich;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author SuongNguyen
 */
public class OclockHelper extends Thread {
    private final JLabel lblOclock;
    private SimpleDateFormat simpleDate = new SimpleDateFormat("EEE dd-MMM-yyyy hh:mm:ss");
    private OclockHelper(JLabel lblOclock) {
        this.lblOclock = lblOclock;
        start();
    }
    
    public static void startOclock(JLabel lblOclock) {
        OclockHelper oclockHelper = new OclockHelper(lblOclock);
    }
    
    @Override
    public void run() {
        while (true) {
            lblOclock.setText(simpleDate.format(new Date()));
        }
    }
    
}
