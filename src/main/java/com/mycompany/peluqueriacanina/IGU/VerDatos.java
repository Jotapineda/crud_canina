//Nota, lo normal para respetar el modelo de capz es la interfaz
//gráfica llame a la 
package com.mycompany.peluqueriacanina.IGU;

import com.mycompany.peluqueriacanina.Logica.Controladora;
import com.mycompany.peluqueriacanina.Logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {

    Controladora control = null;

    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("VISUALIZAR DATOS");

        tablaMascotas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaMascotas);

        jLabel2.setText("DATOS DE LA MASCOTA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 47, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnEliminar)
                .addGap(46, 46, 46)
                .addComponent(btnEditar)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//se realiza por medio del navegador de mi proyecto, window,
//window opened
        cargarTabla();

    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        //este metodo de getRowCount lo que hace es contar la cantidad de filas
        //que posee la tabla
        //en el segundo if, colocamos un -1, esto significa que hay registro
        //seleccionado para su pronta eliminacion
        if (tablaMascotas.getRowCount() > 0) {
            if (tablaMascotas.getSelectedRow() != 1) {

                //este codigo dicta que todo lo que se muestra en la tabla 
                //normalnete es un String, hay que pasarlo a Int para poder
                //obtener el Id de la mascota para su eliminación.
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));

                //aqui llamamos al método borrar
                control.borrarMascota(num_cliente);
                
                mostrarMensaje("mascota eliminada correctamente", "Info", "Borrado de mascota");
                cargarTabla();
            }
            else{
                mostrarMensaje("no seleccionaste ninguna mascota", "Error", "Error al eliminar");
            }
        }
        else{
            mostrarMensaje("no hay nada para eliminar", "Error", "Error al eliminar");
        }        
    }//GEN-LAST:event_btnEliminarActionPerformed

    //este es el botón de editar
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       
         if (tablaMascotas.getRowCount() > 0) {
            if (tablaMascotas.getSelectedRow() != 1) {
                
                 int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                 
                ModificarDatos pantallaModif= new ModificarDatos(num_cliente);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                
                 this.dispose();
                }
            else{
                mostrarMensaje("no seleccionaste ninguna mascota", "Error", "Error al eliminar");
            }
        }
        else{
            mostrarMensaje("no hay nada para eliminar", "Error", "Error al eliminar");
        } 
         
        
        
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {

        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {

            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    //aqui vamos a crear la tabla donde se mostrarán los datos
    //de la base de datos en cuestion
    public void cargarTabla() {
        //definir el modelo de la tabla

        DefaultTableModel modeloTabla = new DefaultTableModel() {

            //esto realiza que las filas y las columnas no sean
            //editables
            @Override
            public boolean isCellEditable(int row, int column) {

                return false;
            }
        };

        //vamos a establecer los nombres de las columnas.
        String titulos[] = {"Num", "Nombre", "Color", "Raza",
            "Alergico", "At. Esp.", "Dueño", "Cel"};

        modeloTabla.setColumnIdentifiers(titulos);

        //carga de datos desde la base de datos
        List<Mascota> listaMascotas = control.traerMascotas();

        //recorrer la lista y mostrar cada uno de los elementos
        //en la lista
        if (listaMascotas != null) {

            for (Mascota masco : listaMascotas) {
                Object[] objeto = {masco.getNum_cliente(), masco.getNombreMascota(),
                    masco.getColor(), masco.getRaza(), masco.getAlergico(), masco.getAtencion_especial(),
                    masco.getUnDuenio().getNombre(), masco.getUnDuenio().getCelDuenio()};

                modeloTabla.addRow(objeto);
            }
        }
        tablaMascotas.setModel(modeloTabla);
    }
}
