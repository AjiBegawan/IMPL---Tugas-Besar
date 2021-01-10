
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class Menu_Petugas_Pengembalian extends javax.swing.JFrame {

    
    
    private DefaultTableModel model;
    public int banyak;
    /**
     * Creates new form Menu
     */
    public Menu_Petugas_Pengembalian()  {
        initComponents();

        tampilBuku();
        tampilMember();
        tampilPinjam();
        load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        IDPeminjaman = new javax.swing.JLabel();
        IDBuku = new javax.swing.JLabel();
        IDMember = new javax.swing.JLabel();
        TglPinjam = new javax.swing.JLabel();
        JatuhTempo = new javax.swing.JLabel();
        FDenda = new javax.swing.JTextField();
        FJatuhTempo = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        Tambah = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        FMember = new javax.swing.JComboBox<>();
        FBuku = new javax.swing.JComboBox<>();
        FKembali = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        IDPeminjaman1 = new javax.swing.JLabel();
        FPinjam = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        FPetugas = new javax.swing.JComboBox<>();
        TglPinjam1 = new javax.swing.JLabel();
        FTanggalPinjam = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelKembali = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

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
        Profile.setText("P E N G E M B A L I A N");
        panelAwal.add(Profile);
        Profile.setBounds(0, 0, 550, 70);

        IDPeminjaman.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        IDPeminjaman.setForeground(new java.awt.Color(255, 255, 255));
        IDPeminjaman.setText("ID Pengembalian");
        panelAwal.add(IDPeminjaman);
        IDPeminjaman.setBounds(20, 80, 140, 25);

        IDBuku.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        IDBuku.setForeground(new java.awt.Color(255, 255, 255));
        IDBuku.setText("Buku");
        panelAwal.add(IDBuku);
        IDBuku.setBounds(20, 160, 140, 25);

        IDMember.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        IDMember.setForeground(new java.awt.Color(255, 255, 255));
        IDMember.setText("Nama Peminjam");
        panelAwal.add(IDMember);
        IDMember.setBounds(20, 200, 140, 25);

        TglPinjam.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TglPinjam.setForeground(new java.awt.Color(255, 255, 255));
        TglPinjam.setText("Denda");
        panelAwal.add(TglPinjam);
        TglPinjam.setBounds(20, 360, 140, 25);

        JatuhTempo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JatuhTempo.setForeground(new java.awt.Color(255, 255, 255));
        JatuhTempo.setText("Tanggal Jatuh Tempo");
        panelAwal.add(JatuhTempo);
        JatuhTempo.setBounds(20, 280, 140, 25);

        FDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FDendaActionPerformed(evt);
            }
        });
        panelAwal.add(FDenda);
        FDenda.setBounds(170, 360, 200, 25);

        FJatuhTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FJatuhTempoActionPerformed(evt);
            }
        });
        panelAwal.add(FJatuhTempo);
        FJatuhTempo.setBounds(170, 280, 200, 25);

        Clear.setBackground(new java.awt.Color(49, 44, 81));
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });
        panelAwal.add(Clear);
        Clear.setBounds(430, 200, 100, 25);

        Tambah.setBackground(new java.awt.Color(49, 44, 81));
        Tambah.setForeground(new java.awt.Color(255, 255, 255));
        Tambah.setText("Tambah");
        Tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TambahMouseClicked(evt);
            }
        });
        panelAwal.add(Tambah);
        Tambah.setBounds(430, 80, 100, 25);

        Hapus.setBackground(new java.awt.Color(49, 44, 81));
        Hapus.setForeground(new java.awt.Color(255, 255, 255));
        Hapus.setText("Hapus");
        Hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HapusMouseClicked(evt);
            }
        });
        panelAwal.add(Hapus);
        Hapus.setBounds(430, 120, 100, 25);

        Update.setBackground(new java.awt.Color(49, 44, 81));
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        panelAwal.add(Update);
        Update.setBounds(430, 160, 100, 25);

        FMember.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelAwal.add(FMember);
        FMember.setBounds(170, 200, 200, 24);

        FBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelAwal.add(FBuku);
        FBuku.setBounds(170, 160, 200, 24);

        FKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FKembaliActionPerformed(evt);
            }
        });
        panelAwal.add(FKembali);
        FKembali.setBounds(170, 80, 200, 25);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Format Tanggal : YYYY-MM-DD");
        panelAwal.add(jLabel2);
        jLabel2.setBounds(390, 250, 175, 30);

        IDPeminjaman1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        IDPeminjaman1.setForeground(new java.awt.Color(255, 255, 255));
        IDPeminjaman1.setText("ID Peminjaman");
        panelAwal.add(IDPeminjaman1);
        IDPeminjaman1.setBounds(20, 120, 140, 25);

        FPinjam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelAwal.add(FPinjam);
        FPinjam.setBounds(170, 120, 200, 24);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Petugas");
        panelAwal.add(jLabel3);
        jLabel3.setBounds(20, 240, 140, 25);

        FPetugas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelAwal.add(FPetugas);
        FPetugas.setBounds(170, 240, 200, 24);

        TglPinjam1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TglPinjam1.setForeground(new java.awt.Color(255, 255, 255));
        TglPinjam1.setText("Tanggal Pengembalian");
        panelAwal.add(TglPinjam1);
        TglPinjam1.setBounds(20, 320, 140, 25);

        FTanggalPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTanggalPinjamActionPerformed(evt);
            }
        });
        panelAwal.add(FTanggalPinjam);
        FTanggalPinjam.setBounds(170, 320, 200, 25);

        TabelKembali.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        TabelKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelKembaliMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelKembali);

        panelAwal.add(jScrollPane2);
        jScrollPane2.setBounds(10, 400, 550, 140);

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
        Login L = new Login();
        L.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void FDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FDendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FDendaActionPerformed

    private void FJatuhTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FJatuhTempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FJatuhTempoActionPerformed

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        // TODO add your handling code here:
        kosong();
        load();
    }//GEN-LAST:event_ClearMouseClicked

    private void HapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HapusMouseClicked
        // TODO add your handling code here:
        hapus();
        load();
        kosong();
    }//GEN-LAST:event_HapusMouseClicked

    private void TambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TambahMouseClicked
        // TODO add your handling code here:
        tambah();
        load();
        kosong();
    }//GEN-LAST:event_TambahMouseClicked

    private void FKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FKembaliActionPerformed

    private void FTanggalPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTanggalPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FTanggalPinjamActionPerformed

    private void TabelKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelKembaliMouseClicked
        // TODO add your handling code here:
        tampilrecord(evt);
        load();
    }//GEN-LAST:event_TabelKembaliMouseClicked

    public void tampilrecord(java.awt.event.MouseEvent evt){
        //menampilkan record yg di click kedalam text field
        int baris = TabelKembali.rowAtPoint(evt.getPoint());
        String a =TabelKembali.getValueAt(baris, 0).toString();
        FKembali.setText(a);
        String b = TabelKembali.getValueAt(baris,1).toString();
        FPinjam.setSelectedItem(b);       
        String c = TabelKembali.getValueAt(baris, 2).toString();
        FBuku.setSelectedItem(c);
        String d = TabelKembali.getValueAt(baris,3).toString();
        FMember.setSelectedItem(d);       
        String e = TabelKembali.getValueAt(baris, 4).toString();
        FPetugas.setSelectedItem(e);
        String f = TabelKembali.getValueAt(baris, 5).toString();
        FJatuhTempo.setText(f);
        String g = TabelKembali.getValueAt(baris, 6).toString();
        FTanggalPinjam.setText(g);
        String h = TabelKembali.getValueAt(baris, 7).toString();
        FDenda.setText(h);
    }

       private void kosong(){
    // menghapus data di textfield yg input
        FKembali.setText(null);
        FBuku.setSelectedItem(null);
        FMember.setSelectedItem(null);
        FDenda.setText(null);  
        FJatuhTempo.setText(null);  
    } 
    
       public void hapus(){
           try {
            Connect c = new Connect();
            String sql ="delete from pengembalian where ID_Pengembalian='"+FKembali.getText()+"'";
            java.sql.Connection conn=(Connection) c.getConnection();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Berhasil di Hapus");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
       }
       
public void load(){
     //menghapus isi table tblGaji
        model =new DefaultTableModel();
        TabelKembali.setModel(model);
        model.addColumn("ID Pengembalian");
        model.addColumn("ID Peminjaman");
        model.addColumn("ID Buku");
        model.addColumn("ID Member");
        model.addColumn("ID Petugas");
        model.addColumn("Tanggal Jatuh Tempo");
        model.addColumn("Tanggal Pengembalian");
        model.addColumn("Denda");

     try{
           //membuat statemen pemanggilan data pada table tblGaji dari database
           Connect db = new Connect();
           Statement stat = (Statement) db.getConnection().createStatement();;
           String sql        = "Select * from pengembalian";
           ResultSet res   = stat.executeQuery(sql);

           //penelusuran baris pada tabel tblGaji dari database
           while(res.next ()){
                Object[ ] obj = new Object[10];
                obj[0] = res.getString("ID_Pengembalian"); 
                obj[1] = res.getString("ID_Peminjaman");
                obj[2] = res.getString("ID_Buku"); 
                obj[3] = res.getString("ID_Anggota");
                obj[4] = res.getString("ID_Petugas");
                obj[5] = res.getString("Deadline_Pinjam");
                obj[6] = res.getString("Tgl_Pengembalian"); 
                obj[7] = res.getString("Denda");
         
                model.addRow(obj);
            }
      }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
     banyak = model.getRowCount();
}
public void tambah(){
            try {
                Connect c = new Connect();
            String sql;
            sql = "INSERT INTO peminjaman VALUES ('"+FKembali.getText()+"','"+FBuku.getSelectedItem()+"','"+FMember.getSelectedItem()+"','"+FDenda.getText()+"','"+FJatuhTempo.getText()+"')";
            java.sql.Connection conn=(Connection) c.getConnection();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}

public void tampilPinjam()
    { 
        // nampilin isi item di combo box id_buku 
        try {
            Connect c = new Connect ();
        Connection con = c.getConnection();
            try (Statement stt = con.createStatement()) {
                String sql = "select ID_Peminjaman from peminjaman order by ID_Peminjaman asc";           
            try (ResultSet res = stt.executeQuery(sql) ) {        
                FPinjam.removeAllItems();
                while(res.next()){                 
                    Object[] ob = new Object[3];
                    ob[1] = res.getString(1);
                    FPinjam.addItem((String) ob[1]);     
                }
                 res.close(); stt.close();
            }
            } 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


public void tampilBuku()
    { 
        // nampilin isi item di combo box id_buku 
        try {
            Connect c = new Connect ();
        Connection con = c.getConnection();
            try (Statement stt = con.createStatement()) {
                String sql = "select Judul_Buku from peminjaman right join buku on peminjaman.ID_Buku = buku.ID_Buku";           
            try (ResultSet res = stt.executeQuery(sql) ) {        
                FBuku.removeAllItems();
                while(res.next()){                 
                    Object[] ob = new Object[3];
                    ob[1] = res.getString(1);
                    FBuku.addItem((String) ob[1]);     
                }
                 res.close(); stt.close();
            }
            } 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

public void tampilMember()
    { 
        // nampilin isi item di combo box id_buku 
        try {
            Connect c = new Connect ();
        Connection con = c.getConnection();
            try (Statement stt = con.createStatement()) {
                String sql = "select Nama from peminjaman right join anggota on peminjaman.ID_Member = anggota.ID_Anggota";           
            try (ResultSet res = stt.executeQuery(sql) ) {        
                FMember.removeAllItems();
                while(res.next()){                 
                    Object[] ob = new Object[3];
                    ob[1] = res.getString(1);
                    FMember.addItem((String) ob[1]);     
                }
                 res.close(); stt.close();
            }
            } 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
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
    private javax.swing.JButton Clear;
    private javax.swing.JComboBox<String> FBuku;
    private javax.swing.JTextField FDenda;
    private javax.swing.JTextField FJatuhTempo;
    private javax.swing.JTextField FKembali;
    private javax.swing.JComboBox<String> FMember;
    private javax.swing.JComboBox<String> FPetugas;
    private javax.swing.JComboBox<String> FPinjam;
    private javax.swing.JTextField FTanggalPinjam;
    private javax.swing.JButton Hapus;
    private javax.swing.JLabel IDBuku;
    private javax.swing.JLabel IDMember;
    private javax.swing.JLabel IDPeminjaman;
    private javax.swing.JLabel IDPeminjaman1;
    private javax.swing.JLabel JatuhTempo;
    private javax.swing.JLabel Profile;
    private javax.swing.JTable TabelKembali;
    private javax.swing.JButton Tambah;
    private javax.swing.JLabel TglPinjam;
    private javax.swing.JLabel TglPinjam1;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
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
