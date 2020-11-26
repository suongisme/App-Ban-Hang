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

    private static JLabel lblOclock;
    private static SimpleDateFormat simpleDate = new SimpleDateFormat("EEE dd-MMM-yyyy HH:mm:ss");
    private static Thread oclockThread;

    private static void createThreadOclock() {
        oclockThread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    lblOclock.setText(simpleDate.format(new Date()));
                }
            }

        };
        oclockThread.start();
    }

    public static void startOclock(JLabel ocl) {
        if (ocl == null) {
            lblOclock = new JLabel();
        } else {
            lblOclock = ocl;
        }
        
        if (oclockThread == null) {
            createThreadOclock();
        }
    }

}