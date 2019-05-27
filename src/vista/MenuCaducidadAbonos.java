/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.EnviarDatos;

/**
 *
 * @author José
 */
public class MenuCaducidadAbonos extends javax.swing.JFrame {

    /**
     * Creates new form MenuCaducidadAbonos
     */
    public MenuCaducidadAbonos() {
        initComponents();
        this.setSize(580, 420);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        darAltaAbonado = new javax.swing.JButton();
        MODIFICACIÓN = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        introducirMatriculaTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 5, 11));
        jLabel2.setText("Zona Administrador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        darAltaAbonado.setText("Caducidad");
        darAltaAbonado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darAltaAbonadoActionPerformed(evt);
            }
        });
        getContentPane().add(darAltaAbonado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 50));

        MODIFICACIÓN.setText("Próximos 10 dias");
        MODIFICACIÓN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICACIÓNActionPerformed(evt);
            }
        });
        getContentPane().add(MODIFICACIÓN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, 50));

        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        jLabel22.setBackground(new java.awt.Color(250, 13, 31));
        jLabel22.setForeground(new java.awt.Color(0, 102, 102));
        jLabel22.setText("By... Devas & Kanche");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 20));

        introducirMatriculaTextField.setText("Introduzca Un Mes");
        introducirMatriculaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introducirMatriculaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(introducirMatriculaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 240, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Caducidad de  Abonados");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, -1));

        jButton2.setText("Enviar Email ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 360, -1));

        jButton3.setText("Enviar Email ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 360, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void darAltaAbonadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darAltaAbonadoActionPerformed
        // Caducidad Mensual
        new InfoCaducidadMensual().setVisible(true);
    }//GEN-LAST:event_darAltaAbonadoActionPerformed

    private void MODIFICACIÓNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICACIÓNActionPerformed
        // Caducidad 10 dias
      new InfoCaducidadSemanal().setVisible(true);
    }//GEN-LAST:event_MODIFICACIÓNActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        new MenuAbonos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void introducirMatriculaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introducirMatriculaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_introducirMatriculaTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Enviar Email 1 mes:
        EnviarDatos.enviarEmail("",);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Enviar Email 1 semana:
        EnviarDatos.enviarEmail("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCaducidadAbonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCaducidadAbonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCaducidadAbonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCaducidadAbonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCaducidadAbonos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MODIFICACIÓN;
    private javax.swing.JButton atras;
    private javax.swing.JButton darAltaAbonado;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField introducirMatriculaTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
