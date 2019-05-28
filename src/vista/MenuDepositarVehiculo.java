/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import funcionalidad.Plaza;
import funcionalidad.Vehiculo;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import modelo.EnviarDatos;
import modelo.PlazaVO;
import modelo.VehiculoDAO;
import modelo.VehiculoVO;

/**
 *
 * @author José
 */
public class MenuDepositarVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form MenuDepositarVehiculo
     */
    private VehiculoVO vehiculo;
    private int contadorCaravanas;
    private int contadorTurismos;
    private int contadorMotocicletas;

    public MenuDepositarVehiculo() {
        initComponents();
        this.setSize(575, 462);

        panel.setLayout(new GridLayout(7, 7));
        for (int i = 0; i < graficoPlazas.matriz.length; i++) {
            for (int j = 0; j < graficoPlazas.matriz.length; j++) {
                graficoPlazas.matriz[i][j].setToolTipText(Integer.toString((i + 1)) + "," + Integer.toString((j + 1)));
                panel.add(graficoPlazas.recuperarBoton(i, j));

            }
        }

        turismosLibres.setText(String.valueOf(VehiculoDAO.turismosLibres()));
        turismosLibres.setForeground(Color.green);
        motosLibres.setText(String.valueOf(VehiculoDAO.motocicletasLibres()));
        motosLibres.setForeground(Color.yellow);
        caravanasLibres.setText(String.valueOf(VehiculoDAO.caravanasLibres()));
        caravanasLibres.setForeground(Color.blue);

        // Al estar el textField de la matrícula en foco, se borrará el texto interior
        // Si sale el foco y no hay nada escrito, se volverá a escribir el texto por defecto
        introducirMatriculaTextField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                introducirMatriculaTextField.setText("");

            }

            public void focusLost(FocusEvent e) {
                if (introducirMatriculaTextField.getText().equalsIgnoreCase("")) {
                    introducirMatriculaTextField.setText("Introduzca Su Matricula");
                }
            }
        });

        // Al estar el textField de la matrícula en foco, se borrará el texto interior
        // Si sale el foco y no hay nada escrito, se volverá a escribir el texto por defecto
        introducirMatriculaTextField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                introducirMatriculaTextField.setText("");

            }

            public void focusLost(FocusEvent e) {
                if (introducirMatriculaTextField.getText().equalsIgnoreCase("")) {
                    introducirMatriculaTextField.setText("Introduzca Su Matricula");
                }
            }
        });
        introducirTipoVehiculoTextField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                introducirTipoVehiculoTextField.setText("");

            }

            public void focusLost(FocusEvent e) {
                if (introducirTipoVehiculoTextField.getText().equalsIgnoreCase("")) {
                    introducirTipoVehiculoTextField.setText("Introduzca El Tipo De Vehículo");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        turismosLibres = new javax.swing.JLabel();
        motosLibres = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        caravanasLibres = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        introducirMatriculaTextField = new javax.swing.JTextField();
        introducirTipoVehiculoTextField = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(1, 1, 1));
        panel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(254, 6, 6)));

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

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Información de las Plazas");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(228, 18, 18)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 5, 11));
        jLabel3.setText("Zona Clientes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("By... Devas & Kanche");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Número De Plazas Libres");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Turismos:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Motocicletas:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        turismosLibres.setText("jLabel7");
        getContentPane().add(turismosLibres, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        motosLibres.setText("jLabel8");
        getContentPane().add(motosLibres, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Caravanas:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        caravanasLibres.setText("jLabel10");
        getContentPane().add(caravanasLibres, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Depositar Un Vehículo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Matricula:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Tipo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        introducirMatriculaTextField.setText("Introduzca Su Matricula");
        introducirMatriculaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introducirMatriculaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(introducirMatriculaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 190, -1));

        introducirTipoVehiculoTextField.setText("Introduzca El Tipo De Vehículo");
        introducirTipoVehiculoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introducirTipoVehiculoTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(introducirTipoVehiculoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 190, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void introducirMatriculaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introducirMatriculaTextFieldActionPerformed
        vehiculo.setMatricula(introducirMatriculaTextField.getText());// Recogemos la matricula del coche 
    }//GEN-LAST:event_introducirMatriculaTextFieldActionPerformed

    private void introducirTipoVehiculoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introducirTipoVehiculoTextFieldActionPerformed
        if (introducirTipoVehiculoTextField.getText().equalsIgnoreCase("turismo") || introducirTipoVehiculoTextField.getText().equalsIgnoreCase("caravana") || introducirTipoVehiculoTextField.getText().equalsIgnoreCase("motocicleta")) {
            vehiculo.setTipoVehiculo(introducirTipoVehiculoTextField.getText());
        }

    }//GEN-LAST:event_introducirTipoVehiculoTextFieldActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.setVisible(false);
        new ZonaClientes().setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // AQUÍ  MANDAREMOS LA INFO AL MODELO
        if (introducirTipoVehiculoTextField.getText().equalsIgnoreCase("turismo") || introducirTipoVehiculoTextField.getText().equalsIgnoreCase("caravana") || introducirTipoVehiculoTextField.getText().equalsIgnoreCase("motocicleta") || !introducirMatriculaTextField.equals("") || !introducirMatriculaTextField.equals("Introduzca El Tipo De Vehículo")) {
            VehiculoVO x = new VehiculoVO();
            if (introducirMatriculaTextField.getText().length() == 7) {
                x.setMatricula(introducirMatriculaTextField.getText());
                x.setTipoVehiculo(introducirTipoVehiculoTextField.getText());
                x.setCodPlaza(EnviarDatos.ultimoVehiculo());
                EnviarDatos.insertarVehiculo(x);
                JOptionPane.showMessageDialog(null, "Vehiculo introducido correctamente");
                
            } else {
                JOptionPane.showMessageDialog(null, "La matricula solo puede tener 7 caracteres");
            }

        } else {
            JOptionPane.showMessageDialog(null, "El tipo de vehículo es incorrecto.");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDepositarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDepositarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDepositarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDepositarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDepositarVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JLabel caravanasLibres;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField introducirMatriculaTextField;
    private javax.swing.JTextField introducirTipoVehiculoTextField;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel motosLibres;
    private javax.swing.JPanel panel;
    private javax.swing.JButton salir;
    private javax.swing.JLabel turismosLibres;
    // End of variables declaration//GEN-END:variables
}
