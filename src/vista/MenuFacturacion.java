/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author José
 */
public class MenuFacturacion extends javax.swing.JFrame {

    /**
     * Creates new form MenuFacturacion
     */
    public MenuFacturacion() {
        initComponents();
        this.setSize(499, 380);
        // Al estar el textField en foco, se borrará el texto interior
        // Si sale el foco y no hay nada escrito, se volverá a escribir el texto por defecto
        desde.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                desde.setText("");

            }

            public void focusLost(FocusEvent e) {
                if (desde.getText().equalsIgnoreCase("")) {
                    desde.setText("Desde");
                }
            }
        });
        hasta.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                hasta.setText("");

            }

            public void focusLost(FocusEvent e) {
                if (hasta.getText().equalsIgnoreCase("")) {
                    hasta.setText("Hasta");
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        desde = new javax.swing.JTextField();
        hasta = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 5, 11));
        jLabel3.setText("Administración");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Facturación");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 110, 40));

        jButton1.setText("Entre fechas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 100, -1));

        jButton2.setText("Abonados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, 40));

        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        desde.setText("Desde");
        desde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desdeActionPerformed(evt);
            }
        });
        getContentPane().add(desde, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 70, -1));

        hasta.setText("Hasta");
        getContentPane().add(hasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 80, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 600, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        new ZonaAdministrador().setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Facturacion por fechas
        LocalDate primeraFecha = LocalDate.parse(desde.getText());
        LocalDate segundaFecha = LocalDate.parse(hasta.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Facturacion por abonados
    }//GEN-LAST:event_jButton2ActionPerformed

    private void desdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desdeActionPerformed

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
            java.util.logging.Logger.getLogger(MenuFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFacturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JTextField desde;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField hasta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
