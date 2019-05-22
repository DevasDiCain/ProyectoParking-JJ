/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author jose
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setSize(814, 554);
    }

    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);

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

        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        botonZonaAdmin = new javax.swing.JButton();
        botonZonaCliente = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel28.setText("jLabel1");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpeg"))); // NOI18N
        jLabel29.setText("jLabel1");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonZonaAdmin.setOpaque(false);
        botonZonaAdmin.setContentAreaFilled(false);
        botonZonaAdmin.setBorderPainted(false);
        botonZonaAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/zonaAdmin.png"))); // NOI18N
        botonZonaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonZonaAdminActionPerformed(evt);
            }
        });
        getContentPane().add(botonZonaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 200, 280));

        botonZonaCliente.setOpaque(false);
        botonZonaCliente.setContentAreaFilled(false);
        botonZonaCliente.setBorderPainted(false);
        botonZonaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/zonaClientes.png"))); // NOI18N
        botonZonaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonZonaClienteActionPerformed(evt);
            }
        });
        getContentPane().add(botonZonaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 200, 270));

        jLabel22.setBackground(new java.awt.Color(250, 13, 31));
        jLabel22.setForeground(new java.awt.Color(0, 102, 102));
        jLabel22.setText("By... Devas & Kanche");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Parking icono.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Aparka.png"))); // NOI18N
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonZonaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonZonaAdminActionPerformed
        // Zona Administrador
        new ZonaAdministrador().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonZonaAdminActionPerformed

    private void botonZonaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonZonaClienteActionPerformed
       //Zona Clientes
        new ZonaClientes().setVisible(true);
       
       this.setVisible(false);
      
    }//GEN-LAST:event_botonZonaClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonZonaAdmin;
    private javax.swing.JButton botonZonaCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel44;
    // End of variables declaration//GEN-END:variables
}
