/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author indiz
 */
public class Menu_Petugas_Utama extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu_Petugas_Utama() {
        initComponents();
        //myinitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUtama = new javax.swing.JPanel();
        panelJudul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelNavBar = new javax.swing.JPanel();
        profileBtn = new javax.swing.JButton();
        katalogBtn = new javax.swing.JButton();
        pengembalianBtn = new javax.swing.JButton();
        peminjamanBtn = new javax.swing.JButton();
        laporanBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        panelAwal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelUtama.setBackground(new java.awt.Color(255, 255, 255));
        panelUtama.setLayout(null);

        panelJudul.setBackground(new java.awt.Color(153, 255, 255));
        panelJudul.setMinimumSize(new java.awt.Dimension(720, 90));
        panelJudul.setPreferredSize(new java.awt.Dimension(720, 90));
        panelJudul.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Menu Utama Petugas");
        panelJudul.add(jLabel1);
        jLabel1.setBounds(27, 12, 250, 53);

        panelUtama.add(panelJudul);
        panelJudul.setBounds(0, 0, 720, 90);

        panelNavBar.setBackground(new java.awt.Color(255, 204, 204));

        profileBtn.setText("Profile");
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        katalogBtn.setText("Katalog");

        pengembalianBtn.setText("Pengembalian");

        peminjamanBtn.setText("Peminjaman");

        laporanBtn.setText("Laporan");

        logoutBtn.setText("Log Out");

        javax.swing.GroupLayout panelNavBarLayout = new javax.swing.GroupLayout(panelNavBar);
        panelNavBar.setLayout(panelNavBarLayout);
        panelNavBarLayout.setHorizontalGroup(
            panelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavBarLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutBtn)
                    .addComponent(laporanBtn)
                    .addComponent(peminjamanBtn)
                    .addComponent(pengembalianBtn)
                    .addComponent(katalogBtn)
                    .addComponent(profileBtn))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        panelNavBarLayout.setVerticalGroup(
            panelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavBarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(profileBtn)
                .addGap(52, 52, 52)
                .addComponent(katalogBtn)
                .addGap(62, 62, 62)
                .addComponent(pengembalianBtn)
                .addGap(50, 50, 50)
                .addComponent(peminjamanBtn)
                .addGap(43, 43, 43)
                .addComponent(laporanBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(30, 30, 30))
        );

        panelUtama.add(panelNavBar);
        panelNavBar.setBounds(0, 90, 150, 550);

        jLabel2.setText("Panel Awal setelah Login");

        javax.swing.GroupLayout panelAwalLayout = new javax.swing.GroupLayout(panelAwal);
        panelAwal.setLayout(panelAwalLayout);
        panelAwalLayout.setHorizontalGroup(
            panelAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAwalLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel2)
                .addContainerGap(219, Short.MAX_VALUE))
        );
        panelAwalLayout.setVerticalGroup(
            panelAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(505, Short.MAX_VALUE))
        );

        panelUtama.add(panelAwal);
        panelAwal.setBounds(160, 100, 550, 530);

        getContentPane().add(panelUtama);
        panelUtama.setBounds(0, 0, 720, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profileBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Petugas_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Petugas_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Petugas_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Petugas_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Petugas_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton katalogBtn;
    private javax.swing.JButton laporanBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel panelAwal;
    private javax.swing.JPanel panelJudul;
    private javax.swing.JPanel panelNavBar;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JButton peminjamanBtn;
    private javax.swing.JButton pengembalianBtn;
    private javax.swing.JButton profileBtn;
    // End of variables declaration//GEN-END:variables

    
}
