/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormTugasAkhir;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.koneksi;

/**
 *
 * @author IKHSAN
 */
public class Daftar extends javax.swing.JFrame {

    private Connection conn = new koneksi().connect();

    /**
     * Creates new form Daftar
     */
    public Daftar() {
        initComponents();
    }

    protected void kosong() {
        Txt_User.setText("");
        Txt_Pw.setText("");
        Txt_Pw2.setText("");
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
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txt_User = new javax.swing.JTextField();
        Txt_Pw = new javax.swing.JPasswordField();
        Balek = new javax.swing.JButton();
        D = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Txt_Pw2 = new javax.swing.JPasswordField();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Masukan Username : ");

        jLabel4.setText("Masukan Password :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DAFTAR AKUN");

        Txt_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_UserActionPerformed(evt);
            }
        });

        Txt_Pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_PwActionPerformed(evt);
            }
        });

        Balek.setText("KEMBALI");
        Balek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalekActionPerformed(evt);
            }
        });

        D.setText("DAFTAR");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        jLabel6.setText("Ulangi Password :");

        Txt_Pw2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Pw2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Balek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(D)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_User, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(Txt_Pw, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Txt_Pw2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Pw2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Balek)
                    .addComponent(D))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_PwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_PwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_PwActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        String sql = "insert into user values (?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            String ser = Txt_User.getText().toUpperCase();
            String pw = Txt_Pw.getText().toUpperCase();
            stat.setString(1, ser);
            stat.setString(2, pw);
            String mem = Txt_User.getText().toUpperCase();
            String pass = Txt_Pw.getText().toUpperCase();
            String pass2 = Txt_Pw2.getText().toUpperCase();
            if (mem.equals("") || pass.equals("") || pass2.equals("")) {
                JOptionPane.showMessageDialog(null, "USERNAME & PASSWORD TIDAK BOLEH KOSONG!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                Txt_Pw.setText("");
                Txt_Pw2.setText("");
            } else if (pass == null ? pass2 == null : pass.equals(pass2)) {
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "DAFTAR SUKSES");
                this.setVisible(false);
                new Login().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "PASSWORD BEDA", "Peringatan", JOptionPane.WARNING_MESSAGE);
                Txt_Pw.setText("");
                Txt_Pw2.setText("");
            }
            kosong();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DAFTAR GAGAL, USERNAME SUDAH DIGUNAKAN");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_DActionPerformed

    private void Txt_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_UserActionPerformed

    private void Txt_Pw2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Pw2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Pw2ActionPerformed

    private void BalekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalekActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BalekActionPerformed

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
            java.util.logging.Logger.getLogger(Daftar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Balek;
    private javax.swing.JButton D;
    private javax.swing.JPasswordField Txt_Pw;
    private javax.swing.JPasswordField Txt_Pw2;
    private javax.swing.JTextField Txt_User;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
