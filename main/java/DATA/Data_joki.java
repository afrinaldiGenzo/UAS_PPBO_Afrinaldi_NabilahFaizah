/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;
import controller.di_data_joki;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class Data_joki extends javax.swing.JFrame {
    private void viewData(){
        di_data_joki ck = new di_data_joki();
        try{
            jTable2.setModel(DbUtils.resultSetToTableModel(ck.UpdateJTable()));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * Creates new form data_joki1
     */
    public Data_joki() {
        initComponents();
    }

    private void AmbilJK(String jk){
        if (jk.equals("REGULER")){
            rdr.setSelected(true);
        }else {
            rde.setSelected(true);
        }
    }
    
    private void AmbilTipe(String Tipe_Tugas){
        String[] tt = {"MAKALAH","CODING","MATEMATIKA","DESIGN","LAINNYA"};
        comtipe.removeAllItems();
        comtipe.addItem(Tipe_Tugas);
        for (int i = 0; i<tt.length; i++){
            if(!tt[i].equals(Tipe_Tugas)){
                comtipe.addItem(tt[i]);
            }
        }
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txid = new javax.swing.JTextField();
        txnama = new javax.swing.JTextField();
        comtipe = new javax.swing.JComboBox<>();
        txnamap = new javax.swing.JTextField();
        rdr = new javax.swing.JRadioButton();
        rde = new javax.swing.JRadioButton();
        cbsave = new javax.swing.JButton();
        cbadd = new javax.swing.JButton();
        cbedit = new javax.swing.JButton();
        cbdelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnamaActionPerformed(evt);
            }
        });

        comtipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAKALAH", "CODING", "MATEMATIKA", "DESIGN", "LAINNYA" }));
        comtipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comtipeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdr);
        rdr.setText("REGULER");
        rdr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdrActionPerformed(evt);
            }
        });

        buttonGroup1.add(rde);
        rde.setText("EXPRESS");
        rde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdeActionPerformed(evt);
            }
        });

        cbsave.setText("SIMPAN");
        cbsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsaveActionPerformed(evt);
            }
        });

        cbadd.setText("TAMBAH");
        cbadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbaddActionPerformed(evt);
            }
        });

        cbedit.setText("EDIT");
        cbedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbeditActionPerformed(evt);
            }
        });

        cbdelete.setText("HAPUS");
        cbdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdeleteActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("JOKI IS FUN");

        jLabel2.setText("ID");

        jLabel3.setText("Nama Pelanggan");

        jLabel4.setText("Tipe Tugas");

        jLabel5.setText("Nama Pekerja");

        jLabel6.setText("Prioritas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(cbsave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbadd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbedit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(183, 206, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txid, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txnama))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txnamap, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdr, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rde, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comtipe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txnamap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdr)
                    .addComponent(rde)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comtipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbsave)
                    .addComponent(cbadd)
                    .addComponent(cbedit)
                    .addComponent(cbdelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdrActionPerformed

    private void cbsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsaveActionPerformed
    di_data_joki ck = new di_data_joki();
    ck.ID = txid.getText();
    ck.Nama_Pelanggan = txnama.getText();
    ck.Tipe_Tugas = (String) comtipe.getSelectedItem();
        ck.Nama_Pekerja = txnamap.getText();
        if (rdr.isSelected() == true){
            ck.Prioritas = "REGULER";
        }else{
            ck.Prioritas = "EXPRESS";
        }
        
        try{
            ck.simpan();
            JOptionPane.showMessageDialog(null, "BERHASIL");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        viewData();
        // TODO add your handling code here:
    }//GEN-LAST:event_cbsaveActionPerformed

    private void cbaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbaddActionPerformed
    txid.setText("");
    txnama.setText("");    
    comtipe.setSelectedItem("");
    txnamap.setText("");
    buttonGroup1.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_cbaddActionPerformed

    private void cbeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbeditActionPerformed
    di_data_joki ck = new di_data_joki();
    ck.ID = txid.getText();
    ck.Nama_Pelanggan = txnama.getText();
    ck.Tipe_Tugas = (String) comtipe.getSelectedItem();
    ck.Nama_Pekerja = txnamap.getText();
    if (rdr.isSelected() == true){
            ck.Prioritas = "REGULER";
        }else{
            ck.Prioritas = "EXPRESS";
        }
    try{
            ck.edit();
            JOptionPane.showMessageDialog(null, "BERHASIL");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        viewData(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_cbeditActionPerformed

    private void cbdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdeleteActionPerformed
    String ObjButtons[] = {"yes", "no"};
    int PromptResult = JOptionPane.showOptionDialog(null, "yakin hapus?", "message", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ObjButtons, ObjButtons[1]);
    if (PromptResult == 0){
        di_data_joki ck = new di_data_joki();
        ck.ID = txid.getText();
        try{
            ck.hapus();
            JOptionPane.showMessageDialog(null, "DIHAPUS");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }    
        }
    viewData();
        // TODO add your handling code here:
    }//GEN-LAST:event_cbdeleteActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
    int row = jTable2.getSelectedColumn();
        txid.setText(jTable2.getModel().getValueAt(row,0).toString());
        txnama.setText(jTable2.getModel().getValueAt(row,1).toString());
        String Tipe_Tugas = jTable2.getModel().getValueAt(row,2).toString();
        AmbilTipe(Tipe_Tugas);
        txnamap.setText(jTable2.getModel().getValueAt(row,3).toString());
        String Prioritas = jTable2.getModel().getValueAt(row,4).toString();
        AmbilJK (Prioritas);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void comtipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comtipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comtipeActionPerformed

    private void rdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdeActionPerformed

    private void txnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnamaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set thrdr and feel */
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
            java.util.logging.Logger.getLogger(Data_joki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_joki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_joki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_joki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_joki().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cbadd;
    private javax.swing.JButton cbdelete;
    private javax.swing.JButton cbedit;
    private javax.swing.JButton cbsave;
    private javax.swing.JComboBox<String> comtipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton rde;
    private javax.swing.JRadioButton rdr;
    private javax.swing.JTextField txid;
    private javax.swing.JTextField txnama;
    private javax.swing.JTextField txnamap;
    // End of variables declaration//GEN-END:variables
}