/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;

import DAO.LuongDAO;
import DAO.NhanVienDAO;
import entity.Luong;
import entity.NhanVien;
import exception.FormatVietNamException;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import tienich.Auth;
import tienich.DateHelper;
import tienich.ExcelHelper;
import tienich.ImageHelper;
import tienich.LocalVietNam;
import tienich.MsgBox;
import tienich.OclockHelper;
import tienich.WindowChoose;

/**
 *
 * @author SuongNguyen
 */
public class QuanLyLuong extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyLuong
     */
    CardLayout cardlayout;
    public QuanLyLuong() {
        initComponents();
        cardlayout = (CardLayout) pnlScreenMain.getLayout();
        lblProfile.setIcon(
                ImageHelper.getImage(Auth.user.getHinh(), 
                201,200)
        );
        OclockHelper.startOclock(lblTime);
        initialization();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblProfile = new javax.swing.JLabel();
        btnCapNhat3 = new javax.swing.JButton();
        btnDanhSachNhanVien = new javax.swing.JButton();
        pnlScreenMain = new javax.swing.JPanel();
        pnlChamCong = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnImport = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChamCong = new javax.swing.JTable();
        pblChiTiet = new javax.swing.JPanel();
        txtTimKiem1 = new javax.swing.JTextField();
        btnTimKiem1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChiTiet = new javax.swing.JTable();

        setClosable(true);

        pnlMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 0, 255)));
        pnlMenu.setPreferredSize(new java.awt.Dimension(263, 474));

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("Mon, November 16, 2020 00:00:00");

        lblProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProfile.setText("IMG");
        lblProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCapNhat3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCapNhat3.setText("Chấm công");
        btnCapNhat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhat3ActionPerformed(evt);
            }
        });

        btnDanhSachNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDanhSachNhanVien.setText("Xem lương chi tiết");
        btnDanhSachNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCapNhat3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addComponent(btnDanhSachNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnCapNhat3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDanhSachNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlScreenMain.setLayout(new java.awt.CardLayout());

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        btnImport.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        tblChamCong.setAutoCreateRowSorter(true);
        tblChamCong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên NV", "Ngày Sinh", "Giờ đến", "Giờ về", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChamCong.setRowHeight(45);
        jScrollPane1.setViewportView(tblChamCong);
        if (tblChamCong.getColumnModel().getColumnCount() > 0) {
            tblChamCong.getColumnModel().getColumn(0).setMaxWidth(100);
            tblChamCong.getColumnModel().getColumn(1).setMaxWidth(250);
            tblChamCong.getColumnModel().getColumn(2).setMaxWidth(100);
            tblChamCong.getColumnModel().getColumn(3).setMaxWidth(100);
            tblChamCong.getColumnModel().getColumn(4).setMaxWidth(100);
            tblChamCong.getColumnModel().getColumn(5).setMaxWidth(300);
        }

        javax.swing.GroupLayout pnlChamCongLayout = new javax.swing.GroupLayout(pnlChamCong);
        pnlChamCong.setLayout(pnlChamCongLayout);
        pnlChamCongLayout.setHorizontalGroup(
            pnlChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChamCongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimKiem)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChamCongLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlChamCongLayout.setVerticalGroup(
            pnlChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChamCongLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlScreenMain.add(pnlChamCong, "card2");

        txtTimKiem1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTimKiem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem1KeyReleased(evt);
            }
        });

        btnTimKiem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTimKiem1.setText("Tìm kiếm");
        btnTimKiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiem1ActionPerformed(evt);
            }
        });

        tblChiTiet.setAutoCreateRowSorter(true);
        tblChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên NV", "Ngày Sinh", "Giờ đến", "Giờ về", "Lương", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChiTiet.setRowHeight(45);
        jScrollPane2.setViewportView(tblChiTiet);

        javax.swing.GroupLayout pblChiTietLayout = new javax.swing.GroupLayout(pblChiTiet);
        pblChiTiet.setLayout(pblChiTietLayout);
        pblChiTietLayout.setHorizontalGroup(
            pblChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblChiTietLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pblChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pblChiTietLayout.createSequentialGroup()
                        .addComponent(txtTimKiem1)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem1)))
                .addGap(15, 15, 15))
        );
        pblChiTietLayout.setVerticalGroup(
            pblChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblChiTietLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pblChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlScreenMain.add(pblChiTiet, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlScreenMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
            .addComponent(pnlScreenMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapNhat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhat3ActionPerformed
        cardlayout.show(pnlScreenMain, "card2");
    }//GEN-LAST:event_btnCapNhat3ActionPerformed

    private void btnDanhSachNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachNhanVienActionPerformed
        cardlayout.show(pnlScreenMain, "card3");
    }//GEN-LAST:event_btnDanhSachNhanVienActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        fillChamCong();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void txtTimKiem1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem1KeyReleased
        fillChiTietLuong();
    }//GEN-LAST:event_txtTimKiem1KeyReleased

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        insertLuong();
        fillChiTietLuong();
        cardlayout.show(pnlScreenMain, "card3");
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnTimKiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiem1ActionPerformed
        fillChiTietLuong();
    }//GEN-LAST:event_btnTimKiem1ActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        String path = WindowChoose.openChoose();
        importExcelFile(path, 0);
    }//GEN-LAST:event_btnImportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnCapNhat3;
    private javax.swing.JButton btnDanhSachNhanVien;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnTimKiem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel pblChiTiet;
    private javax.swing.JPanel pnlChamCong;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlScreenMain;
    private javax.swing.JTable tblChamCong;
    private javax.swing.JTable tblChiTiet;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTimKiem1;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel tableChamCong;
    DefaultTableModel tableChiTiet;
    
    NhanVienDAO nhanVienDAO;
    LuongDAO luongDAO;
    private void initialization() {
        tableChamCong = (DefaultTableModel) tblChamCong.getModel();
        tableChiTiet = (DefaultTableModel) tblChiTiet.getModel();
        
        nhanVienDAO = new NhanVienDAO();
        luongDAO = new LuongDAO();
        
        fillChamCong();
        fillChiTietLuong();
    }
    
    private void fillChamCong() {
        tableChamCong.setRowCount(0);
        nhanVienDAO.selectByName(txtTimKiem.getText()).forEach( (x) -> {
            tableChamCong.addRow(new Object[]  {
                x.getMaNhanVien(), x.getTenNhanVien(), LocalVietNam.getDate(x.getNgaySinh())
            });
        });
    }
    
    private void fillChiTietLuong() {
        tableChiTiet.setRowCount(0);
        luongDAO.selectByName(txtTimKiem1.getText()).forEach( (x) -> {
            NhanVien nv = nhanVienDAO.selectByID(x.getMaNhanVien());
            String gioDen = x.getGioDen();
            String gioVe = x.getGioVe();
            float heSoLuong = nv.getHeSoLuong();
            
            tableChiTiet.addRow(new Object[] {
                nv.getMaNhanVien(), nv.getTenNhanVien(), nv.getNgaySinh(),
                gioDen, gioVe, getLuongNhanVien(gioDen, gioVe, heSoLuong),
                x.getGhiChu()
            });
        });
    }
    
    private String getLuongNhanVien(String gioDen, String gioVe, float heSoLuong) {
        long gD = DateHelper.getMilliseconds(gioDen);
        long gV = DateHelper.getMilliseconds(gioVe);
        long timeDiff = gV - gD;
        long hour = timeDiff/60000+1;
        try {
            return LocalVietNam.getCurrency((int)(hour * heSoLuong / 60));
        } catch (FormatVietNamException ex) {
            MsgBox.notify(ex.getMessage(), this);
            return "error";
        }
    }
    
    private void insertLuong() {
        int rowInTalbeChamCong = tableChamCong.getRowCount();
        
        for (int i=0; i<rowInTalbeChamCong; i++) {
            try {
                luongDAO.insert(getLuong(i));
            } catch (Exception e) {
                MsgBox.notify(e.getMessage(), this);
            }
        }
    }
    
    private Luong getLuong(int row) {
        Luong lg = new Luong();
        lg.setMaNhanVien(tableChamCong.getValueAt(row, 0).toString());
        lg.setGioDen((String)  tableChamCong.getValueAt(row, 3));
        lg.setGioVe((String)  tableChamCong.getValueAt(row, 4));
        lg.setGhiChu(tableChamCong.getValueAt(row, 5).toString());
        lg.setNgayDiLam((new Date()));
        return lg;
    }
    
    private void importExcelFile(String pathFile, int sheet) {
        if (!isExcelFile(pathFile)) {
            MsgBox.notify("Vui lòng chọn file excel", this);
            return;
        }
        tableChamCong.setRowCount(0);
        try {
            List<Object[]> cellExcelList = ExcelHelper.readExcelFile(pathFile, sheet);
            
            for (Object[] x : cellExcelList) {
                tableChamCong.addRow(x);
            }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private boolean isExcelFile(String path) {
        return path.endsWith(".xlsx");
    }
}
