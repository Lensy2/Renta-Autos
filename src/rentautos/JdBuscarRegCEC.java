package rentautos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.misc.Cleaner;

public class JdBuscarRegCEC extends javax.swing.JDialog {
  String url="jdbc:odbc:RentAutos";
  DefaultTableModel dfm=new DefaultTableModel();
    public JdBuscarRegCEC(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
       
        initComponents();
        
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbBusCed = new javax.swing.JRadioButton();
        rbBusNom = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBuscar = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnMosTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Buscar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(51, 0, 153))); // NOI18N

        buttonGroup1.add(rbBusCed);
        rbBusCed.setText("Cedula");
        rbBusCed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbBusCedMouseClicked(evt);
            }
        });
        rbBusCed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBusCedActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbBusNom);
        rbBusNom.setText("Nombre");
        rbBusNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbBusNomMouseClicked(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jtBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBuscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtBuscar);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jButton3.setText("Nueva Busqueda");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnMosTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostrar todos (2).png"))); // NOI18N
        btnMosTodos.setText("Mostrar todos");
        btnMosTodos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnMosTodos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMosTodos.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnMosTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMosTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbBusCed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbBusNom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMosTodos)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(rbBusCed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbBusNom))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMosTodos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void Limpiar(){
         
         this.txtBuscar.setText("");
         this.txtBuscar.requestFocus();
         this.dfm.setNumRows(0);
     }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void rbBusCedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBusCedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBusCedActionPerformed

    private void rbBusCedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbBusCedMouseClicked
        this.txtBuscar.setEnabled(true);
        this.txtBuscar.setText("");
        this.txtBuscar.requestFocus();
        
        
    }//GEN-LAST:event_rbBusCedMouseClicked

    private void rbBusNomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbBusNomMouseClicked
        this.txtBuscar.setEnabled(true);
        this.txtBuscar.setText("");
        this.txtBuscar.requestFocus();

    }//GEN-LAST:event_rbBusNomMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String bus;
        if(this.rbBusCed.isSelected()){
        bus=this.txtBuscar.getText();
        String v[]={"Cliente","Nombre","Apellido","Dirección","oTeléfon","Tipo Tarjeta","Numero Tarjeta","Codigo Tarjeta"};
        //DefaultTableModel dfm=new DefaultTableModel(null, v);
        dfm=null;
        dfm=new DefaultTableModel(null, v);
        try {
            Connection con=DriverManager.getConnection(url,"sa","colombia");
            PreparedStatement pst=con.prepareStatement("BuscarCliente '" + bus +"'," +null);
            ResultSet rs=pst.executeQuery();
            while (rs.next()){
                v[0]=rs.getString(1);
                v[1]=rs.getString(2);
                v[2]=rs.getString(3);
                v[3]=rs.getString(4);
                v[4]=rs.getString(5);
                v[5]=rs.getString(6);
                v[6]=rs.getString(7);
                v[7]=rs.getString(8);
                dfm.addRow(v);
            }
            this.jtBuscar.setModel(dfm);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error en la conexion"+e); 
        }
        }else{
          bus=this.txtBuscar.getText(); 
          String v[]={"Cliente","Nombre","Apellido","Dirección","oTeléfon","Tipo Tarjeta","Numero Tarjeta","Codigo Tarjeta"};
            //DefaultTableModel dfm=new DefaultTableModel(null, v);
          dfm=null;
          dfm=new DefaultTableModel(null, v);
        try {
            Connection con=DriverManager.getConnection(url,"sa","colombia");
            PreparedStatement pst=con.prepareStatement("BuscarCliente "+null+",'" + bus +"'");
            ResultSet rs=pst.executeQuery();
            while (rs.next()){
                v[0]=rs.getString(1);
                v[1]=rs.getString(2);
                v[2]=rs.getString(3);
                v[3]=rs.getString(4);
                v[4]=rs.getString(5);
                v[5]=rs.getString(6);
                v[6]=rs.getString(7);
                v[7]=rs.getString(8);
               
                dfm.addRow(v);
            }
            this.jtBuscar.setModel(dfm);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error en la conexion"+e); 
        }
          
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMosTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMosTodosActionPerformed
        String v[]={"Cliente","Nombre","Apellido","Dirección","oTeléfon","Tipo Tarjeta","Numero Tarjeta","Codigo Tarjeta"};
        DefaultTableModel dfm=new DefaultTableModel(null, v);
        try {
            Connection con=DriverManager.getConnection(url,"sa","z");
            PreparedStatement pst=con.prepareStatement("MostrarTodosClientes");
            ResultSet rs=pst.executeQuery();
            while (rs.next()){
                v[0]=rs.getString(1);
                v[1]=rs.getString(2);
                v[2]=rs.getString(3);
                v[3]=rs.getString(4);
                v[4]=rs.getString(5);
                v[5]=rs.getString(6);
                v[6]=rs.getString(7);
                v[7]=rs.getString(8);
               
                dfm.addRow(v);
            }
            this.jtBuscar.setModel(dfm);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error en la conexion"+e); 
        }
        
    }//GEN-LAST:event_btnMosTodosActionPerformed

    private void jtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBuscarMouseClicked
        int row=this.jtBuscar.getSelectedRow();
        if (row >= 0) {

            JdRegCliente.txtCedCliente.setText(this.jtBuscar.getValueAt(row, 0).toString());
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null,"Seleccione Regristro" );
        }
    }//GEN-LAST:event_jtBuscarMouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       int v;
       v=this.jtBuscar.getSelectedRow();
       if (v>=0){
           JdRegCliente.txtCedCliente.setText(this.jtBuscar.getValueAt(v, 0).toString());
           
       }
      
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(JdBuscarRegCEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JdBuscarRegCEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JdBuscarRegCEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JdBuscarRegCEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JdBuscarRegCEC dialog = new JdBuscarRegCEC(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMosTodos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtBuscar;
    private javax.swing.JRadioButton rbBusCed;
    private javax.swing.JRadioButton rbBusNom;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
