
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author marie
 */
public class frmEjemplo extends javax.swing.JInternalFrame{

    
    // variables globales
    
    Calendar fecha = new GregorianCalendar();
    DefaultTableModel modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable (int row, int column)
        {
            return false;
        }
    };    
        
    public frmEjemplo() {
        initComponents();
        
        // agregar feecha por defecto
        jdcFechaN.setDate(fecha.getTime());
        
        tblDatos.setModel(modelo);
        modelo.addColumn("Identificacion");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha Nacimiento");
        
        Object[] fila = new Object[3];
        fila[0] = "1";
        fila[1] = "Mateo";
        fila[2] = "12/04/2000";
        modelo.addRow(fila);
        
        fila[0] = "2";
        fila[1] = "Emmanuel";
        fila[2] = "10/10/2017";
        modelo.addRow(fila);
        
        this.closable = true;  
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jdcFechaN = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        cboPersonas = new javax.swing.JComboBox<>();
        btnCargar = new javax.swing.JButton();
        txtDatos = new javax.swing.JTextField();

        jLabel1.setText("Identidicación");
        jLabel1.setToolTipText("");

        jLabel2.setText("Nombre");

        jLabel3.setText("Fecha Nacimiento");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        cboPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPersonasActionPerformed(evt);
            }
        });

        btnCargar.setText("Cargar Combo");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabel2)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jdcFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCargar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatos))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnAgregar))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(cboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(txtDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        CargarDatos();
        txtId.setText(null);
        txtNombre.setText(null);
        jdcFechaN.setDate(fecha.getTime());
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        //no existe un evento doble click pero sepuede simular
        if(evt.getClickCount() == 2){
            int fila = tblDatos.rowAtPoint(evt.getPoint()); //obtiene a cual fila se le dio click
            // si se desea ek valor de posicion se hace un getValue()

            //obtener id de esa fila (primera columna)
            txtId.setText(tblDatos.getValueAt(fila,0).toString());

            //Obtener el nombre de esa fila (segunda columna
            txtNombre.setText(tblDatos.getValueAt(fila,1).toString());

            /*Para obtener la fecha lo que se recibe es un tipi de dato date debemos obtener el valor de la tabla
            que es un string y convertirlo a una variable de tipo date para poder asignarlo al control
            de fecha*/
            String fechaTexto = tblDatos.getValueAt(fila, 2).toString();

            /*se debe controlar la expecion por si el usuario digita una fecha que no es valida*/
            try{
                Date fechaDate = formato.parse(fechaTexto);
                jdcFechaN.setDate(fechaDate);
            }
            catch(ParseException ex){
                // se unsa parse exeption porque es un valor de convercion
                JOptionPane.showMessageDialog(this,"Error al recuperar la fecha: " + ex.getMessage());

            }
        }
          
    }//GEN-LAST:event_tblDatosMouseClicked

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
       
       DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
       cboPersonas.setModel(modeloCombo);
       
       // Recorrer la tabla;
        for (int i = 0; i < tblDatos.getRowCount(); i++) {
            modeloCombo.addElement(new Persona(Integer.parseInt(tblDatos.getValueAt(i,0).toString()
            ), tblDatos.getValueAt(i, 1).toString()));
            
        } // fin del for
        
        cboPersonas.setSelectedIndex(-1); // para que aparezca el combo vacio
        
    }//GEN-LAST:event_btnCargarActionPerformed

    private void cboPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPersonasActionPerformed
        // SI HAY AGO SELECCIONADO EN EL COMBO
        if(cboPersonas.getSelectedIndex() != -1){
            // EN CADA ELEMENTO DEL COMBO HAY UN OBBJETO TIPO PERSONA
            // TOMAMOS EL OBJETO Y LO CONVERTIMOS EN UN OBJETO TIPO pERSONA
            Persona p1 = (Persona) cboPersonas.getSelectedItem();

            txtNombre.setText(p1.getId() + ". " + p1.getNombre());
        }
        else{
            txtNombre.setText(null);
        }
        
        
        
    }//GEN-LAST:event_cboPersonasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // 1. crear la instancia del formulario de busqueda
        dlgBuscar buscar = new dlgBuscar(null, true);
       /*
        el primer parametro es el propietario, como es internal no puede ser propietario de nadie
        el segundo parametro es si es un formulario modal, es este caso si lo es
        */
       
       //2. sobreescribir el metodo de cerrar
        /*
        es similar a cuando en javascript se creaba un add event listener,
        que estaba atento esperando un evento.
        */
        buscar.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosed(WindowEvent e){
                /*
                recuperar cual fue la fila seleccionada, el cual recupera
                el dato que estaba en el cuadro de texto.
                */
                int fila = buscar.ObtenerId();
                
                // el dato de la fila seleccionada, primera columna (0)   
                txtId.setText(tblDatos.getValueAt(fila, 0).toString());
                // el dato de la fila seleccionada, segunda columna (1)  
                txtNombre.setText(tblDatos.getValueAt(fila, 1).toString()); 
                /*
                la fecha la asignamos al calendario
                (copiamos del metodo tblDatomouseclicked)
                */
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                // el dato de la fila seleccionada,tercera columna
                String fechaTexto = tblDatos.getValueAt(fila, 2).toString();
                try {
                    Date fechaDate = formato.parse(fechaTexto);
                    jdcFechaN.setDate(fechaDate);
                } catch (ParseException ex) {
                    //sabemos que es un error de conversion, por eso no usamos el generico exeption, sino perse exeption
                    JOptionPane.showMessageDialog(null, "Error al recuperar la fecha:" + ex.getMessage());
                    // en lugar de this (el cuadro de dialogo), le asignamos null
                }                
            }      
        });
        //3. mostrar el formulario
        buscar.setVisible(true);//mostrarmos el modal
    }//GEN-LAST:event_btnBuscarActionPerformed

    
    
    
    // 
    
    
    // mostrar el formulario 
    
    
    public void CargarDatos()
    {
        Object [] fila = new Object [3];
                
        // Verificar que los campos tengan informacion
        if(!txtId.getText().equals("") && !txtNombre.getText().equals("")){
            fila[0] = txtId.getText();
            fila[1] = txtNombre.getText();
            fila[2] = new SimpleDateFormat("dd/MM/yyyy").format(jdcFechaN.getDate());
            
            modelo.addRow(fila);
        }
        else {
            JOptionPane.showMessageDialog(this, "Faltan Datos");
        }
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(frmEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEjemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEjemplo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JComboBox<String> cboPersonas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaN;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtDatos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
