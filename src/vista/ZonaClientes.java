/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author jose
 */
public class ZonaClientes extends javax.swing.JFrame {

    public static  graficoPlazas plazas;
    private int contador;

    public ZonaClientes() {
        initComponents();
        this.setSize(578, 462);
        panel = graficoPlazas.crearPanelParking();
    }

    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZonaClientes().setVisible(true);

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
        jButton1 = new javax.swing.JButton();
        botonRetirarVehiculo = new javax.swing.JButton();
        menuDepositarVehiculo = new javax.swing.JButton();
        botonMenuDepositarAbonados = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(1, 1, 1));
        panel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(3, 2, 12)));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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

        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jButton1.setText("Retirar Abonados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 120, 60));

        botonRetirarVehiculo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        botonRetirarVehiculo.setText("Retirar Vehículo");
        botonRetirarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetirarVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(botonRetirarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 120, 60));

        menuDepositarVehiculo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        menuDepositarVehiculo.setText("Depositar Vehículo");
        menuDepositarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDepositarVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(menuDepositarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 120, 60));

        botonMenuDepositarAbonados.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        botonMenuDepositarAbonados.setText("Depositar Abonados");
        botonMenuDepositarAbonados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuDepositarAbonadosActionPerformed(evt);
            }
        });
        getContentPane().add(botonMenuDepositarAbonados, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 120, 60));

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 5, 11));
        jLabel2.setText("Zona Clientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel22.setBackground(new java.awt.Color(250, 13, 31));
        jLabel22.setForeground(new java.awt.Color(243, 249, 5));
        jLabel22.setText("By... Devas & Kanche");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, -1, -1));

        jLabel23.setBackground(new java.awt.Color(250, 13, 31));
        jLabel23.setForeground(new java.awt.Color(243, 249, 5));
        jLabel23.setText("By... Devas & Kanche");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, -1, -1));

        jLabel24.setBackground(new java.awt.Color(250, 13, 31));
        jLabel24.setForeground(new java.awt.Color(243, 249, 5));
        jLabel24.setText("By... Devas & Kanche");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("By... Devas & Kanche");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Fondo.jpg"))); // NOI18N
        jLabel8.setText("jLabel1");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void menuDepositarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDepositarVehiculoActionPerformed
        new MenuDepositarVehiculo().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuDepositarVehiculoActionPerformed

    private void botonRetirarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetirarVehiculoActionPerformed
        new MenuRetirarVehículo().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonRetirarVehiculoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void botonMenuDepositarAbonadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuDepositarAbonadosActionPerformed
        // DepositarAbonado
        new MenuDepositarAbonado().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_botonMenuDepositarAbonadosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Retirar Abonado
         new MenuRetirarAbonado().setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton botonMenuDepositarAbonados;
    private javax.swing.JButton botonRetirarVehiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton menuDepositarVehiculo;
    private javax.swing.JPanel panel;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
