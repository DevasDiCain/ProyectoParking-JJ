/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import funcionalidad.Plaza;
import funcionalidad.Vehiculo;
import java.awt.Color;
import modelo.EnviarDatos;

/**
 *
 * @author José
 */
public class MenuDepositarVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form MenuDepositarVehiculo
     */
    private Vehiculo vehiculo;
    private int contadorCaravanas;
    private int contadorTurismos;
    private int contadorMotocicletas;

    public MenuDepositarVehiculo() {
        initComponents();
        this.setSize(575, 462);

        for (int i = 0; i < ZonaClientes.plazas.getMatriz().length; i++) {
            for (int j = 0; j < ZonaClientes.plazas.getMatriz().length; j++) {
                panel.add(ZonaClientes.plazas.getPlaza(i, j));
                if (ZonaClientes.plazas.getPlaza(i, j).getPlaza().getTipo().equals(ZonaClientes.plazas.getPlaza(i, j).getPlaza().getTipo().CARAVANA)) {
                    contadorCaravanas++;
                    
                }
                if(ZonaClientes.plazas.getPlaza(i, j).getPlaza().getTipo().equals(ZonaClientes.plazas.getPlaza(i, j).getPlaza().getTipo().MOTOCICLETA)){
                    contadorMotocicletas++;
                }
                if(ZonaClientes.plazas.getPlaza(i, j).getPlaza().getTipo().equals(ZonaClientes.plazas.getPlaza(i, j).getPlaza().getTipo().TURISMO)){
                      contadorTurismos++;
                }
            }
        }
        
        turismosLibres.setText(String.valueOf(contadorTurismos));
        turismosLibres.setForeground(Color.yellow);
        
        motosLibres.setText(String.valueOf( contadorMotocicletas));
        motosLibres.setForeground(Color.blue);
        
        caravanasLibres.setText(String.valueOf(contadorCaravanas));
        caravanasLibres.setForeground(Color.white);
        
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

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

        jTextField1.setText("Introduzca Su Matricula");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 190, -1));

        jTextField2.setText("Introduzca El Tipo De Vehículo");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 190, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel11.setText("jLabel1");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel12.setText("jLabel1");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 160, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel13.setText("jLabel1");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 160, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel16.setText("jLabel1");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 160, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel17.setText("jLabel1");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 160, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel19.setText("jLabel1");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 160, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel20.setText("jLabel1");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 160, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel21.setText("jLabel1");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 160, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel22.setText("jLabel1");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 160, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel23.setText("jLabel1");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 160, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel24.setText("jLabel1");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 160, -1));

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

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel14.setText("jLabel5");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel18.setText("jLabel5");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel25.setText("jLabel1");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 160, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel26.setText("jLabel1");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 160, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel27.setText("jLabel1");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 160, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel28.setText("jLabel1");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        vehiculo.setMatricula(jTextField1.getText());// Recogemos la matricula del coche 
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        vehiculo.setTipoDeVehiculo(Vehiculo.conversion(jTextField2.getText()));//Método que convierte el tipo introducido (string) en el tipo de vehiculo, tiene encuenta mayusculas y minusculas
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
            System.exit(1);
    }//GEN-LAST:event_salirActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.setVisible(false);
        new ZonaClientes().setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // AQUÍ  MANDAREMOS LA INFO AL MODELO
    
        
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel motosLibres;
    private javax.swing.JPanel panel;
    private javax.swing.JButton salir;
    private javax.swing.JLabel turismosLibres;
    // End of variables declaration//GEN-END:variables
}
