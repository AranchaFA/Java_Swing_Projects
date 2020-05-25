package GUI;

import DTOs.Contacto;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        // Para definir el aspecto de ESTA PANTALLA (Nimbus, Metal,... en WINDOWS)
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        // Forma 1 (sin crear nuestra propia clase TableModleContactos)
        inicializarTabla();
        // Forma 2 (creando nuestra propia clase TableModleContactos)
        //jT_tabla.setModel(new TableModleContactos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_avisos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_tabla = new javax.swing.JTable();
        jL_margenDcho = new javax.swing.JLabel();
        jL_margenIzq = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jM_alta = new javax.swing.JMenu();
        jMenuItem_alta = new javax.swing.JMenuItem();
        jMenuItem_baja = new javax.swing.JMenuItem();
        jMenuItem_cambiarApariencia = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jL_avisos.setText("Avisos: ");
        getContentPane().add(jL_avisos, java.awt.BorderLayout.PAGE_END);

        jT_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "DNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jT_tabla);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jL_margenDcho.setText("         ");
        getContentPane().add(jL_margenDcho, java.awt.BorderLayout.LINE_END);

        jL_margenIzq.setText("        ");
        getContentPane().add(jL_margenIzq, java.awt.BorderLayout.LINE_START);

        jM_alta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jM_alta.setText("CONTACTO");

        jMenuItem_alta.setText("Alta...");
        jMenuItem_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_altaActionPerformed(evt);
            }
        });
        jM_alta.add(jMenuItem_alta);

        jMenuItem_baja.setText("Baja");
        jMenuItem_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_bajaActionPerformed(evt);
            }
        });
        jM_alta.add(jMenuItem_baja);

        jMenuItem_cambiarApariencia.setText("Cambiar apariencia...");
        jMenuItem_cambiarApariencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cambiarAparienciaActionPerformed(evt);
            }
        });
        jM_alta.add(jMenuItem_cambiarApariencia);

        jMenuBar1.add(jM_alta);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_altaActionPerformed
        this.jL_avisos.setText("Avisos: ");
        VentanaCrearContacto vccNueva = new VentanaCrearContacto(this, true);
        vccNueva.setVisible(true);
    }//GEN-LAST:event_jMenuItem_altaActionPerformed

    private void jMenuItem_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_bajaActionPerformed
        this.jL_avisos.setText("Avisos: ");

        int[] filasSeleccionadas = jT_tabla.getSelectedRows();
        if (filasSeleccionadas.length == 0) {
            this.jL_avisos.setText("¡ No hay seleccionada ninguna fila !");
        } else {
            for (int fila : filasSeleccionadas) {
                DefaultTableModel dtm = (DefaultTableModel) jT_tabla.getModel();
                dtm.removeRow(fila - 1);
            }
        }
    }//GEN-LAST:event_jMenuItem_bajaActionPerformed

    private void jMenuItem_cambiarAparienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cambiarAparienciaActionPerformed
        VentanaApariencia ventanaApariencia = new VentanaApariencia(this, false);
        ventanaApariencia.setVisible(true);
    }//GEN-LAST:event_jMenuItem_cambiarAparienciaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });

    }

    public void refrescarTabla() {

    }

    public void inicializarTabla() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nombre", "Apellidos", "DNI"});
        jT_tabla.setModel(dtm);
    }

    public void addContacto(Contacto contacto) {
        // Creamos un objeto modelo de tabla y luego lo inicializamos con el modelo que tiene nuestra tabla.
        DefaultTableModel dtm = (DefaultTableModel) jT_tabla.getModel();
        dtm.addRow(contacto.generarArrayDeDatos());
    }

    /* public void cambiarApariencia(String lookAndFeelClassName) {
    try {
    UIManager.setLookAndFeel(lookAndFeelClassName());
    } catch (ClassNotFoundException ex) {
    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
    } catch (UnsupportedLookAndFeelException ex) {
    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
    }
    // Refrescamos para que carge la nueva apariencia de los componentes
    SwingUtilities.updateComponentTreeUI(this);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jL_avisos;
    private javax.swing.JLabel jL_margenDcho;
    private javax.swing.JLabel jL_margenIzq;
    private javax.swing.JMenu jM_alta;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_alta;
    private javax.swing.JMenuItem jMenuItem_baja;
    private javax.swing.JMenuItem jMenuItem_cambiarApariencia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_tabla;
    // End of variables declaration//GEN-END:variables
}
