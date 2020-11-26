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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tienich.Auth;
import tienich.ImageHelper;

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
        this.fillTable();
        cardlayout = (CardLayout) pnlScreenMain.getLayout();
        lblTenNhanVien.setText(Auth.user.getTenNhanVien());
        lblUser.setIcon(ImageHelper.getImage(Auth.user.getHinh(), 175, 142));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        txtHeSoLuong = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DanhSachNV = new javax.swing.JTable();
        pnlMenu = new javax.swing.JPanel();
        lbTime = new javax.swing.JLabel();
        btnCapNhat = new javax.swing.JButton();
        btnDanhSachNhanVien = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblTenNhanVien = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        setClosable(true);

        pnlScreenMain.setLayout(new java.awt.CardLayout());

        lblAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        cboLoaiNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Thu ngân", "Phục vụ", "Bảo vệ", "Pha chế", " " }));
        cboLoaiNV.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboLoaiNVItemStateChanged(evt);
            }
        });

        jLabel7.setText("Chức vụ");

        jLabel11.setText("Hệ số lương");

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

        rdoNam.setText("Nam");

        rdoNu.setText("Nữ");

        txtHeSoLuong.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtHeSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeSoLuongActionPerformed(evt);
            }
        });

        jLabel14.setText("  Nghìn-Đồng");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTenNhanVien, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()

                                .addComponent(txtHeSoLuong)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addGap(18, 18, 18)
                                .addComponent(rdoNu))
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboLoaiNV, javax.swing.GroupLayout.Alignment.LEADING, 0, 604, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))

        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()

                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2))
                        .addGap(7, 7, 7)

                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(txtHeSoLuong)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)))
                    .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboLoaiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );


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
                {"uONG", "SÚOAS", null, null, null, null},
                {"1", "SDAF", null, null, null, null},
                {"1ÁDF", "ÁD", null, null, null, null},
                {"1FAS", "SDF", null, null, null, null},
                {"D", "SDFA", null, null, null, null},
                {"FASDFA", "SDFA", null, null, null, null}
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
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlScreenMain.add(jPanel3, "card2");

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

        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(lblTenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenNhanVien)
                .addGap(37, 37, 37)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDanhSachNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

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

    private void cboLoaiNVItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboLoaiNVItemStateChanged
        if (cboLoaiNV.getSelectedIndex() != 0 && cboLoaiNV.getSelectedIndex() != 1) {
            txtMatKhau.setEditable(false);
        } else {
            txtMatKhau.setEditable(true);
        }
        txtMatKhau.setText("");
    }//GEN-LAST:event_cboLoaiNVItemStateChanged

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

    private void txtHeSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeSoLuongActionPerformed

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

    private void tbl_DanhSachNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DanhSachNVMouseClicked

        if (evt.getClickCount() == 2) {
            this.row = tbl_DanhSachNV.getSelectedRow();
            this.editForm();
            cardlayout.show(pnlScreenMain, "card3");
        }
    }//GEN-LAST:event_tbl_DanhSachNVMouseClicked

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        cardlayout.show(pnlScreenMain, "card3");
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnDanhSachNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachNhanVienActionPerformed
        cardlayout.show(pnlScreenMain, "card2");
    }//GEN-LAST:event_btnDanhSachNhanVienActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnDanhSachNhanVien;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboLoaiNV;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblUser;
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
                Object[] row = {
                    nv.getMaNhanVien(),
                    nv.getTenNhanVien(),
                    nv.getLoaiNhanVien(),
                    nv.getEmail(),
                    nv.getHeSoLuong(),
                    nv.getMatKhau(),
                    nv.getDiaChi(),
                    nv.getSdt(),
                    nv.getNgaySinh(),
                    nv.getHinh()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.notify("Lỗi FillTable", this);
        }
    }

    void Insert() {
        NhanVien nv = new NhanVien();
        try {
            if (checkInsert() == false) {
                return;
            } else {
                nhanVienDAO.insert(nv);
                this.fillTable();
                MsgBox.notify("Thêm nhân viên thành công", this);
                this.clearForm();
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.notify("Lỗi thêm nhân viên", this);
        }
    }

    void Update() {
        NhanVien nv = getForm();
        try {
            if (checkUpdate() == false) {
                return;
            } else {
                nhanVienDAO.update(nv);
                this.fillTable();
                MsgBox.notify("Sửa nhân viên thành công", this);
            }
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
        cboLoaiNV.setSelectedItem(nv.getLoaiNhanVien());
        txtTenNhanVien.setText(nv.getTenNhanVien());
        if (nv.isGioiTinh()) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        txtDiaChi.setText(nv.getDiaChi());
        txtNgaySinh.setText(nv.getNgaySinh() + "");
        txtSDT.setText(nv.getSdt());
        txtEmail.setText(nv.getEmail());
        txtHeSoLuong.setText(nv.getHeSoLuong() + "");
        txtMatKhau.setText(nv.getMatKhau());
        lblAnh.setIcon(ImageHelper.getImage(nv.getHinh(), 175, 142));
    }

    NhanVien getForm() {
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

    public boolean checkInsert() {
        if (txtMaNhanVien.getText().equals("")) {
            MsgBox.notify("Bạn chưa nhập Mã nhân viên", this);
            txtMaNhanVien.requestFocus();
            return false;
        } else if (txtTenNhanVien.getText().equals("")) {
            MsgBox.notify("Bạn chưa nhập tên nhân viên", this);
            txtTenNhanVien.requestFocus();
            return false;
        } else if (txtNgaySinh.getText().equals("")) {
            MsgBox.notify("Bạn chưa nhập ngày sinh nhân viên", this);
            txtNgaySinh.requestFocus();
            return false;
        } else if (txtDiaChi.getText().equals("")) {
            MsgBox.notify("Bạn chưa nhập địa chỉ nhân viên", this);
            txtDiaChi.requestFocus();
            return false;
        } else if (txtSDT.getText().equals("")) {
            MsgBox.notify("Bạn chưa nhập sdt nhân viên", this);
            txtSDT.requestFocus();
            return false;
        } else if (txtEmail.getText().equals("")) {
            MsgBox.notify("Bạn chưa nhập email nhân viên", this);
            txtEmail.requestFocus();
            return false;
        } else if (txtMatKhau.getText().equals("")) {
            MsgBox.notify("Bạn chưa nhập mật khẩu nhân viên", this);
            txtMatKhau.requestFocus();
            return false;
        } else if (txtHeSoLuong.getText().equals("")) {
            MsgBox.notify("Bạn chưa nhập lương nhân viên", this);
            txtHeSoLuong.requestFocus();
            return false;
        }
        String maNv = txtMaNhanVien.getText();
        for (NhanVien x : listNv) {
            if (x.getMaNhanVien().equalsIgnoreCase(maNv)) {
                MsgBox.notify("Mã nhân viên đã tồn tại", this);
                return false;
            }
        }
        String checkEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (!txtEmail.getText().matches(checkEmail)) {
            JOptionPane.showMessageDialog(this, "vui lòng nhập đúng định dạng email");
            txtEmail.requestFocus();
            return false;
        }
        try {
            int sdt = Integer.parseInt(txtSDT.getText());
        } catch (Exception e) {
            MsgBox.notify("Nhập sdt phải là số", this);
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
        } else if (txtHeSoLuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập lương nhân viên");
            txtHeSoLuong.requestFocus();
            return false;
        }

        String checkEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (!txtEmail.getText().matches(checkEmail)) {
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
}
