/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author José
 */
public class MenuRetirarVehículo extends javax.swing.JFrame {

    /**
     * Creates new form MenuRetirarVehículo
     */
    public MenuRetirarVehículo() {
        initComponents();
        this.setSize(556, 418);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mostrarPrecio = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        retirar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 5, 11));
        jLabel3.setText("Zona Clientes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("¿Desea Retirar Su Vehículo?");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Introduzca Su Matrícula:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Introduzca La Identificación de su Plaza:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText(" Introduzca Su Pin Asociado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Total a Pagar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        mostrarPrecio.setText("jLabel6");
        getContentPane().add(mostrarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        jTextField1.setText("Introduzca Su Matrícula");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 250, -1));

        jTextField2.setText("Introduzca Su Identificación");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 150, -1));

        jTextField3.setText("Introduzca Su Pin Asociado");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 220, -1));

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        retirar.setText("Retirar");
        retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarActionPerformed(evt);
            }
        });
        getContentPane().add(retirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 320, 80, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 160, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel8.setText("jLabel6");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel9.setText("jLabel6");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 160, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel10.setText("jLabel6");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 160, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel11.setText("jLabel6");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 160, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel12.setText("jLabel6");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 160, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel13.setText("jLabel6");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel14.setText("jLabel6");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel15.setText("jLabel6");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 160, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel16.setText("jLabel6");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 160, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel17.setText("jLabel6");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 160, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel18.setText("jLabel6");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 160, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel19.setText("jLabel6");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 160, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel20.setText("jLabel6");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 160, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel21.setText("jLabel6");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 160, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel22.setText("jLabel6");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 160, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel23.setText("jLabel6");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 160, -1));

        jLabel24.setForeground(new java.awt.Color(255, 255, 0));
        jLabel24.setText("By.....Devas & Kanche");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel25.setText("jLabel25");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 160, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel26.setText("jLabel25");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 160, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel27.setText("jLabel25");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 160, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel28.setText("jLabel25");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new ZonaClientes().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retirarActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel mostrarPrecio;
    private javax.swing.JButton retirar;
    // End of variables declaration//GEN-END:variables
}
