/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;

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
        pnlLuongNhanVien = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLuong = new javax.swing.JTable();
        lblLuongTong = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxThang = new javax.swing.JComboBox<>();
        cbxNam = new javax.swing.JComboBox<>();
        pnlHangBanChay = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbBanChay = new javax.swing.JTable();
        cbxBanChayThang = new javax.swing.JComboBox<>();
        cbxBanChayNam = new javax.swing.JComboBox<>();
        rdoNgoaiNuoc = new javax.swing.JRadioButton();
        rdoTrongNuoc = new javax.swing.JRadioButton();

        cbxDoanhThuNam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxDoanhThuNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm 2019", "Năm 2020", "Năm 2021" }));

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Thời gian", "Đơn nhỏ nhất", "Đơn lớn nhất", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoanhThu.setRowHeight(30);
        jScrollPane1.setViewportView(tblDoanhThu);

        lblTong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTong.setText("100.000đ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Tổng:");

        javax.swing.GroupLayout pnlDoanhThuLayout = new javax.swing.GroupLayout(pnlDoanhThu);
        pnlDoanhThu.setLayout(pnlDoanhThuLayout);
        pnlDoanhThuLayout.setHorizontalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                        .addComponent(cbxDoanhThuNam, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDoanhThuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTong, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlDoanhThuLayout.setVerticalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxDoanhThuNam, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Doanh thu", pnlDoanhThu);

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
        lblLuongTong.setText("100.000đ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Tổng:");

        cbxThang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" }));

        cbxNam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm 2019", "Năm 2020", "Năm 2021" }));

        javax.swing.GroupLayout pnlLuongNhanVienLayout = new javax.swing.GroupLayout(pnlLuongNhanVien);
        pnlLuongNhanVien.setLayout(pnlLuongNhanVienLayout);
        pnlLuongNhanVienLayout.setHorizontalGroup(
            pnlLuongNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLuongNhanVienLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLuongTong, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlLuongNhanVienLayout.createSequentialGroup()
                .addComponent(cbxThang, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxNam, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 534, Short.MAX_VALUE))
        );
        pnlLuongNhanVienLayout.setVerticalGroup(
            pnlLuongNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLuongNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLuongNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxThang, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(cbxNam))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(pnlLuongNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLuongTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lương nhân viên", pnlLuongNhanVien);

        tbBanChay.setModel(new javax.swing.table.DefaultTableModel(
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
        tbBanChay.setRowHeight(30);
        jScrollPane3.setViewportView(tbBanChay);

        cbxBanChayThang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxBanChayThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" }));

        cbxBanChayNam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbxBanChayNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm 2019", "Năm 2020", "Năm 2021" }));

        trongngoai.add(rdoNgoaiNuoc);
        rdoNgoaiNuoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoNgoaiNuoc.setText("Ngoài nước");

        trongngoai.add(rdoTrongNuoc);
        rdoTrongNuoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoTrongNuoc.setText("Trong nước");

        javax.swing.GroupLayout pnlHangBanChayLayout = new javax.swing.GroupLayout(pnlHangBanChay);
        pnlHangBanChay.setLayout(pnlHangBanChayLayout);
        pnlHangBanChayLayout.setHorizontalGroup(
            pnlHangBanChayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHangBanChayLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlHangBanChayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(pnlHangBanChayLayout.createSequentialGroup()
                        .addComponent(cbxBanChayThang, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxBanChayNam, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoTrongNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoNgoaiNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(308, Short.MAX_VALUE))))
        );
        pnlHangBanChayLayout.setVerticalGroup(
            pnlHangBanChayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHangBanChayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlHangBanChayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlHangBanChayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoNgoaiNuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdoTrongNuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbxBanChayThang, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxBanChayNam))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

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
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxBanChayNam;
    private javax.swing.JComboBox<String> cbxBanChayThang;
    private javax.swing.JComboBox<String> cbxDoanhThuNam;
    private javax.swing.JComboBox<String> cbxNam;
    private javax.swing.JComboBox<String> cbxThang;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTable tbBanChay;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblLuong;
    private javax.swing.ButtonGroup trongngoai;
    // End of variables declaration//GEN-END:variables
}
