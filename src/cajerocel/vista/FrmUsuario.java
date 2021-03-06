/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajerocel.vista;

import cajerocel.controlador.Consulta_Cuenta;
import cajerocel.modelo.Cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class FrmUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FrmUsuario
     */
    public FrmUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("USUARIO");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();
        btnRetiro = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(86, 36, 209));
        jLabel2.setText("CAJERO AUTOMATICO");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(60, 20, 267, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Documents\\NetBeansCel\\CajeroCel\\CajeroCel\\src\\PicsATM\\ATM3.jpeg")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 70, 210, 180);

        btnConsulta.setMnemonic('C');
        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsulta);
        btnConsulta.setBounds(250, 100, 100, 23);

        btnRetiro.setMnemonic('R');
        btnRetiro.setText("Retiro");
        btnRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroActionPerformed(evt);
            }
        });
        jPanel2.add(btnRetiro);
        btnRetiro.setBounds(250, 140, 100, 23);

        btnDeposito.setMnemonic('D');
        btnDeposito.setText("Deposito");
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });
        jPanel2.add(btnDeposito);
        btnDeposito.setBounds(250, 180, 100, 23);

        btnSalir.setMnemonic('S');
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir);
        btnSalir.setBounds(252, 220, 100, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed

        JOptionPane.showMessageDialog(rootPane, "SU SALDO ES: " + Consulta_Cuenta.cuenta.getSaldo());
        
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroActionPerformed
        new FrmDinero().setVisible(true);

    }//GEN-LAST:event_btnRetiroActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        new FrmDeposito().setVisible(true);
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
