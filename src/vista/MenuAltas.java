/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import funcionalidad.Abonado;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import modelo.AbonadoVO;
import modelo.EnviarDatos;

/**
 *
 * @author jose
 */
public class MenuAltas extends javax.swing.JFrame {
    public boolean comprobacionCorrecta = false;

    /**
     * Creates new form MenuAltas
     */
    public MenuAltas() {
        initComponents();
         this.setSize(630, 550);
    }

    
    public static LocalDate convertirStringFecha(String cadena){
       LocalDate localDate1 = LocalDate.parse(cadena, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
       return localDate1;
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
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

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
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Datos Personales");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 20));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("TipoAbono:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, 20));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Fecha Inicio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Fecha Nacimiento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("DNI:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Email:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 20));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setText("NºTarjetaBancaria:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, 20));

        tMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(tMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 410, -1));

        Tnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnombreActionPerformed(evt);
            }
        });
        getContentPane().add(Tnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 430, 30));

        Tfecini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfeciniActionPerformed(evt);
            }
        });
        getContentPane().add(Tfecini, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 400, -1));

        Tfecnac.setText("Formato-> xxxx/xx/xx");
        Tfecnac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfecnacActionPerformed(evt);
            }
        });
        getContentPane().add(Tfecnac, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 370, -1));
        getContentPane().add(Temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 450, -1));
        getContentPane().add(Ttarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 370, -1));
        getContentPane().add(Tdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 450, -1));

        jButton2.setText("ALTA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 130, 40));

        Tmatricula.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Tmatricula.setText("Matricula:");
        getContentPane().add(Tmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 90, 20));

        Tabono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MENSUAL", "TRIMESTRAL", "SEMESTRAL", "ANUAL" }));
        Tabono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabonoActionPerformed(evt);
            }
        });
        getContentPane().add(Tabono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("By... Devas & Kanche");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, 20));

        jButton1.setText("Comprobar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Atras
        new MenuAbonos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Salir:
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TfecnacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfecnacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfecnacActionPerformed

    private void TnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // DAR DE ALTA
 
        if (comprobacionCorrecta) {
            AbonadoVO registrado = new AbonadoVO();
            LocalDate tiempo = LocalDate.of(1995, Month.MARCH, 12);

            registrado.setNombre(Tnombre.getText());
            registrado.setFeciniabo(tiempo);
            registrado.setFecfinabo(tiempo);
            registrado.setFechaNacimiento(tiempo);
            registrado.setDni(Tdni.getText());
            registrado.setEmail(Temail.getText());
            registrado.setNumTarjeta(Ttarjeta.getText());
            registrado.setMatricula(tMatricula.getText());
            registrado.setTipoDeAbono(String.valueOf(Tabono.getSelectedItem()));

            EnviarDatos.insertarAbonado(registrado);
            this.setVisible(false);
            new ZonaAdministrador().setVisible(true);
            // FIN TEMPORAL
            JOptionPane.showMessageDialog(null, "Alta realizada con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "No podrá realizar esta acción si no se han comprobado los datos correctamente antes");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TabonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TabonoActionPerformed

    private void TfeciniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfeciniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfeciniActionPerformed

    private void tMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMatriculaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Comprobar
        if(Tnombre.getText().contains("-") || Tnombre.getText().contains("/") || Tnombre.getText().contains("*") || Tnombre.getText().contains("1")|| Tnombre.getText().contains("2")|| Tnombre.getText().contains("3")|| Tnombre.getText().contains("4")
                || Tnombre.getText().contains("5")|| Tnombre.getText().contains("6")|| Tnombre.getText().contains("7")|| Tnombre.getText().contains("8")|| Tnombre.getText().contains("9")|| Tnombre.getText().contains("=")|| Tnombre.getText().contains("&")|| Tnombre.getText().contains("%")){
            JOptionPane.showMessageDialog(null, "Carácteres incorrectos"
                    + "Carácteres Inválidos: {-/*123456789=&}");
        }
        if(Tdni.getText().length() > 9 || Tdni.getText().length() < 9){
            JOptionPane.showMessageDialog(null, "Dimensión del Dni incorrecta");
        }
         if(Ttarjeta.getText().length() > 16 || Ttarjeta.getText().length() < 16){
            JOptionPane.showMessageDialog(null, "Dimensión del numero de tarjeta incorrecto");
        }
         else{
         JOptionPane.showMessageDialog(null, "Formato correcto");
         comprobacionCorrecta = true;}
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
