/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import funcionalidad.Abonado;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;

/**
 *
 * @author José
 */
public class MenuDepositarAbonado extends javax.swing.JFrame implements FocusListener {

    /**
     * Creates new form MenuDepositarAbonado
     */
    public MenuDepositarAbonado() {
        initComponents();
        this.setSize(578, 462);
        panel = graficoPlazas.crearPanelParking();
        // Al estar el textField de la matrícula en foco, se borrará el texto interior
        // Si sale el foco y no hay nada escrito, se volverá a escribir el texto por defecto
        introducirMatriculaTextField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                introducirMatriculaTextField.setText("");
            }
            public void focusLost(FocusEvent e) {
                if (introducirMatriculaTextField.getText().equalsIgnoreCase("")) {
                    introducirMatriculaTextField.setText("Introduzca Su Identificación");
                }
            }
        });
        // Al estar el textField del DNI en foco, se borrará el texto interior
        introducirDniTextField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                introducirDniTextField.setText("");
            }
            public void focusLost(FocusEvent e) {
                if (introducirDniTextField.getText().equalsIgnoreCase("")) {
                    introducirDniTextField.setText("Dni");
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

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        retirar = new javax.swing.JButton();
        introducirMatriculaTextField = new javax.swing.JTextField();
        introducirDniTextField = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(1, 1, 1));
        panel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(3, 2, 12)));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 340));

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Información de las Plazas");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(228, 18, 18)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 5, 11));
        jLabel2.setText("Zona Clientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Depositar Abonado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Introduzca Su Matricula:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Introduzca Su Dni:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, 10));

        jLabel24.setForeground(new java.awt.Color(255, 255, 0));
        jLabel24.setText("By.....Devas & Kanche");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Su Pin Es:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        retirar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        retirar.setText("Depositar");
        retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarActionPerformed(evt);
            }
        });
        getContentPane().add(retirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 80, 50));

        introducirMatriculaTextField.setText("Matricula");
        introducirMatriculaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introducirMatriculaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(introducirMatriculaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 120, -1));

        introducirDniTextField.setText("Dni");
        introducirDniTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introducirDniTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(introducirDniTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 140, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 600, 950));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Fondo.jpg"))); // NOI18N
        getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        new ZonaClientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarActionPerformed
        // Depositar:
        if (introducirDniTextField.getText().length() == 9) {
            JOptionPane.showMessageDialog(null, "Vehículo introducido con éxito");
            jLabel7.setText(Abonado.generarPin(introducirMatriculaTextField.getText(), introducirDniTextField.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "Formato Del Dni Inválido."
                    + "Porfavor Únicamente 9 Carácteres");
        }


    }//GEN-LAST:event_retirarActionPerformed

    private void introducirMatriculaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introducirMatriculaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_introducirMatriculaTextFieldActionPerformed

    private void introducirDniTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introducirDniTextFieldActionPerformed
        // TODO add your handling code here:
        if (evt.getActionCommand().equals("onfocus"));
        {
            introducirDniTextField.setText("");
        }
    }//GEN-LAST:event_introducirDniTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDepositarAbonado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDepositarAbonado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDepositarAbonado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDepositarAbonado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDepositarAbonado().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JTextField introducirDniTextField;
    private javax.swing.JTextField introducirMatriculaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel panel;
    private javax.swing.JButton retirar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

    @Override
    public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
