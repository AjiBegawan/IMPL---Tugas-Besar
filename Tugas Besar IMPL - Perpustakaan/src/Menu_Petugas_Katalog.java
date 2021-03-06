
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author indiz
 */
public class Menu_Petugas_Katalog extends javax.swing.JFrame {

    
    
    private DefaultTableModel model;
    public int banyak;
    /**
     * Creates new form Menu
     */
    public Menu_Petugas_Katalog()  {
        initComponents();

          loadBuku();
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
        Profile = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBuku = new javax.swing.JTable();
        TotalBuku = new javax.swing.JLabel();
        EditKatalog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 800));
        setSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(null);

        panelUtama.setBackground(new java.awt.Color(50, 50, 50));
        panelUtama.setMinimumSize(new java.awt.Dimension(720, 720));
        panelUtama.setPreferredSize(new java.awt.Dimension(720, 720));
        panelUtama.setLayout(null);

        panelJudul.setBackground(new java.awt.Color(33, 33, 33));
        panelJudul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        panelJudul.setMinimumSize(new java.awt.Dimension(720, 90));
        panelJudul.setPreferredSize(new java.awt.Dimension(720, 90));
        panelJudul.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(33, 33, 33));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu Utama Petugas");
        panelJudul.add(jLabel1);
        jLabel1.setBounds(27, 12, 250, 40);

        panelUtama.add(panelJudul);
        panelJudul.setBounds(0, 0, 720, 90);

        panelNavBar.setBackground(new java.awt.Color(33, 33, 33));
        panelNavBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        panelNavBar.setLayout(null);

        profileBtn.setBackground(new java.awt.Color(50, 50, 50));
        profileBtn.setForeground(new java.awt.Color(255, 243, 230));
        profileBtn.setText("Profile");
        profileBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });
        panelNavBar.add(profileBtn);
        profileBtn.setBounds(0, 30, 150, 30);

        katalogBtn.setBackground(new java.awt.Color(50, 50, 50));
        katalogBtn.setForeground(new java.awt.Color(255, 243, 230));
        katalogBtn.setText("Katalog");
        katalogBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        katalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                katalogBtnActionPerformed(evt);
            }
        });
        panelNavBar.add(katalogBtn);
        katalogBtn.setBounds(0, 60, 150, 30);

        pengembalianBtn.setBackground(new java.awt.Color(50, 50, 50));
        pengembalianBtn.setForeground(new java.awt.Color(255, 243, 230));
        pengembalianBtn.setText("Pengembalian");
        pengembalianBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pengembalianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengembalianBtnActionPerformed(evt);
            }
        });
        panelNavBar.add(pengembalianBtn);
        pengembalianBtn.setBounds(0, 90, 150, 30);

        peminjamanBtn.setBackground(new java.awt.Color(50, 50, 50));
        peminjamanBtn.setForeground(new java.awt.Color(255, 243, 230));
        peminjamanBtn.setText("Peminjaman");
        peminjamanBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        peminjamanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peminjamanBtnActionPerformed(evt);
            }
        });
        panelNavBar.add(peminjamanBtn);
        peminjamanBtn.setBounds(0, 120, 150, 30);

        laporanBtn.setBackground(new java.awt.Color(50, 50, 50));
        laporanBtn.setForeground(new java.awt.Color(255, 243, 230));
        laporanBtn.setText("Laporan");
        laporanBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        laporanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanBtnActionPerformed(evt);
            }
        });
        panelNavBar.add(laporanBtn);
        laporanBtn.setBounds(0, 150, 150, 30);

        logoutBtn.setBackground(new java.awt.Color(50, 50, 50));
        logoutBtn.setForeground(new java.awt.Color(255, 243, 230));
        logoutBtn.setText("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        panelNavBar.add(logoutBtn);
        logoutBtn.setBounds(0, 490, 150, 25);

        panelUtama.add(panelNavBar);
        panelNavBar.setBounds(0, 90, 150, 550);

        panelAwal.setBackground(new java.awt.Color(33, 33, 33));
        panelAwal.setLayout(null);

        Profile.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Profile.setForeground(new java.awt.Color(255, 255, 255));
        Profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Profile.setText("K A T A L O G");
        panelAwal.add(Profile);
        Profile.setBounds(0, 0, 550, 70);

        TableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableBuku);

        panelAwal.add(jScrollPane1);
        jScrollPane1.setBounds(40, 120, 500, 400);

        TotalBuku.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TotalBuku.setForeground(new java.awt.Color(255, 255, 255));
        TotalBuku.setText("jLabel2");
        panelAwal.add(TotalBuku);
        TotalBuku.setBounds(420, 70, 100, 30);

        EditKatalog.setText("Edit katalog");
        EditKatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditKatalogActionPerformed(evt);
            }
        });
        panelAwal.add(EditKatalog);
        EditKatalog.setBounds(40, 70, 150, 30);

        panelUtama.add(panelAwal);
        panelAwal.setBounds(150, 90, 570, 550);

        getContentPane().add(panelUtama);
        panelUtama.setBounds(0, 0, 730, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        // TODO add your handling code here:
        Menu_Petugas_Profile MPP = new Menu_Petugas_Profile();
        MPP.setVisible(true);
        dispose();
    }//GEN-LAST:event_profileBtnActionPerformed

    private void laporanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanBtnActionPerformed
        // TODO add your handling code here:
        Menu_Petugas_Laporan MPL = new Menu_Petugas_Laporan();
        MPL.setVisible(true);
        dispose();
    }//GEN-LAST:event_laporanBtnActionPerformed

    private void katalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_katalogBtnActionPerformed
        // TODO add your handling code here:
        Menu_Petugas_Katalog MPK = new Menu_Petugas_Katalog();
        MPK.setVisible(true);
        dispose();
    }//GEN-LAST:event_katalogBtnActionPerformed

    private void pengembalianBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengembalianBtnActionPerformed
        // TODO add your handling code here:
        Menu_Petugas_Pengembalian MPP = new Menu_Petugas_Pengembalian();
        MPP.setVisible(true);
        dispose();
    }//GEN-LAST:event_pengembalianBtnActionPerformed

    private void peminjamanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peminjamanBtnActionPerformed
        // TODO add your handling code here:
        Menu_Petugas_Peminjaman MPP = new Menu_Petugas_Peminjaman();
        MPP.setVisible(true);
        dispose();
    }//GEN-LAST:event_peminjamanBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        Connect db = new Connect();
        String sq ="UPDATE petugas SET Session = 0 WHERE Session = 1";
        java.sql.Connection conn=(Connection) db.getConnection();
        java.sql.PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(sq);
        } catch (SQLException ex) {
            Logger.getLogger(Menu_Petugas_Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Menu_Petugas_Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
        Login L = new Login();
        L.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void EditKatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditKatalogActionPerformed
        // TODO add your handling code here:
        Menu_Petugas_EditKatalog MPEK = new Menu_Petugas_EditKatalog();
        MPEK.setVisible(true);
        dispose();
    }//GEN-LAST:event_EditKatalogActionPerformed


public void loadBuku(){
     //menghapus isi table tblGaji
        model =new DefaultTableModel();
        TableBuku.setModel(model);
        model.addColumn("ID Buku");
        model.addColumn("Nama Buku");
        model.addColumn("Penulis");
        model.addColumn("Penerbit");
        model.addColumn("Kategori");
        model.addColumn("Jumlah");

     try{
           //membuat statemen pemanggilan data pada table tblGaji dari database
           Connect db = new Connect();
           Statement stat = (Statement) db.getConnection().createStatement();;
           String sql        = "Select * from buku";
           ResultSet res   = stat.executeQuery(sql);

           //penelusuran baris pada tabel tblGaji dari database
           while(res.next ()){
                Object[ ] obj = new Object[6];
                obj[0] = res.getString("ID_Buku"); 
                obj[1] = res.getString("Judul_Buku");
                obj[2] = res.getString("Penulis"); 
                obj[3] = res.getString("Penerbit");
                obj[4] = res.getString("Kategori");
                obj[5] = res.getString("Kuantiti");
         
                model.addRow(obj);
            }
      }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
     banyak = model.getRowCount();
     TotalBuku.setText("Total : "+banyak);
}
    
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
            java.util.logging.Logger.getLogger(Menu_Petugas_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Petugas_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Petugas_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Petugas_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Petugas_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditKatalog;
    private javax.swing.JLabel Profile;
    private javax.swing.JTable TableBuku;
    private javax.swing.JLabel TotalBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
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
