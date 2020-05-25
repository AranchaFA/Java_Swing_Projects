package GUI;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import javax.swing.UnsupportedLookAndFeelException;

public class VentanaApariencia extends javax.swing.JDialog {

    private VentanaPrincipal parent;
    Map<String, UIManager.LookAndFeelInfo> apariencias;

    public VentanaApariencia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        apariencias = new HashMap<>();
        // Cargamos el comboBox con las posibles apariencias de Windows
        // Sacamos el array con los temas/apariencias instaladas en el dispositivo (disponibles)
        UIManager.LookAndFeelInfo[] installedLookAndFeels = getInstalledLookAndFeels();
        // Las cargamos en el comboBox y generamos una colección con los objetos para tener su información identificable
        for (UIManager.LookAndFeelInfo installedLookAndFeel : installedLookAndFeels) {
            // Meto los objetos a asignar al LookAndFeel de la aplicación en un Map para 
            apariencias.put(installedLookAndFeel.getName(), installedLookAndFeel);
            // Añadimos el nombre simple del LookAndFeel al combo
            jComboBox_apariencias.addItem(installedLookAndFeel.getName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_escogeApariencia = new javax.swing.JLabel();
        jL_mostrarApariencia = new javax.swing.JLabel();
        jComboBox_apariencias = new javax.swing.JComboBox<>();
        jB_aplicarApariencia = new javax.swing.JButton();
        jB_probar = new javax.swing.JButton();
        jB_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jL_escogeApariencia.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jL_escogeApariencia.setText("ESCOGE APARIENCIA");

        jB_aplicarApariencia.setText("Aplicar");
        jB_aplicarApariencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_aplicarAparienciaActionPerformed(evt);
            }
        });

        jB_probar.setText("Probar");
        jB_probar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_probarActionPerformed(evt);
            }
        });

        jB_volver.setText("Volver");
        jB_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_escogeApariencia)
                    .addComponent(jComboBox_apariencias, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jL_mostrarApariencia))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jB_probar)
                        .addGap(44, 44, 44)
                        .addComponent(jB_aplicarApariencia)
                        .addGap(39, 39, 39)
                        .addComponent(jB_volver)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jL_escogeApariencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jL_mostrarApariencia)
                .addGap(89, 89, 89)
                .addComponent(jComboBox_apariencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_aplicarApariencia)
                    .addComponent(jB_probar)
                    .addComponent(jB_volver))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_probarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_probarActionPerformed
        Object nombreAparienciaSeleccionada = jComboBox_apariencias.getSelectedItem();
        try {
            UIManager.setLookAndFeel(apariencias.get(nombreAparienciaSeleccionada).getClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaApariencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VentanaApariencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VentanaApariencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VentanaApariencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_jB_probarActionPerformed

    private void jB_aplicarAparienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_aplicarAparienciaActionPerformed

        String nameAparienciaSeleccionada = (String) jComboBox_apariencias.getSelectedItem();
        String className = apariencias.get(nameAparienciaSeleccionada).getClassName();
        try {
            UIManager.setLookAndFeel(className);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaApariencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VentanaApariencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VentanaApariencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VentanaApariencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Refrescamos para que carge la nueva apariencia de los componentes
        SwingUtilities.updateComponentTreeUI(this);
        /*// Cambiamos el aspecto de la pantalla principal también 
        parent.cambiarApariencia(apariencias.get(className);*/
    }//GEN-LAST:event_jB_aplicarAparienciaActionPerformed

    private void jB_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_volverActionPerformed

        dispose();
    }//GEN-LAST:event_jB_volverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_aplicarApariencia;
    private javax.swing.JButton jB_probar;
    private javax.swing.JButton jB_volver;
    private javax.swing.JComboBox<String> jComboBox_apariencias;
    private javax.swing.JLabel jL_escogeApariencia;
    private javax.swing.JLabel jL_mostrarApariencia;
    // End of variables declaration//GEN-END:variables
}
