package rentautos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import org.joda.time.DateTime;
import org.joda.time.Days;

public class JdReserva extends javax.swing.JDialog {
    
    String url = "jdbc:odbc:RentAutos";
    
    public JdReserva(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.btnGuardarCambios.setVisible(false);
        this.lblNombre.setVisible(false);
        this.lblApellido.setVisible(false);
        this.lblDireccion.setVisible(false);
        this.lblTelefono.setVisible(false);
        this.lblNumero.setVisible(false);
        this.lblCodSeg.setVisible(false);
        this.cbTipoTarjeta.setVisible(false);
        this.txtNombre.setVisible(false);
        this.txtApellido.setVisible(false);
        this.txtDireccion.setVisible(false);
        this.txtTelefono.setVisible(false);
        this.txtNumero.setVisible(false);
        this.txtCodSeg.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        bthSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btRegistrarCliente = new javax.swing.JButton();
        btnBuscarReserva = new javax.swing.JButton();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        cbTipoTarjeta = new javax.swing.JComboBox();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblCodSeg = new javax.swing.JLabel();
        txtCodSeg = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodReserva = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jdateFechaDevol = new javax.swing.JLabel();
        jdateFechaReco = new com.toedter.calendar.JDateChooser();
        jdateFechaDevo = new com.toedter.calendar.JDateChooser();
        txtPanel = new javax.swing.JPanel();
        cbTipoAuto = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtCostoDia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCantidadDias = new javax.swing.JTextField();
        btnGuardarCambios = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtDisponible = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(0), "Reserva", 2, 1, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(56, 9, 140))); // NOI18N

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

        bthSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        bthSalir.setText("Salir");
        bthSalir.setFocusable(false);
        bthSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bthSalir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        bthSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(bthSalir);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(0), "Cliente", 0, 0, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        btRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nuevo_Cli.png"))); // NOI18N
        btRegistrarCliente.setText("Nuevo");
        btRegistrarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btRegistrarCliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btRegistrarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarClienteActionPerformed(evt);
            }
        });

        btnBuscarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Bus_clie.png"))); // NOI18N
        btnBuscarReserva.setText("Buscar");
        btnBuscarReserva.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnBuscarReserva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarReserva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReservaActionPerformed(evt);
            }
        });

        lblCedula.setText("Cedula");

        lblNombre.setText("Nombre");

        txtNombre.setEnabled(false);
        txtNombre.setInheritsPopupMenu(true);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblApellido.setText("Apellido");

        txtApellido.setEnabled(false);
        txtApellido.setInheritsPopupMenu(true);

        lblDireccion.setText("Direccion");

        txtDireccion.setEnabled(false);
        txtDireccion.setInheritsPopupMenu(true);

        lblTelefono.setText("Telefono");

        txtTelefono.setEnabled(false);
        txtTelefono.setInheritsPopupMenu(true);

        cbTipoTarjeta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de Tarjeta", "Visa", "MasterCard", "American Expres", "Dinners" }));
        cbTipoTarjeta.setInheritsPopupMenu(true);

        lblNumero.setText("Numero");

        txtNumero.setEnabled(false);
        txtNumero.setInheritsPopupMenu(true);

        lblCodSeg.setText("Codigo Seguridad");

        txtCodSeg.setEnabled(false);
        txtCodSeg.setInheritsPopupMenu(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblApellido)
                            .addComponent(lblCedula)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(lblTelefono))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lblNumero))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido)
                            .addComponent(txtCedula))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(txtDireccion)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(txtTelefono))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodSeg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 131, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(cbTipoTarjeta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCedula)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumero)
                            .addComponent(lblCodSeg)
                            .addComponent(txtCodSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        jLabel1.setText("Codigo");

        txtCodReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodReservaActionPerformed(evt);
            }
        });

        jLabel11.setText("Fecha Recolecion");

        jdateFechaDevol.setText("Fecha Devolucion");

        jdateFechaReco.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdateFechaRecoPropertyChange(evt);
            }
        });

        jdateFechaDevo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdateFechaDevoPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdateFechaReco, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdateFechaDevol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdateFechaDevo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdateFechaDevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdateFechaReco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtCodReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(jdateFechaDevol))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        cbTipoAuto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Tipo de  Auto", "Deportivo", "Camion", "Buseta" }));
        cbTipoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoAutoActionPerformed(evt);
            }
        });

        jLabel9.setText("Costo por Dia");

        txtCostoDia.setEnabled(false);
        txtCostoDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCostoDiaFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Total");

        txtCantidadDias.setEnabled(false);
        txtCantidadDias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantidadDiasFocusLost(evt);
            }
        });

        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        jLabel13.setText("Disponibles");

        txtDisponible.setEnabled(false);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Confirmar");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Cancelar");

        jLabel2.setText("Cantidad de dias");

        txtTotal.setEnabled(false);

        lblPlaca.setText("Placa");

        txtPlaca.setEnabled(false);

        javax.swing.GroupLayout txtPanelLayout = new javax.swing.GroupLayout(txtPanel);
        txtPanel.setLayout(txtPanelLayout);
        txtPanelLayout.setHorizontalGroup(
            txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPanelLayout.createSequentialGroup()
                .addGroup(txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(txtPanelLayout.createSequentialGroup()
                        .addComponent(cbTipoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addGroup(txtPanelLayout.createSequentialGroup()
                        .addGroup(txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPlaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPanelLayout.createSequentialGroup()
                        .addGroup(txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCantidadDias)
                            .addComponent(txtDisponible, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(txtTotal))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCostoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        txtPanelLayout.setVerticalGroup(
            txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPanelLayout.createSequentialGroup()
                .addGroup(txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtPanelLayout.createSequentialGroup()
                        .addGroup(txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCostoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGroup(txtPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnGuardarCambios)
                                .addComponent(jLabel2))
                            .addComponent(txtCantidadDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(txtPanelLayout.createSequentialGroup()
                        .addGroup(txtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTipoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void deshabilitar() {
        this.btnGuardarCambios.setVisible(false);
        this.lblNombre.setVisible(false);
        this.lblApellido.setVisible(false);
        this.lblDireccion.setVisible(false);
        this.lblTelefono.setVisible(false);
        this.lblNumero.setVisible(false);
        this.lblCodSeg.setVisible(false);
        this.cbTipoTarjeta.setVisible(false);
        this.txtNombre.setVisible(false);
        this.txtApellido.setVisible(false);
        this.txtDireccion.setVisible(false);
        this.txtTelefono.setVisible(false);
        this.txtNumero.setVisible(false);
        this.txtCodSeg.setVisible(false);
    }

    public void Limpiar() {
        this.txtCodReserva.setText("");
        this.txtCedula.setText("");
        this.txtPlaca.setText("");
        this.jdateFechaDevo.setCalendar(null);
        this.jdateFechaReco.setCalendar(null);
//            pst.setDate(4, new Date(this.jdateFechaReco.getCalendar().getTime().getTime()));            
//            pst.setDate(5, new Date(this.jdateFechaDevo.getCalendar().getTime().getTime()));
//            pst.setDate(6, new Date(new java.util.Date().getTime()));
        this.buttonGroup1.setSelected(jRadioButton1.getModel(), true);
        //pst.setString(7, ((JRadioButton)this.buttonGroup1.getSelection()).getText());
        this.txtTotal.setText("");
        this.txtCantidadDias.setText("");
        this.cbTipoAuto.setSelectedIndex(0);
    }
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.txtCedula.setEnabled(true);
        this.txtCodReserva.setEnabled(true);
        this.txtCodSeg.setEnabled(true);
        this.txtCostoDia.setEnabled(true);
        this.txtDireccion.setEnabled(true);
        this.txtDisponible.setEnabled(true);
        this.txtNombre.setEnabled(true);
        this.txtNumero.setEnabled(true);
        this.txtTelefono.setEnabled(true);
        this.txtCantidadDias.setEnabled(true);
        this.txtPlaca.setEnabled(true);
        this.txtTotal.setEnabled(true);
        deshabilitar();
        
        
    }//GEN-LAST:event_btnNuevoActionPerformed
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        JdbuscarReserva jdbuscarReserva = new JdbuscarReserva(null, true);
        jdbuscarReserva.setLocationRelativeTo(null);
        jdbuscarReserva.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private void bthSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_bthSalirActionPerformed
    
    private void btRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarClienteActionPerformed
        JdRegCliente jdRegCiente = new JdRegCliente(null, true);
        jdRegCiente.setLocationRelativeTo(null);
        jdRegCiente.setVisible(true);
    }//GEN-LAST:event_btRegistrarClienteActionPerformed
    
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            Connection conect = DriverManager.getConnection(url, "sa", "93102908528");
            
            
            
            PreparedStatement pst = conect.prepareStatement("{call RegistrarReserva (?,?,?,?,?,?,?,?,?,?,?,?)}");
            pst.setInt(1, Integer.parseInt(this.txtCodReserva.getText()));
            pst.setInt(2, Integer.parseInt(this.txtCedula.getText()));
            pst.setString(3, this.txtPlaca.getText());
            pst.setString(4, new Date(this.jdateFechaReco.getCalendar().getTime().getTime()).toString());
            pst.setString(5, new Date(this.jdateFechaDevo.getCalendar().getTime().getTime()).toString());
            pst.setString(6, new Date(new java.util.Date().getTime()).toString());
            pst.setInt(7, Integer.parseInt(this.txtTotal.getText()));
            int con = 1;
            pst.setInt(8, con);
            //pst.setInt(8, Integer.((JRadioButton) this.buttonGroup1.getSelection()).getText());
            pst.setInt(9, Integer.parseInt(this.txtCantidadDias.getText()));
            pst.setString(10, this.cbTipoAuto.getSelectedItem().toString());
            pst.setInt(11, Integer.parseInt(this.txtDisponible.getText()));
            pst.setInt(12, Integer.parseInt(this.txtCostoDia.getText()));
            
            ResultSet rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {
                resultado = rs.getString(1);
            }
            JOptionPane.showMessageDialog(null, resultado);
            conect.close();
            Limpiar();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo conectar" + e);
        }
        Limpiar();
        deshabilitar();
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    private void btnBuscarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReservaActionPerformed
        JdBuscarRegCEC jdBuscarRegCEC = new JdBuscarRegCEC(null, true);
        jdBuscarRegCEC.setLocationRelativeTo(null);
        jdBuscarRegCEC.setVisible(true);
    }//GEN-LAST:event_btnBuscarReservaActionPerformed
    
    private void cbTipoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoAutoActionPerformed
    
    private void txtCostoDiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCostoDiaFocusLost
        if (!this.txtCantidadDias.getText().equals("") && !this.txtCostoDia.getText().equals("")) {
            int cant = 0, cost = 0, tot = 0;
            cant = Integer.parseInt(this.txtCantidadDias.getText());
            cost = Integer.parseInt(this.txtCostoDia.getText());
            tot = cant * cost;
            this.txtTotal.setText("" + tot);
            
        }
    }//GEN-LAST:event_txtCostoDiaFocusLost
    
    private void txtCantidadDiasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadDiasFocusLost
        if (!this.txtCantidadDias.getText().equals("") && !this.txtCostoDia.getText().equals("")) {
            int cant = 0, cost = 0, tot = 0;
            cant = Integer.parseInt(this.txtCantidadDias.getText());
            cost = Integer.parseInt(this.txtCostoDia.getText());
            tot = cant * cost;
            this.txtTotal.setText("" + tot);
        }
    }//GEN-LAST:event_txtCantidadDiasFocusLost
    
    private void txtCodReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodReservaActionPerformed
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.txtCedula.setEnabled(true);
        this.txtCodReserva.setEnabled(true);
        this.txtCodSeg.setEnabled(true);
        this.txtCostoDia.setEnabled(true);
        this.txtDireccion.setEnabled(true);
        this.txtDisponible.setEnabled(true);
        this.txtNombre.setEnabled(true);
        this.txtNumero.setEnabled(true);
        this.txtApellido.setEnabled(true);
        this.txtTelefono.setEnabled(true);
        this.txtCantidadDias.setEnabled(true);
        this.txtPlaca.setEnabled(true);
        this.txtTotal.setEnabled(true);
        this.btnGuardarCambios.setVisible(true);
        
    }//GEN-LAST:event_btnModificarActionPerformed
    
    private void jdateFechaRecoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdateFechaRecoPropertyChange
        
        if ("date".equals(evt.getPropertyName())) {
            if (jdateFechaDevo.getCalendar() != null) {
                if (jdateFechaDevo.getCalendar().getTime().after((java.util.Date) evt.getNewValue())) {
                    java.util.Date fechaIni = (java.util.Date) evt.getNewValue();
                    
                    txtCantidadDias.setText("" + getDaysBetween(fechaIni, jdateFechaDevo.getCalendar().getTime()));
                }
            }
        }
    }//GEN-LAST:event_jdateFechaRecoPropertyChange
    
    private void jdateFechaDevoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdateFechaDevoPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            if (jdateFechaReco.getCalendar() != null) {
                if (((java.util.Date) evt.getNewValue()).after(jdateFechaReco.getCalendar().getTime())) {
                    java.util.Date fechaFin = (java.util.Date) evt.getNewValue();
                    
                    txtCantidadDias.setText("" + getDaysBetween(jdateFechaReco.getCalendar().getTime(), fechaFin));
                }
            }
        }
    }//GEN-LAST:event_jdateFechaDevoPropertyChange
    
    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        this.btnGuardarCambios.setVisible(false);
        int con = 1;
        try {
            Connection conect = DriverManager.getConnection(url, "sa", "93102908528");
            PreparedStatement pst = conect.prepareStatement("{call ModificarReserva (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            pst.setInt(1, Integer.parseInt(this.txtCodReserva.getText()));
            pst.setInt(2, Integer.parseInt(this.txtCedula.getText()));
            pst.setString(3, this.txtPlaca.getText());
            pst.setString(4, new Date(this.jdateFechaReco.getCalendar().getTime().getTime()).toString());
            pst.setString(5, new Date(this.jdateFechaDevo.getCalendar().getTime().getTime()).toString());
            pst.setString(6, new Date(new java.util.Date().getTime()).toString());
            pst.setFloat(7, Float.parseFloat(this.txtTotal.getText()));            
            pst.setInt(8, con);
            //pst.setInt(8, Integer.((JRadioButton) this.buttonGroup1.getSelection()).getText());
            pst.setString(9, this.cbTipoAuto.getSelectedItem().toString());
            pst.setInt(10, Integer.parseInt(this.txtCantidadDias.getText()));            
            pst.setInt(11, Integer.parseInt(this.txtDisponible.getText()));
            pst.setInt(12, Integer.parseInt(this.txtCostoDia.getText()));
            pst.setString(13, this.txtNombre.getText());
            pst.setString(14, this.txtApellido.getText());
            pst.setString(15, this.txtDireccion.getText());
            pst.setInt(16, Integer.parseInt(this.txtTelefono.getText()));
            pst.setString(17, this.cbTipoTarjeta.getSelectedItem().toString());
            pst.setInt(18, Integer.parseInt(this.txtNumero.getText()));
            pst.setInt(19, Integer.parseInt(this.txtCodSeg.getText()));
            
            ResultSet rs = pst.executeQuery();
            String resultado = "";
            while (rs.next()) {
                resultado = rs.getString(1);
            }
            JOptionPane.showMessageDialog(null, resultado);
            conect.close();
            Limpiar();
            
                       
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo conectar" + e);
        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed
    
    private int getDaysBetween(java.util.Date fechaInicio, java.util.Date fechaFin) {
        return Days.daysBetween(new DateTime(fechaInicio), new DateTime(fechaFin)).getDays() + 1;
    }
    
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(JdReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JdReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JdReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JdReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JdReserva dialog = new JdReserva(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btRegistrarCliente;
    private javax.swing.JButton bthSalir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarReserva;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JComboBox cbTipoAuto;
    public static javax.swing.JComboBox cbTipoTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JToolBar jToolBar1;
    public static com.toedter.calendar.JDateChooser jdateFechaDevo;
    private javax.swing.JLabel jdateFechaDevol;
    public static com.toedter.calendar.JDateChooser jdateFechaReco;
    public static javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    public static javax.swing.JLabel lblCodSeg;
    public static javax.swing.JLabel lblDireccion;
    public static javax.swing.JLabel lblNombre;
    public static javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPlaca;
    public static javax.swing.JLabel lblTelefono;
    public static javax.swing.JTextField txtApellido;
    public static javax.swing.JTextField txtCantidadDias;
    public static javax.swing.JTextField txtCedula;
    public static javax.swing.JTextField txtCodReserva;
    public static javax.swing.JTextField txtCodSeg;
    public static javax.swing.JTextField txtCostoDia;
    public static javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtDisponible;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtNumero;
    private javax.swing.JPanel txtPanel;
    public static javax.swing.JTextField txtPlaca;
    public static javax.swing.JTextField txtTelefono;
    public static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
