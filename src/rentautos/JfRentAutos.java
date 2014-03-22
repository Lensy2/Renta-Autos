package rentautos;

import java.util.Locale;

public class JfRentAutos extends javax.swing.JFrame {
    public JfRentAutos() {
        initComponents();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height; 
        this.setSize(ancho,alto);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmRegEmpleado = new javax.swing.JMenuItem();
        Clientes = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        JmAuto = new javax.swing.JMenuItem();
        JmTipoAuto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RentAutos.jpg"))); // NOI18N

        jMenu1.setText("Registro");

        jmRegEmpleado.setText("Empleados");
        jmRegEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegEmpleadoActionPerformed(evt);
            }
        });
        jMenu1.add(jmRegEmpleado);

        Clientes.setText("Clientes");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        jMenu1.add(Clientes);

        jMenuItem1.setText("Conductor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        JmAuto.setText("Auto");
        JmAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmAutoActionPerformed(evt);
            }
        });
        jMenu1.add(JmAuto);

        JmTipoAuto.setText("Tipo de Auto");
        JmTipoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmTipoAutoActionPerformed(evt);
            }
        });
        jMenu1.add(JmTipoAuto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reserva");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Renta");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu5.setText("Devolucion");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu4.setText("Salir");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
      this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jmRegEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegEmpleadoActionPerformed
    JdRegEmpleados jdRegEmpleados=new JdRegEmpleados(null,true);
    jdRegEmpleados.setLocationRelativeTo(null);
    jdRegEmpleados.setVisible(true);
    }//GEN-LAST:event_jmRegEmpleadoActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
     JdRegCliente jdRegCliente = new JdRegCliente(null,true);
     jdRegCliente.setLocationRelativeTo(null);
     jdRegCliente.setVisible(true);
            
    }//GEN-LAST:event_ClientesActionPerformed

    private void JmTipoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmTipoAutoActionPerformed
     JdtipoAuto jdTipoAuto = new JdtipoAuto(null, true);
     jdTipoAuto.setLocationRelativeTo(null);
     jdTipoAuto.setVisible(true);
    }//GEN-LAST:event_JmTipoAutoActionPerformed

    private void JmAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmAutoActionPerformed
     JdRegAuto jdRegAuto=new JdRegAuto(null,true);
     jdRegAuto.setLocationRelativeTo(null);
     jdRegAuto.setVisible(true);
    }//GEN-LAST:event_JmAutoActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    JdReserva jdReserva =new JdReserva(null, true);
    jdReserva.setLocationRelativeTo(null);
    jdReserva.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    JdRegCond jdRegCond=new JdRegCond(null, true);
    jdRegCond.setLocationRelativeTo(null);
    jdRegCond.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
    JdAlquiler jdAlquiler = new JdAlquiler(null,true);
    jdAlquiler.setLocationRelativeTo(null);
    jdAlquiler.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
    
    }//GEN-LAST:event_jMenu5MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfRentAutos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Clientes;
    private javax.swing.JMenuItem JmAuto;
    private javax.swing.JMenuItem JmTipoAuto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmRegEmpleado;
    // End of variables declaration//GEN-END:variables
}
