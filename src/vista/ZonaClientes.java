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
        panel.setLayout(new GridLayout(8, 8));
        plazas = new graficoPlazas(7);

        for (int i = 0; i < plazas.getMatriz().length; i++) {
            for (int j = 0; j < plazas.getMatriz().length; j++) {
                contador++;
                if (contador < 15) {
                    botonPlaza tmp = new botonPlaza(1);
              
                    tmp.setToolTipText(Integer.toString(i) + "," + Integer.toString(j));
                    plazas.ponerPlaza(i, j, tmp);
                    panel.add(plazas.getPlaza(i, j));

                }
                if (contador > 15 && contador < 30) {
                    botonPlaza tmp = new botonPlaza(2);
                    tmp.setToolTipText(Integer.toString(i) + "," + Integer.toString(j));
                    plazas.ponerPlaza(i, j, tmp);
                    panel.add(plazas.getPlaza(i, j));

                }
                if (contador > 30 && contador < 51) {
                    botonPlaza tmp = new botonPlaza(3);
                    tmp.setToolTipText(Integer.toString(i) + "," + Integer.toString(j));
                    plazas.ponerPlaza(i, j, tmp);
                    panel.add(plazas.getPlaza(i, j));
                }
            }
        }

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
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton4.setText("Depositar Abonados");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 120, 60));

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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel10.setText("jLabel1");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 160, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel11.setText("jLabel1");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 160, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel12.setText("jLabel1");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel13.setText("jLabel1");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 160, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel14.setText("jLabel1");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 160, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel15.setText("jLabel1");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 160, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel16.setText("jLabel1");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 160, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel17.setText("jLabel1");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 160, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel20.setText("jLabel1");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 160, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel25.setText("jLabel1");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 160, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel26.setText("jLabel1");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 160, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel6.setText("jLabel5");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel7.setText("jLabel5");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void menuDepositarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDepositarVehiculoActionPerformed
        new MenuDepositarVehiculo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuDepositarVehiculoActionPerformed

    private void botonRetirarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetirarVehiculoActionPerformed
        this.setVisible(false);
        new MenuRetirarVehículo().setVisible(true);
    }//GEN-LAST:event_botonRetirarVehiculoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
            System.exit(1);
    }//GEN-LAST:event_salirActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        new Menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // DepositarAbonado
        new MenuDepositarAbonado().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Retirar Abonado
         new MenuRetirarAbonado().setVisible(true);
         this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton botonRetirarVehiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton menuDepositarVehiculo;
    private javax.swing.JPanel panel;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
