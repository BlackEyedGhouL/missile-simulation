/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsa_cw2_t1;

import java.awt.Toolkit;

/**
 *
 * @author ASUS
 */
public class Instruction extends javax.swing.JFrame {

    /**
     * Creates new form Instruction
     */
    public Instruction() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("missile_64px.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblmap1 = new javax.swing.JLabel();
        lblmap2 = new javax.swing.JLabel();
        btnplay = new javax.swing.JButton();
        lblclose = new javax.swing.JLabel();
        lblmap3 = new javax.swing.JLabel();
        lblmap4 = new javax.swing.JLabel();
        lblmap5 = new javax.swing.JLabel();
        lblmap6 = new javax.swing.JLabel();
        lblmap7 = new javax.swing.JLabel();
        lblmap8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Missile Simulation");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));

        lblmap1.setBackground(new java.awt.Color(102, 102, 102));
        lblmap1.setForeground(new java.awt.Color(204, 204, 204));
        lblmap1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdsa_cw2_t1/Untitled design (2).png"))); // NOI18N

        lblmap2.setBackground(new java.awt.Color(102, 102, 102));
        lblmap2.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblmap2.setForeground(new java.awt.Color(204, 204, 204));
        lblmap2.setText("INSTRUCTIONS");

        btnplay.setBackground(new java.awt.Color(198, 18, 18));
        btnplay.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnplay.setForeground(new java.awt.Color(255, 255, 255));
        btnplay.setText("CLICK TO START");
        btnplay.setBorder(null);
        btnplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplayActionPerformed(evt);
            }
        });

        lblclose.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        lblclose.setForeground(new java.awt.Color(255, 184, 0));
        lblclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdsa_cw2_t1/delete_32px.png"))); // NOI18N
        lblclose.setToolTipText("");
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });

        lblmap3.setBackground(new java.awt.Color(102, 102, 102));
        lblmap3.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lblmap3.setForeground(new java.awt.Color(204, 204, 204));
        lblmap3.setText("> You must calculate the");

        lblmap4.setBackground(new java.awt.Color(102, 102, 102));
        lblmap4.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lblmap4.setForeground(new java.awt.Color(204, 204, 204));
        lblmap4.setText("shortest distance according");

        lblmap5.setBackground(new java.awt.Color(102, 102, 102));
        lblmap5.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lblmap5.setForeground(new java.awt.Color(204, 204, 204));
        lblmap5.setText("to alphabetical order.");

        lblmap6.setBackground(new java.awt.Color(102, 102, 102));
        lblmap6.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lblmap6.setForeground(new java.awt.Color(204, 204, 204));
        lblmap6.setText("> Use given buttons to");

        lblmap7.setBackground(new java.awt.Color(102, 102, 102));
        lblmap7.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lblmap7.setForeground(new java.awt.Color(204, 204, 204));
        lblmap7.setText("guide the  missile");
        lblmap7.setToolTipText("");

        lblmap8.setBackground(new java.awt.Color(102, 102, 102));
        lblmap8.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lblmap8.setForeground(new java.awt.Color(204, 204, 204));
        lblmap8.setText("> Are you ready?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblmap1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblclose)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblmap4, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmap3, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmap5, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmap6, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmap7, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmap8, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblmap2)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnplay, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblmap1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblclose)
                .addGap(28, 28, 28)
                .addComponent(lblmap2)
                .addGap(42, 42, 42)
                .addComponent(lblmap3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmap4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmap5)
                .addGap(27, 27, 27)
                .addComponent(lblmap6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmap7)
                .addGap(27, 27, 27)
                .addComponent(lblmap8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1065, 615));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplayActionPerformed
        // TODO add your handling code here:
        new Map1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnplayActionPerformed

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked

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
            java.util.logging.Logger.getLogger(Instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instruction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnplay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmap1;
    private javax.swing.JLabel lblmap2;
    private javax.swing.JLabel lblmap3;
    private javax.swing.JLabel lblmap4;
    private javax.swing.JLabel lblmap5;
    private javax.swing.JLabel lblmap6;
    private javax.swing.JLabel lblmap7;
    private javax.swing.JLabel lblmap8;
    // End of variables declaration//GEN-END:variables
}
