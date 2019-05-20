/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import funcionalidad.Abonado;
import java.time.LocalDate;
import modelo.AbonadoVO;
import modelo.EnviarDatos;

/**
 *
 * @author jose
 */
public class MenuAltas extends javax.swing.JFrame {

    /**
     * Creates new form MenuAltas
     */
    public MenuAltas() {
        initComponents();
         this.setSize(600, 482);
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
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tMatricula = new javax.swing.JTextField();
        Tnombre = new javax.swing.JTextField();
        Tfecini = new javax.swing.JTextField();
        Tfecnac = new javax.swing.JTextField();
        Temail = new javax.swing.JTextField();
        Ttarjeta = new javax.swing.JTextField();
        Tdni = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Tmatricula = new javax.swing.JLabel();
        Tabono = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 5, 11));
        jLabel3.setText("Administración");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jButton6.setText("Atrás");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Datos Personales");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 20));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("TipoAbono:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 90, 20));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Fecha Inicio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Fecha Nacimiento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("DNI:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Email:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 20));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setText("NºTarjetaBancaria:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 20));
        getContentPane().add(tMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 420, -1));

        Tnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnombreActionPerformed(evt);
            }
        });
        getContentPane().add(Tnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 420, 30));
        getContentPane().add(Tfecini, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 410, -1));

        Tfecnac.setText("Formato-> xxxx/xx/xx");
        Tfecnac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfecnacActionPerformed(evt);
            }
        });
        getContentPane().add(Tfecnac, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 370, -1));
        getContentPane().add(Temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 450, -1));
        getContentPane().add(Ttarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 370, -1));
        getContentPane().add(Tdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 450, -1));

        jButton2.setText("ALTA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 130, 40));

        Tmatricula.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Tmatricula.setText("Matricula:");
        getContentPane().add(Tmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, 20));

        Tabono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MENSUAL", "TRIMESTRAL", "SEMESTRAL", "ANUAL" }));
        Tabono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabonoActionPerformed(evt);
            }
        });
        getContentPane().add(Tabono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Atras
        new ZonaAdministrador().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Salir:
        System.exit(1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TfecnacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfecnacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfecnacActionPerformed

    private void TnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // dAR DE ALTA
        AbonadoVO registrado = new AbonadoVO();
        registrado.setNombre(Tnombre.getText());
        registrado.setFeciniabo(LocalDate.parse(Tfecini.getText()));
        registrado.setFechaNacimiento(LocalDate.parse(Tfecnac.getText()));
        registrado.setDni(Tdni.getText());
        registrado.setEmail(Temail.getText());
        registrado.setNumTarjeta(Ttarjeta.getText());
        registrado.setMatricula(Tmatricula.getText());
        registrado.setTipoDeAbono(Tabono.getToolTipText());
        
        EnviarDatos.insertarAbonado(registrado);
        // FIN TEMPORAL
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TabonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TabonoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAltas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Tabono;
    private javax.swing.JTextField Tdni;
    private javax.swing.JTextField Temail;
    private javax.swing.JTextField Tfecini;
    private javax.swing.JTextField Tfecnac;
    private javax.swing.JLabel Tmatricula;
    private javax.swing.JTextField Tnombre;
    private javax.swing.JTextField Ttarjeta;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tMatricula;
    // End of variables declaration//GEN-END:variables
}
