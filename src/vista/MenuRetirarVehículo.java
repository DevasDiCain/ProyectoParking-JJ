/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import funcionalidad.CalcularPrecio;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.EnviarDatos;
import modelo.PlazaVO;
import modelo.TicketVO;
import modelo.VehiculoVO;

/**
 *
 * @author José
 */
public class MenuRetirarVehículo extends javax.swing.JFrame implements FocusListener {

    private double precio;

    /**
     * Creates new form MenuRetirarVehículo
     */
    public MenuRetirarVehículo() {
        initComponents();
        this.setSize(556, 418);
        // Al estar el textField de la matrícula en foco, se borrará el texto interior
        // Si sale el foco y no hay nada escrito, se volverá a escribir el texto por defecto
        introducirMatriculaTextField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                introducirMatriculaTextField.setText("");

            }

            public void focusLost(FocusEvent e) {
                if (introducirMatriculaTextField.getText().equalsIgnoreCase("")) {
                    introducirMatriculaTextField.setText("Introduzca Su Matrícula");
                }
            }
        });
        // Al estar el textField de la matrícula en foco, se borrará el texto interior
        // Si sale el foco y no hay nada escrito, se volverá a escribir el texto por defecto
        introducirIdentificadorTextField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                introducirIdentificadorTextField.setText("");

            }

            public void focusLost(FocusEvent e) {
                if (introducirIdentificadorTextField.getText().equalsIgnoreCase("")) {
                    introducirIdentificadorTextField.setText("Introduzca Su Identificación");
                }
            }
        });
        // Al estar el textField de la matrícula en foco, se borrará el texto interior
        // Si sale el foco y no hay nada escrito, se volverá a escribir el texto por defecto
        introducirPinTextField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                introducirPinTextField.setText("");

            }

            public void focusLost(FocusEvent e) {
                if (introducirPinTextField.getText().equalsIgnoreCase("")) {
                    introducirPinTextField.setText("Introduzca Su Pin Asociado");
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

        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        introducirMatriculaTextField = new javax.swing.JTextField();
        introducirIdentificadorTextField = new javax.swing.JTextField();
        introducirPinTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        retirar = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        CalcularTotalPagar = new javax.swing.JButton();
        precioJLabel = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Introduzca el Identificador de su Plaza:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText(" Introduzca Su Pin Asociado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Total a Pagar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        introducirMatriculaTextField.setText("Introduzca Su Matrícula");
        introducirMatriculaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introducirMatriculaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(introducirMatriculaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 250, -1));

        introducirIdentificadorTextField.setText("Introduzca Su Identificador");
        getContentPane().add(introducirIdentificadorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 180, 20));

        introducirPinTextField.setText("Introduzca Su Pin Asociado");
        introducirPinTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introducirPinTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(introducirPinTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 220, -1));

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

        jLabel24.setForeground(new java.awt.Color(255, 255, 0));
        jLabel24.setText("By.....Devas & Kanche");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        CalcularTotalPagar.setText("Calcular");
        CalcularTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularTotalPagarActionPerformed(evt);
            }
        });
        getContentPane().add(CalcularTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        precioJLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        precioJLabel.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(precioJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Fondo.jpg"))); // NOI18N
        jLabel29.setText("jLabel1");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void introducirMatriculaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introducirMatriculaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_introducirMatriculaTextFieldActionPerformed

    private void introducirPinTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introducirPinTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_introducirPinTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ZonaClientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarActionPerformed
        //retirar
         String matricula = introducirMatriculaTextField.getText();
        String identificador = introducirIdentificadorTextField.getText();
        String pin = introducirPinTextField.getText();
        VehiculoVO x = new VehiculoVO();
        TicketVO r = new TicketVO();
        x.setCodPlaza(Integer.parseInt(introducirIdentificadorTextField.getText()));
        x.setMatricula(introducirMatriculaTextField.getText());
        x = EnviarDatos.obtenerVehiculoSegunPk(introducirMatriculaTextField.getText());
        r = EnviarDatos.obtenerTicketSegunMatricula(x.getMatricula());
        r.setHoraSalida(LocalTime.now());
        r.setImporte(CalcularPrecio.calcularPrecioTicket(matricula, identificador, pin));
        EnviarDatos.sacarVehiculoPlaza(x.getCodPlaza(), x);
       int ticket = EnviarDatos.obtenerTicketSegunMatricula(matricula).getCodTicket();
        EnviarDatos.cambiarTicket(ticket, r);
        
        JOptionPane.showMessageDialog(null, "Vehículo con matricula " + x.getMatricula() + " retirado con éxito");
        this.setVisible(false);
        new ZonaClientes().setVisible(true);
    }//GEN-LAST:event_retirarActionPerformed

    private void CalcularTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularTotalPagarActionPerformed
        String matricula = introducirMatriculaTextField.getText();
        String identificador = introducirIdentificadorTextField.getText();
        String pin = introducirPinTextField.getText();
       jLabel5.setText(String.valueOf(CalcularPrecio.calcularPrecioTicket(matricula, identificador, pin)));
    }//GEN-LAST:event_CalcularTotalPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularTotalPagar;
    private javax.swing.JTextField introducirIdentificadorTextField;
    private javax.swing.JTextField introducirMatriculaTextField;
    private javax.swing.JTextField introducirPinTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel precioJLabel;
    private javax.swing.JButton retirar;
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
