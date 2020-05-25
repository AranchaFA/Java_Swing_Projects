/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customBackground;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author aranx
 */
public class CustomBackgroundPanel extends javax.swing.JPanel {

    // Necesitamos declarar un atributo para guardar el valor del color/imagen seleccionada
    // en legirActionPerformed() y usarlo en getParametros()
    private CustomBackgroundParameters parametros;

    /**
     * Creates new form CustomBackgroundPanel
     */
    public CustomBackgroundPanel() {
        initComponents();
        this.parametros = new CustomBackgroundParameters();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jL_tipoFondo = new javax.swing.JLabel();
        jComboBox_tipoFondo = new javax.swing.JComboBox<>();
        jB_elegirFondo = new javax.swing.JButton();
        jL_seleccionado = new javax.swing.JLabel();

        jL_tipoFondo.setText("Tipo de fondo:");

        jComboBox_tipoFondo.setMaximumRowCount(2);
        jComboBox_tipoFondo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Color", "Imagen" }));

        jB_elegirFondo.setText("Elegir");
        jB_elegirFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_elegirFondoActionPerformed(evt);
            }
        });

        jL_seleccionado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_seleccionado.setText("Sin selección");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_tipoFondo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jComboBox_tipoFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_elegirFondo))
                        .addComponent(jL_seleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_tipoFondo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_tipoFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_elegirFondo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jL_seleccionado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jB_elegirFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_elegirFondoActionPerformed
        Color colorTextoPorDefecto = Color.BLACK;

        switch (jComboBox_tipoFondo.getSelectedIndex()) {
            case 0: // COLOR
                // Damos a elegir un color
                Color colorElegido = JColorChooser.showDialog(this, "Color de fondo", this.getBackground());
                this.jL_seleccionado.setText(String.valueOf(colorElegido.getRGB()));
                jL_seleccionado.setForeground(colorElegido);
                // Si había una imagen seleccionada, la borramos
                if (parametros.getFicheroImagen() != null) {
                    parametros.setFicheroImagen(null);
                }
                parametros.setColorFondo(colorElegido);
                break;
                
            case 1: // IMAGEN
                // Damos a elegir un fichero con la imagen
                JFileChooser jfileChooser = new JFileChooser();
                jfileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int resultado = jfileChooser.showSaveDialog(this);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    File ficheroElegido = jfileChooser.getSelectedFile();
                    // Comprobamos que el fichero corresponde a una imagen (de alguno de los tipos de extensiones de la lista final)
                    if (extensionesImagen().contains(getExtension(ficheroElegido).toUpperCase())) {
                        jL_seleccionado.setText(ficheroElegido.getName());
                        jL_seleccionado.setForeground(colorTextoPorDefecto);
                        // Si había un color de fondo seleccionado, lo borramos
                        if (parametros.getColorFondo() != null) {
                            parametros.setColorFondo(null);
                        }
                        parametros.setFicheroImagen(ficheroElegido);
                    } else {
                        JOptionPane.showMessageDialog(this, "¡El tipo de fichero seleccionado no es válido!");
                    }
                }
                break;
            default:
                jL_seleccionado.setText("Sin selección");
                jL_seleccionado.setForeground(colorTextoPorDefecto);
        }
    }//GEN-LAST:event_jB_elegirFondoActionPerformed

    public CustomBackgroundParameters getParametros() {
        return parametros;
    }

    public static List<String> extensionesImagen() {
        List<String> listaExtensionesImagen = new ArrayList<>();
        listaExtensionesImagen.add("JPG");
        listaExtensionesImagen.add("JPEG");
        listaExtensionesImagen.add("PNG");
        listaExtensionesImagen.add("GIF");
        listaExtensionesImagen.add("BMP");
        listaExtensionesImagen.add("RAW");
        listaExtensionesImagen.add("TIF");
        listaExtensionesImagen.add("TIFF");
        return listaExtensionesImagen;
    }

    /**
     *
     * @param fichero
     * @return La extensión del fichero (sin ".") pasado por parámetro, null si
     * se trata de un directorio y no tiene ninguna extensión
     */
    public static String getExtension(File fichero) {
        String extension = null;
        // StringTokenizer para sacar la extensión en el segundo token (después del '.')
        StringTokenizer stringTokenizer = new StringTokenizer(fichero.getName(), ".");
        stringTokenizer.nextToken();
        if (stringTokenizer.hasMoreTokens()) {
            extension = stringTokenizer.nextToken();
        }
        return extension;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_elegirFondo;
    private javax.swing.JComboBox<String> jComboBox_tipoFondo;
    private javax.swing.JLabel jL_seleccionado;
    private javax.swing.JLabel jL_tipoFondo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}