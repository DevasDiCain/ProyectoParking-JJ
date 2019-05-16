/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import static vista.ZonaClientes.plazas;

/**
 *
 * @author José
 */
public class ZonaAdministrador extends javax.swing.JFrame {

       public static  graficoPlazas plazas;
       private int contador;
       
    public ZonaAdministrador() {
        initComponents();
         this.setSize(578, 462);
        jPanel1.setLayout(new GridLayout(8, 8));
        plazas = new graficoPlazas(7);

        for (int i = 0; i < plazas.getMatriz().length; i++) {
            for (int j = 0; j < plazas.getMatriz().length; j++) {
                contador++;
                if (contador < 15) {
                    botonPlaza tmp = new botonPlaza(1);
              
                    tmp.setToolTipText(Integer.toString(i) + "," + Integer.toString(j));
                    plazas.ponerPlaza(i, j, tmp);
                    jPanel1.add(plazas.getPlaza(i, j));

                }
                if (contador > 15 && contador < 30) {
                    botonPlaza tmp = new botonPlaza(2);
                    tmp.setToolTipText(Integer.toString(i) + "," + Integer.toString(j));
                    plazas.ponerPlaza(i, j, tmp);
                    jPanel1.add(plazas.getPlaza(i, j));

                }
                if (contador > 30 && contador < 51) {
                    botonPlaza tmp = new botonPlaza(3);
                    tmp.setToolTipText(Integer.toString(i) + "," + Integer.toString(j));
                    plazas.ponerPlaza(i, j, tmp);
                    jPanel1.add(plazas.getPlaza(i, j));
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel24.setText("jLabel1");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel25.setText("jLabel1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 1, 1));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(254, 6, 6)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 340));

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Información de las Plazas");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(228, 18, 18)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 5, 11));
        jLabel3.setText("Administración");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("Copia de seguridad");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 120, 60));

        jButton2.setText("Facturación");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 120, 60));

        jButton3.setText("Control Plazas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 120, 60));

        jButton4.setText("Abonos ");
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 120, 60));

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("By... Devas & Kanche");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel10.setText("jLabel1");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 160, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel11.setText("jLabel1");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 160, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel12.setText("jLabel1");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel13.setText("jLabel1");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 160, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel14.setText("jLabel1");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 160, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel18.setText("jLabel1");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 160, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel19.setText("jLabel1");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 160, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel20.setText("jLabel1");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 160, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel21.setText("jLabel1");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 160, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel23.setText("jLabel1");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 160, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel26.setText("jLabel1");
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 160, -1));

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        jButton6.setText("Atrás");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel6.setText("jLabel5");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel7.setText("jLabel5");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel8.setText("jLabel5");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // ControlPlazas:
        new MenuControlPlazas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Salir:
        System.exit(1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Atras
        new Menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
