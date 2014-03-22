package rentautos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JdRegCliente extends javax.swing.JDialog {
    String url="jdbc:odbc:RentAutos";
    public JdRegCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.btnGuardarCambios.setVisible(false);
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCedCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApeCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelCliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txtDirCliente = new javax.swing.JTextField();
        cbTarjCliente = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtCodSegTarjCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNumTarjCliente = new javax.swing.JTextField();
        btnGuardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Registro Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(56, 9, 140))); // NOI18N

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setRollover(true);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNuevo);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBuscar);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setFocusable(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnModificar);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/elimina.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEliminar);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSalir);

        jLabel1.setText("Cedula");

        txtCedCliente.setEnabled(false);
        txtCedCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedClienteActionPerformed(evt);
            }
        });
        txtCedCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedClienteKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedClienteKeyPressed(evt);
            }
        });

        jLabel2.setText("Nombre");

        txtNomCliente.setEnabled(false);
        txtNomCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomClienteKeyTyped(evt);
            }
        });

        jLabel3.setText("Apellidos");

        txtApeCliente.setEnabled(false);
        txtApeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeClienteKeyTyped(evt);
            }
        });

        jLabel4.setText("Telefono");

        txtTelCliente.setEnabled(false);
        txtTelCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelClienteKeyTyped(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Crear Usuario", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(51, 0, 153))); // NOI18N

        jLabel5.setText("Usuario");

        jLabel6.setText("Contraseña");

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setEnabled(false);

        jTextField7.setEnabled(false);

        jLabel7.setText("Confimar Constraseña");

        jPasswordField2.setText("jPasswordField2");
        jPasswordField2.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPasswordField1)
                        .addComponent(jTextField7))
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel8.setText("Direccion");

        txtDirCliente.setEnabled(false);

        cbTarjCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tarjeta de Credito", "Visa", "Mastercar", "American Express", "Dinners", " " }));
        cbTarjCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTarjClienteActionPerformed(evt);
            }
        });

        jLabel9.setText("Codigo de seguridad");

        txtCodSegTarjCliente.setEnabled(false);
        txtCodSegTarjCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodSegTarjClienteKeyTyped(evt);
            }
        });

        jLabel10.setText("Numero de Tarjeta");

        txtNumTarjCliente.setEnabled(false);
        txtNumTarjCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumTarjClienteKeyTyped(evt);
            }
        });

        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel1)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel3))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNomCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApeCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedCliente)
                                    .addComponent(txtDirCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelCliente))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbTarjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCodSegTarjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnGuardarCambios)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtNumTarjCliente)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCedCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTarjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtNumTarjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCodSegTarjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarCambios)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Limpiar(){
        this.txtCedCliente.setText("");
        this.txtNomCliente.setText("");
        this.txtApeCliente.setText("");
        this.txtDirCliente.setText("");
        this.txtTelCliente.setText("");
        this.cbTarjCliente.setSelectedIndex(0);
        this.txtNumTarjCliente.setText("");
        this.txtCodSegTarjCliente.setText("");
    }
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      Limpiar();
      this.txtCedCliente.setEnabled(true);
      this.txtNomCliente.setEnabled(true);
      this.txtApeCliente.setEnabled(true);
      this.txtDirCliente.setEnabled(true);
      this.txtTelCliente.setEnabled(true);
      this.txtNumTarjCliente.setEnabled(true);
      this.txtCodSegTarjCliente.setEnabled(true);
      this.txtCedCliente.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      this.txtCedCliente.setEnabled(true);
      JdBuscarRegCEC jdBuscarRegCEC = new JdBuscarRegCEC(null,true);
      jdBuscarRegCEC.setLocationRelativeTo(null);
      jdBuscarRegCEC.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    try {
             Connection conect=DriverManager.getConnection(url,"sa","z");
             PreparedStatement pst=conect.prepareStatement("{call RegistrarCliente (?,?,?,?,?,?,?,?)}");
             pst.setInt(1, Integer.parseInt(this.txtCedCliente.getText()));
             pst.setString(2, this.txtNomCliente.getText());
             pst.setString(3, this.txtApeCliente.getText());
             pst.setString(4, this.txtDirCliente.getText());
             pst.setInt(5, Integer.parseInt(this.txtTelCliente.getText()));
             pst.setString(6,this.cbTarjCliente.getSelectedItem().toString());
             pst.setInt(7,Integer.parseInt(this.txtNumTarjCliente.getText()));
             pst.setInt(8,Integer.parseInt(this.txtCodSegTarjCliente.getText()));
             
             
             ResultSet rs=pst.executeQuery();
             String resultado="";
             while(rs.next()){
                 resultado=rs.getString(1);
             }
             JOptionPane.showMessageDialog(null, resultado);
             conect.close();
             Limpiar();
                 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar"+e);
       }
    
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      this.txtCedCliente.setEnabled(false);
      this.txtNomCliente.setEnabled(true);
      this.txtApeCliente.setEnabled(true);
      this.txtDirCliente.setEnabled(true);
      this.txtTelCliente.setEnabled(true);
      this.txtNumTarjCliente.setEnabled(true);
      this.txtCodSegTarjCliente.setEnabled(true);
      this.btnGuardarCambios.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtCedClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedClienteKeyPressed
          
        if (evt.getKeyCode()==10) {
            //JOptionPane.showMessageDialog(null,"hola");
            
            try {
                String dni = this.txtCedCliente.getText();
                Connection con = DriverManager.getConnection(url, "sa", "z");
                PreparedStatement pst = con.prepareStatement("BuscarCliente '" + dni + "'," + null);
                ResultSet rs = pst.executeQuery();
                rs.next();
                this.txtNomCliente.setText(rs.getString(2));
                this.txtApeCliente.setText(rs.getString(3));
                this.txtDirCliente.setText(rs.getString(4));
                //int tarj=rs.getInt(5);
                this.cbTarjCliente.setSelectedItem(rs.getString(5));
                this.txtNumTarjCliente.setText(rs.getString(6));
                this.txtCodSegTarjCliente.setText(rs.getString(7));
                this.txtTelCliente.setText(rs.getString(8));
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en la conexion" + e);
            }
            evt.consume();
        }
    }//GEN-LAST:event_txtCedClienteKeyPressed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
       try {
             Connection conect=DriverManager.getConnection(url,"sa","z");
             PreparedStatement pst=conect.prepareStatement("{call ModificarCliente (?,?,?,?,?,?,?,?)}");
             pst.setInt(1, Integer.parseInt(this.txtCedCliente.getText()));
             pst.setString(2, this.txtNomCliente.getText());
             pst.setString(3, this.txtApeCliente.getText());
             pst.setString(4, this.txtDirCliente.getText());
             pst.setInt(5, Integer.parseInt(this.txtTelCliente.getText()));
             pst.setString(6,this.cbTarjCliente.getSelectedItem().toString());
             pst.setInt(7,Integer.parseInt(this.txtNumTarjCliente.getText()));
             pst.setInt(8,Integer.parseInt(this.txtCodSegTarjCliente.getText()));
             
             
             ResultSet rs=pst.executeQuery();
             String resultado="";
             while(rs.next()){
                 resultado=rs.getString(1);
             }
             JOptionPane.showMessageDialog(null, resultado);
             conect.close();
             Limpiar();   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar"+e);
       }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         try {
             Connection conect=DriverManager.getConnection(url,"sa","z");
             PreparedStatement pst=conect.prepareStatement("{call EliminarCliente  (?)}");
             pst.setInt(1, Integer.parseInt(this.txtCedCliente.getText()));
             
             ResultSet rs=pst.executeQuery();
             String resultado="";
             while(rs.next()){
                 resultado=rs.getString(1);
             }
             JOptionPane.showMessageDialog(null, resultado);
             conect.close();
             Limpiar();    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar"+e);
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCodSegTarjClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodSegTarjClienteKeyTyped
       int num=4;
       if ((this.txtCodSegTarjCliente.getText().length()==num)&&(num<'0'|| num>'9')){
            evt.consume();
        }
       
    }//GEN-LAST:event_txtCodSegTarjClienteKeyTyped

    private void txtCedClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedClienteKeyTyped
        char c=evt.getKeyChar();
        if(c<'0'|| c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtCedClienteKeyTyped

    private void txtNomClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomClienteKeyTyped
         char c=evt.getKeyChar();
        if((c<'a'|| c>'z')&&(c<'A'|| c>'Z')){
            evt.consume();
        }
    }//GEN-LAST:event_txtNomClienteKeyTyped

    private void txtApeClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeClienteKeyTyped
      char c=evt.getKeyChar();
        if((c<'a'|| c>'z')&&(c<'A'|| c>'Z')){
            evt.consume();
        }
    }//GEN-LAST:event_txtApeClienteKeyTyped

    private void txtTelClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelClienteKeyTyped
       char c=evt.getKeyChar();
        if(c<'0'|| c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelClienteKeyTyped

    private void txtNumTarjClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumTarjClienteKeyTyped
       char c=evt.getKeyChar();
        if(c<'0'|| c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtNumTarjClienteKeyTyped

    private void txtCedClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedClienteActionPerformed

    private void cbTarjClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTarjClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTarjClienteActionPerformed

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
            java.util.logging.Logger.getLogger(JdRegCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JdRegCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JdRegCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JdRegCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JdRegCliente dialog = new JdRegCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    public javax.swing.JComboBox cbTarjCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JTextField txtApeCliente;
    public static javax.swing.JTextField txtCedCliente;
    public static javax.swing.JTextField txtCodSegTarjCliente;
    public static javax.swing.JTextField txtDirCliente;
    public static javax.swing.JTextField txtNomCliente;
    public static javax.swing.JTextField txtNumTarjCliente;
    public static javax.swing.JTextField txtTelCliente;
    // End of variables declaration//GEN-END:variables
}
