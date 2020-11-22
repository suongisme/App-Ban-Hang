/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;

import DAO.NhanVienDAO;
import DAO.ThongKeDAO;
import entity.NhanVien;
import exception.FormatVietNamException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import tienich.LocalVietNam;
import tienich.MsgBox;

/**
 *
 * @author SuongNguyen
 */
public class ThongKe extends javax.swing.JInternalFrame {

    /**
     * Creates new form ThongKe
     */
    public ThongKe() {
        initComponents();
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

        trongngoai = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlDoanhThu = new javax.swing.JPanel();
        cbxDoanhThuNam = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        lblTong = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlLuongNhanVien = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLuong = new javax.swing.JTable();
        lblLuongTong = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxThangLuongNhanVien = new javax.swing.JComboBox<>();
        cbxNamLuongNhanVien = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlHangBanChay = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        cbxBanChayThang = new javax.swing.JComboBox<>();
        cbxBanChayNam = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rdoNgoaiNuoc = new javax.swing.JRadioButton();
        rdoTrongNuoc = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);

        cbxDoanhThuNam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxDoanhThuNam.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(153, 153, 153)));
        cbxDoanhThuNam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxDoanhThuNamItemStateChanged(evt);
            }
        });

        tblDoanhThu.setAutoCreateRowSorter(true);
        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Thời gian", "Đơn nhỏ nhất", "Đơn lớn nhất", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoanhThu.setRowHeight(30);
        jScrollPane1.setViewportView(tblDoanhThu);

        lblTong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Tổng:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Năm");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout pnlDoanhThuLayout = new javax.swing.GroupLayout(pnlDoanhThu);
        pnlDoanhThu.setLayout(pnlDoanhThuLayout);
        pnlDoanhThuLayout.setHorizontalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDoanhThuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(lblTong))
                    .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(cbxDoanhThuNam, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnlDoanhThuLayout.setVerticalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxDoanhThuNam, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Doanh thu", pnlDoanhThu);

        pnlLuongNhanVien.setPreferredSize(new java.awt.Dimension(1049, 584));

        tblLuong.setAutoCreateRowSorter(true);
        tblLuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên NV", "Thời Gian", "Tổng giờ làm", "Lương"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLuong.setRowHeight(30);
        jScrollPane2.setViewportView(tblLuong);

        lblLuongTong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLuongTong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLuongTong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Tổng:");

        cbxThangLuongNhanVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxThangLuongNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1","2","3","4","5","6","7","8","9","10","11","12"}));
        cbxThangLuongNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(153, 153, 153)));
        cbxThangLuongNhanVien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxThangLuongNhanVienItemStateChanged(evt);
            }
        });

        cbxNamLuongNhanVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxNamLuongNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(153, 153, 153)));
        cbxNamLuongNhanVien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNamLuongNhanVienItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tháng");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(153, 153, 153)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Năm");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout pnlLuongNhanVienLayout = new javax.swing.GroupLayout(pnlLuongNhanVien);
        pnlLuongNhanVien.setLayout(pnlLuongNhanVienLayout);
        pnlLuongNhanVienLayout.setHorizontalGroup(
            pnlLuongNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLuongNhanVienLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(lblLuongTong))
            .addGroup(pnlLuongNhanVienLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cbxThangLuongNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cbxNamLuongNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlLuongNhanVienLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxNamLuongNhanVien, cbxThangLuongNhanVien});

        pnlLuongNhanVienLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel7, jLabel8});

        pnlLuongNhanVienLayout.setVerticalGroup(
            pnlLuongNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLuongNhanVienLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlLuongNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLuongNhanVienLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlLuongNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxNamLuongNhanVien)))
                    .addGroup(pnlLuongNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxThangLuongNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlLuongNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLuongTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pnlLuongNhanVienLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxNamLuongNhanVien, cbxThangLuongNhanVien});

        jTabbedPane1.addTab("Lương nhân viên", pnlLuongNhanVien);

        tblSanPham.setAutoCreateRowSorter(true);
        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Thời Gian", "Số Lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.setRowHeight(30);
        jScrollPane3.setViewportView(tblSanPham);

        cbxBanChayThang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxBanChayThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbxBanChayThang.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(153, 153, 153)));
        cbxBanChayThang.setPreferredSize(new java.awt.Dimension(250, 34));
        cbxBanChayThang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxBanChayThangItemStateChanged(evt);
            }
        });

        cbxBanChayNam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxBanChayNam.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(153, 153, 153)));
        cbxBanChayNam.setPreferredSize(new java.awt.Dimension(250, 34));
        cbxBanChayNam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxBanChayNamItemStateChanged(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tháng ");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(153, 153, 153)));
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Năm ");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(153, 153, 153)));
        jLabel3.setPreferredSize(new java.awt.Dimension(250, 34));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(153, 153, 153)));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 34));

        trongngoai.add(rdoNgoaiNuoc);
        rdoNgoaiNuoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNgoaiNuoc.setText("Ngoài nước");
        rdoNgoaiNuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNgoaiNuocActionPerformed(evt);
            }
        });

        trongngoai.add(rdoTrongNuoc);
        rdoTrongNuoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoTrongNuoc.setSelected(true);
        rdoTrongNuoc.setText("Trong nước");
        rdoTrongNuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoTrongNuocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoTrongNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoNgoaiNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNgoaiNuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdoTrongNuoc)))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Khách ");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(153, 153, 153)));
        jLabel5.setPreferredSize(new java.awt.Dimension(250, 34));

        javax.swing.GroupLayout pnlHangBanChayLayout = new javax.swing.GroupLayout(pnlHangBanChay);
        pnlHangBanChay.setLayout(pnlHangBanChayLayout);
        pnlHangBanChayLayout.setHorizontalGroup(
            pnlHangBanChayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(pnlHangBanChayLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cbxBanChayThang, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cbxBanChayNam, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pnlHangBanChayLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel5});

        pnlHangBanChayLayout.setVerticalGroup(
            pnlHangBanChayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHangBanChayLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlHangBanChayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHangBanChayLayout.createSequentialGroup()
                        .addGroup(pnlHangBanChayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxBanChayNam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(pnlHangBanChayLayout.createSequentialGroup()
                        .addComponent(cbxBanChayThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pnlHangBanChayLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxBanChayThang, jLabel1});

        jTabbedPane1.addTab("Mặt hàng bán chạy", pnlHangBanChay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxDoanhThuNamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxDoanhThuNamItemStateChanged
        fillDoanhThuTable();
    }//GEN-LAST:event_cbxDoanhThuNamItemStateChanged

    private void cbxThangLuongNhanVienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxThangLuongNhanVienItemStateChanged
        fillLuongNhanVien();
    }//GEN-LAST:event_cbxThangLuongNhanVienItemStateChanged

    private void cbxNamLuongNhanVienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNamLuongNhanVienItemStateChanged
        fillLuongNhanVien();
    }//GEN-LAST:event_cbxNamLuongNhanVienItemStateChanged

    private void cbxBanChayThangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxBanChayThangItemStateChanged
        fillMatHangBanChay();
    }//GEN-LAST:event_cbxBanChayThangItemStateChanged

    private void cbxBanChayNamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxBanChayNamItemStateChanged
        fillMatHangBanChay();
    }//GEN-LAST:event_cbxBanChayNamItemStateChanged

    private void rdoTrongNuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTrongNuocActionPerformed
        fillMatHangBanChay();
    }//GEN-LAST:event_rdoTrongNuocActionPerformed

    private void rdoNgoaiNuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNgoaiNuocActionPerformed
        fillMatHangBanChay();
    }//GEN-LAST:event_rdoNgoaiNuocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxBanChayNam;
    private javax.swing.JComboBox<String> cbxBanChayThang;
    private javax.swing.JComboBox<String> cbxDoanhThuNam;
    private javax.swing.JComboBox<String> cbxNamLuongNhanVien;
    private javax.swing.JComboBox<String> cbxThangLuongNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblLuongTong;
    private javax.swing.JLabel lblTong;
    private javax.swing.JPanel pnlDoanhThu;
    private javax.swing.JPanel pnlHangBanChay;
    private javax.swing.JPanel pnlLuongNhanVien;
    private javax.swing.JRadioButton rdoNgoaiNuoc;
    private javax.swing.JRadioButton rdoTrongNuoc;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblLuong;
    private javax.swing.JTable tblSanPham;
    private javax.swing.ButtonGroup trongngoai;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel tableLuong;
    private DefaultTableModel tableSanPham;
    private DefaultTableModel tableDoanhThu;

    private DefaultComboBoxModel comboBoxNamDoanhThu;
    private DefaultComboBoxModel comboBoxNamLuongNhanVien;
    private DefaultComboBoxModel comboBoxNamSanPhamBanChay;

    private ThongKeDAO thongKeDAO;

    private Calendar date;

    private void initialization() {
        tableDoanhThu = (DefaultTableModel) tblDoanhThu.getModel();
        tableLuong = (DefaultTableModel) tblLuong.getModel();
        tableSanPham = (DefaultTableModel) tblSanPham.getModel();

        comboBoxNamDoanhThu = (DefaultComboBoxModel) cbxDoanhThuNam.getModel();
        comboBoxNamLuongNhanVien = (DefaultComboBoxModel) cbxNamLuongNhanVien.getModel();
        comboBoxNamSanPhamBanChay = (DefaultComboBoxModel) cbxBanChayNam.getModel();

        thongKeDAO = new ThongKeDAO();

        date = Calendar.getInstance();

        loadYearOf(comboBoxNamDoanhThu);
        loadYearOf(comboBoxNamLuongNhanVien);
        loadYearOf(comboBoxNamSanPhamBanChay);

    }

    private void loadYearOf(DefaultComboBoxModel comboBoxYear) {
        comboBoxYear.removeAllElements();
        int curentYear = date.get(Calendar.YEAR);
        for (int year = 2010; year <= curentYear; year++) {
            comboBoxYear.addElement(year);
        }
    }

    private void fillDoanhThuTable() {
        tableDoanhThu.setRowCount(0);
        int nam = (int) cbxDoanhThuNam.getSelectedItem();
        try {
            
            List<Object[]> a = thongKeDAO.getDoanhThu(nam);
            for (Object[] x : a) {
                tableDoanhThu.addRow(new Object[] {
                    "Tháng "+x[0],
                    LocalVietNam.getCurrency(x[1]),
                    LocalVietNam.getCurrency(x[2]),
                    LocalVietNam.getCurrency(x[3]),
                });
            }
            lblTong.setText(getTongOf(tableDoanhThu));
        } catch (FormatVietNamException vn) {
            MsgBox.notify(vn.getMessage(), this);
        } catch (SQLException e) {
            MsgBox.notify("Thống kê doanh thu lỗi", this);
        }
    }

    private void fillLuongNhanVien() {
        tableLuong.setRowCount(0);
        
        int nam =  Integer.parseInt(cbxNamLuongNhanVien.getSelectedItem().toString());
        int thang = Integer.parseInt(cbxThangLuongNhanVien.getSelectedItem().toString());

        try {
        
            List<Object[]> a = thongKeDAO.getLuongNhanVien(thang, nam);
            for (Object[] x : a) {
                tableLuong.addRow(new Object[] {
                    x[0],x[1],
                    "Tháng "+x[2],
                    LocalVietNam.getTime(x[3]),
                    LocalVietNam.getCurrency(getLuongNhanVien(x[0], x[3]))
                });
            }
            lblLuongTong.setText(getTongOf(tableLuong));
        } catch (FormatVietNamException vn) {
            MsgBox.notify(vn.getMessage(), this);
        } catch (SQLException e) {
            MsgBox.notify("Thống kê lương lỗi", this);
        } 
    }

    private void fillMatHangBanChay() {
        tableSanPham.setRowCount(0);
        boolean isForeigner = rdoNgoaiNuoc.isSelected();
        int nam =  Integer.parseInt(cbxBanChayNam.getSelectedItem().toString());
        int thang = Integer.parseInt(cbxBanChayThang.getSelectedItem().toString());
        try {
            List<Object[]> a = thongKeDAO.getMatHangBanChay(thang, nam, isForeigner);
            a.forEach((x) -> {
                tableSanPham.addRow(new Object[]{
                    x[0], x[1], "Tháng "+x[2], x[3]
                });
            });
        } catch (SQLException e) {
            MsgBox.notify("Thống kê mặt hàng bạn chạy lỗi", this);
        }
    }

    private String getLuongNhanVien(Object maNhanVien, Object tongGiolam) throws FormatVietNamException {
        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        NhanVien nv = nhanVienDAO.selectByID(maNhanVien.toString());

        if (nv == null) {
            return null;
        }

        double hsl = nv.getHeSoLuong()/60;
        double tgl = Double.parseDouble(tongGiolam.toString());
        return (int)(hsl*tgl)+"";
    }
    
    private String getTongOf(DefaultTableModel table) throws FormatVietNamException {
        int tong = 0;
        int column = table.getColumnCount();
        int row = table.getRowCount();
        for (int i=0; i<row; i++) {
            tong += LocalVietNam.getNormalMoney(table.getValueAt(i, column-1));
        }
        return LocalVietNam.getCurrency(tong);
    }
}
