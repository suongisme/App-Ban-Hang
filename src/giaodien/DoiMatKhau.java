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
public class DoiMatKhau extends javax.swing.JInternalFrame {

    /**
     * Creates new form DoiMatKhau
     */
    public DoiMatKhau() {
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

        jPanel2 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtMKmoi = new javax.swing.JTextField();
        txtXacNhanMKcu = new javax.swing.JTextField();
        txtXacNhanMKmoi = new javax.swing.JTextField();
        cbxHienThiMK = new javax.swing.JCheckBox();
        btnXacNhan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jPanel2.setBackground(new java.awt.Color(59, 175, 218));

        txtUsername.setEditable(false);
        txtUsername.setBackground(new java.awt.Color(59, 175, 218));
        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setText("username");
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtUsername.setMargin(new java.awt.Insets(2, 10, 2, 2));

        txtMKmoi.setBackground(new java.awt.Color(59, 175, 218));
        txtMKmoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMKmoi.setForeground(new java.awt.Color(204, 204, 204));
        txtMKmoi.setText("mật khẩu mới");
        txtMKmoi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMKmoi.setMargin(new java.awt.Insets(2, 10, 2, 2));

        txtXacNhanMKcu.setBackground(new java.awt.Color(59, 175, 218));
        txtXacNhanMKcu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtXacNhanMKcu.setForeground(new java.awt.Color(204, 204, 204));
        txtXacNhanMKcu.setText("xác nhận mật khẩu cũ");
        txtXacNhanMKcu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtXacNhanMKcu.setMargin(new java.awt.Insets(2, 10, 2, 2));

        txtXacNhanMKmoi.setBackground(new java.awt.Color(59, 175, 218));
        txtXacNhanMKmoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtXacNhanMKmoi.setForeground(new java.awt.Color(204, 204, 204));
        txtXacNhanMKmoi.setText("xác nhận mật khẩu mới");
        txtXacNhanMKmoi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtXacNhanMKmoi.setMargin(new java.awt.Insets(2, 10, 2, 2));

        cbxHienThiMK.setForeground(new java.awt.Color(255, 255, 255));
        cbxHienThiMK.setText("Hiển thị mật khẩu");

        btnXacNhan.setBackground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnXacNhan.setForeground(new java.awt.Color(59, 175, 218));
        btnXacNhan.setText("Xác nhận");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đổi mật khẩu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
            .addComponent(txtUsername)
            .addComponent(txtMKmoi, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(txtXacNhanMKmoi)
            .addComponent(txtXacNhanMKcu)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbxHienThiMK))
            .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMKmoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtXacNhanMKmoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtXacNhanMKcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxHienThiMK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXacNhan))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtMKmoi, txtUsername, txtXacNhanMKcu, txtXacNhanMKmoi});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JCheckBox cbxHienThiMK;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtMKmoi;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtXacNhanMKcu;
    private javax.swing.JTextField txtXacNhanMKmoi;
    // End of variables declaration//GEN-END:variables
}
