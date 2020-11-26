/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;

import entity.NhanVien;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import tienich.MsgBox;
import DAO.NhanVienDAO;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import java.util.List;
import tienich.Auth;

/**
 *
 * @author SuongNguyen
 */
public class QuanLyNhanVien extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyNhanVien
     */
    ArrayList<NhanVien> listNv = new ArrayList<>();
    NhanVienDAO nhanVienDAO = new NhanVienDAO();

    CardLayout cardlayout;
    private int row;

    public QuanLyNhanVien() {
        initComponents();
        this.fillTable();
        cardlayout = (CardLayout) pnlScreenMain.getLayout();
        lblTenNhanVien.setText(Auth.user.getTenNhanVien());
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
        lbTime = new javax.swing.JLabel();
        btnCapNhat = new javax.swing.JButton();
        btnDanhSachNhanVien = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblTenNhanVien = new javax.swing.JLabel();
        pnlScreenMain = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblAnh = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenNhanVien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboLoaiNV = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtHeSoLuong = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DanhSachNV = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        setClosable(true);

        pnlMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 0, 255)));
        pnlMenu.setPreferredSize(new java.awt.Dimension(263, 474));
        pnlMenu.setRequestFocusEnabled(false);

        lbTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTime.setText("Mon, November 06, 2020 00:00:00");

        btnCapNhat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnDanhSachNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDanhSachNhanVien.setText("Danh sách nhân viên");
        btnDanhSachNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachNhanVienActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("IMG");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTenNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenNhanVien.setText("Tên nhân viên");

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCapNhat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDanhSachNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(lblTenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenNhanVien)
                .addGap(37, 37, 37)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDanhSachNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pnlScreenMain.setLayout(new java.awt.CardLayout());

        lblAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnh.setText("IMG");
        lblAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Mã nhân viên");

        txtMaNhanVien.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N

        jLabel3.setText("Tên nhân viên");

        txtTenNhanVien.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N

        jLabel4.setText("Địa chỉ");

        txtDiaChi.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N

        jLabel5.setText("Email");

        txtEmail.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N

        txtNgaySinh.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N

        txtSDT.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N

        jLabel8.setText("Ngày sinh");

        jLabel9.setText("SĐT");

        jLabel10.setText("Mật khẩu");

        cboLoaiNV.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        cboLoaiNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Thu ngân", "Phục vụ", "Bảo vệ" }));

        jLabel7.setText("Chức vụ");

        txtHeSoLuong.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N

        jLabel11.setText("Hệ số lương");

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        rdoNu.setText("Nữ");

        rdoNam.setText("Nam");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoNam)
                .addGap(18, 18, 18)
                .addComponent(rdoNu)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("Giới tính");

        jPanel4.setLayout(new java.awt.GridLayout(4, 1, 0, 10));

        btnInsert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel4.add(btnInsert);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(btnUpdate);

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete);

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNew.setText("Làm mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel4.add(btnNew);

        jLabel1.setText("  Nghìn-Đồng");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(cboLoaiNV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTenNhanVien, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNgaySinh)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(txtHeSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(txtMatKhau))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHeSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboLoaiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(140, 140, 140))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboLoaiNV, jLabel1, jPanel6, txtEmail, txtMatKhau});

        pnlScreenMain.add(jPanel5, "card3");

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        tbl_DanhSachNV.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tbl_DanhSachNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ", "Tên", "Chức vụ", "Email", "Hệ số lương", "Mật khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_DanhSachNV.setRowHeight(30);
        tbl_DanhSachNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DanhSachNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_DanhSachNV);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlScreenMain.add(jPanel3, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(pnlScreenMain, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlScreenMain, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        cardlayout.show(pnlScreenMain, "card3");
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnDanhSachNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachNhanVienActionPerformed
        cardlayout.show(pnlScreenMain, "card2");
    }//GEN-LAST:event_btnDanhSachNhanVienActionPerformed

    private void tbl_DanhSachNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DanhSachNVMouseClicked
        if (evt.getClickCount() == 1) {
            this.row = tbl_DanhSachNV.getSelectedRow();
            this.editForm();
            cardlayout.show(pnlScreenMain, "card2");
        }

    }//GEN-LAST:event_tbl_DanhSachNVMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        Insert();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        Update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        int i;
        String manv;
        manv = txtTimKiem.getText();
        for (i = 0; i < listNv.size(); i++) {
            NhanVien nv = listNv.get(i);
            if (nv.maNhanVien.equalsIgnoreCase(manv)) {
                row = i;
                setForm(nv);
//                tblDiem.setRowSelectionInterval(index, index);
                MsgBox.notify("Đã tìm thấy nhân viên", this);
                return;
            } else if (manv.equals("")) {
                MsgBox.notify("Chưa nhập mã nhân viên", this);
            }
        }
        if (i == listNv.size()) {
            MsgBox.notify("Sai mã nhân viên", this);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnDanhSachNhanVien;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboLoaiNV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlScreenMain;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tbl_DanhSachNV;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHeSoLuong;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNhanVien;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tbl_DanhSachNV.getModel();
        model.setRowCount(0);
        try {
            listNv = nhanVienDAO.selectAll();
            for (NhanVien nv : listNv) {
                Object[] row = {nv.getMaNhanVien(), nv.getTenNhanVien(), nv.getLoaiNhanVien(), nv.getEmail(), nv.getHeSoLuong(), nv.getMatKhau(), nv.getDiaChi(), nv.getSdt(), nv.getNgaySinh(), nv.getHinh()};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.notify("Lỗi FillTable", this);
        }
    }

    void Insert() {
        NhanVien nv = new NhanVien();
        try {
            checkInsert();
            isGreater8Char(title);
            nhanVienDAO.insert(nv);
            this.fillTable();
            MsgBox.notify("Thêm nhân viên thành công", this);
            this.clearForm();

        } catch (Exception e) {
            MsgBox.notify("Lỗi thêm nhân viên", this);
        }
    }

    void Update() {
        NhanVien nv = getForm();
        try {
            checkUpdate();
            nhanVienDAO.update(nv);
            this.fillTable();
            MsgBox.notify("Sửa nhân viên thành công", this);
        } catch (Exception e) {
            MsgBox.notify("Lỗi sửa nhân viên", this);
        }
    }

    void delete() {
        String maNv = txtMaNhanVien.getText();
        if (maNv.equals(Auth.user.getMaNhanVien())) {
            MsgBox.notify("Bạn không được xóa chính bạn", this);
        } else if (MsgBox.confirm("Bạn muốn xóa nhân viên này?", this)) {
            try {
                nhanVienDAO.delete(maNv);
                this.fillTable();
                MsgBox.notify("Xóa nhân viên thành công", this);
                this.clearForm();
            } catch (Exception e) {
                MsgBox.notify("Lỗi xóa nhân viên", this);
            }
        }
    }

    void setForm(NhanVien nv) {
        txtMaNhanVien.setText(nv.getMaNhanVien());
        cboLoaiNV.getSelectedItem();
        txtTenNhanVien.setText(nv.getTenNhanVien());
        rdoNam.setSelected(nv.isGioiTinh());
        txtDiaChi.setText(nv.getDiaChi());
        txtNgaySinh.setText(nv.getNgaySinh() + "");
        txtSDT.setText(nv.getSdt());
        txtEmail.setText(nv.getEmail());
        txtHeSoLuong.setText(nv.getHeSoLuong() + "");
        txtMatKhau.setText(nv.getMatKhau());
        updateAnh(tbl_DanhSachNV.getValueAt(row, 2).toString());
    }

    NhanVien getForm() {
//        NhanVien nv = new NhanVien();
        NhanVien nv = listNv.get(row);
        nv.setMaNhanVien(txtMaNhanVien.getText());
        nv.setTenNhanVien(txtTenNhanVien.getText());
        nv.setLoaiNhanVien((String) cboLoaiNV.getSelectedItem());
        nv.setGioiTinh(rdoNam.isSelected());
        nv.setDiaChi(txtDiaChi.getText());
        nv.setSdt(txtSDT.getText());
        nv.setEmail(txtEmail.getText());
        nv.setHeSoLuong(Float.parseFloat(txtHeSoLuong.getText()));

        return nv;
    }

    void clearForm() {
        NhanVien nv = new NhanVien();
        this.setForm(nv);
    }

    void editForm() {
        String maNv = (String) tbl_DanhSachNV.getValueAt(this.row, 0);
        NhanVien nv = nhanVienDAO.selectByID(maNv);
        this.setForm(nv);
    }

    public void updateAnh(String image) {
        ImageIcon icon1 = new ImageIcon("src\\Image\\" + image);
        Image im = icon1.getImage();
        ImageIcon icon = new ImageIcon(im.getScaledInstance(lblAnh.getWidth(), lblAnh.getHeight(), im.SCALE_SMOOTH));
        lblAnh.setIcon(icon);
    }

    public boolean checkInsert() {
        if (txtMaNhanVien.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã nhân viên");
            txtMaNhanVien.requestFocus();
            return false;
        } else if (txtTenNhanVien.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên nhân viên");
            txtTenNhanVien.requestFocus();
            return false;
        } else if (txtNgaySinh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày sinh nhân viên");
            txtNgaySinh.requestFocus();
            return false;
        } else if (txtDiaChi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập địa chỉ nhân viên");
            txtDiaChi.requestFocus();
            return false;
        } else if (txtSDT.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập sdt nhân viên");
            txtSDT.requestFocus();
            return false;
        } else if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập email nhân viên");
            txtEmail.requestFocus();
            return false;
        } else if (txtMatKhau.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mật khẩu nhân viên");
            txtMatKhau.requestFocus();
            return false;
        } else if (txtHeSoLuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập lương nhân viên");
            txtHeSoLuong.requestFocus();
            return false;
        }
        String maNv = txtMaNhanVien.getText();
        for (NhanVien x : listNv) {
            if (x.getMaNhanVien().equalsIgnoreCase(maNv)) {
                JOptionPane.showMessageDialog(this, "Mã Nhan viên đã tồn tại");
                return false;
            }
        }
        String mauEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (!txtEmail.getText().matches(mauEmail)) {
            JOptionPane.showMessageDialog(this, "vui lòng nhập đúng định dạng email");
            txtEmail.requestFocus();
            return false;
        }
        try {
            int sdt = Integer.parseInt(txtSDT.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nhập sdt phải là số");
            txtSDT.requestFocus();
            return false;
        }
        return true;
    }

    public boolean checkUpdate() {
        if (txtMaNhanVien.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã nhân viên");
            txtMaNhanVien.requestFocus();
            return false;
        } else if (txtTenNhanVien.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên nhân viên");
            txtTenNhanVien.requestFocus();
            return false;
        } else if (txtNgaySinh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày sinh nhân viên");
            txtNgaySinh.requestFocus();
            return false;
        } else if (txtDiaChi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập địa chỉ nhân viên");
            txtDiaChi.requestFocus();
            return false;
        } else if (txtSDT.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập sdt nhân viên");
            txtSDT.requestFocus();
            return false;
        } else if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập email nhân viên");
            txtEmail.requestFocus();
            return false;
        } else if (txtMatKhau.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mật khẩu nhân viên");
            txtMatKhau.requestFocus();
            return false;
        } else if (txtHeSoLuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập lương nhân viên");
            txtHeSoLuong.requestFocus();
            return false;
        }

        String mauEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (!txtEmail.getText().matches(mauEmail)) {
            JOptionPane.showMessageDialog(this, "vui lòng nhập đúng định dạng email");
            txtEmail.requestFocus();
            return false;
        }
        try {
            int sdt = Integer.parseInt(txtSDT.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nhập sdt phải là số");
            txtSDT.requestFocus();
            return false;
        }
        return true;
    }

    public boolean isGreater8Char(String matKhau) {
        if (!isGreater8Char(matKhau)) {
            MsgBox.notify("Mật khẩu phải dài hơn 8 ký tự", this);
            return false;
        }
        return true;
    }
}
