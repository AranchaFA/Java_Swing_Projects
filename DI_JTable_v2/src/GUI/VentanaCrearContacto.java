package GUI;

import Controlador.LogicaNegocio;
import DTOs.Contacto;
import TableModels.TablaContactos;
import java.util.regex.Pattern;

public class VentanaCrearContacto extends javax.swing.JDialog {

    private VentanaPrincipal parent;
    private String caractererIntroducidoDNI;
    int numCaracteresIntroducidos;

    public VentanaCrearContacto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        // En este caso, como añadimos los contactos a través del controlador, no haremos uso del parent
        // pero lo dejo de todos modos 
        this.parent = (VentanaPrincipal) parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_nombre = new javax.swing.JLabel();
        jL_apellidos = new javax.swing.JLabel();
        jL_dni = new javax.swing.JLabel();
        jTF_nombre = new javax.swing.JTextField();
        jTF_apellidos = new javax.swing.JTextField();
        jTF_dni = new javax.swing.JTextField();
        jB_aceptar = new javax.swing.JButton();
        jL_dniInvalido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jL_nombre.setText("Nombre: ");

        jL_apellidos.setText("Apellidos: ");

        jL_dni.setText("DNI: ");

        jTF_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTF_dniKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTF_dniKeyReleased(evt);
            }
        });

        jB_aceptar.setText("ACEPTAR");
        jB_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_aceptarMouseClicked(evt);
            }
        });

        jL_dniInvalido.setForeground(new java.awt.Color(255, 0, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jB_aceptar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_apellidos)
                            .addComponent(jL_nombre)
                            .addComponent(jL_dni))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTF_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTF_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jL_dniInvalido))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_nombre)
                    .addComponent(jTF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_apellidos)
                    .addComponent(jTF_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_dni)
                    .addComponent(jTF_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jL_dniInvalido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jB_aceptar)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_aceptarMouseClicked
        // Creamos un Contacto con los textos contenidos en cada uno de los textField
        Contacto contacto = new Contacto(jTF_nombre.getText(), jTF_apellidos.getText(), jTF_dni.getText());
        System.out.println("Validar DNI: " + validarDNISencillo());
        // Añadimos el Contacto a la lista de contactos del controlador
        LogicaNegocio.addContacto(contacto);
        // Refrescamos el objeto TableModel que contiene los datos
        parent.refrescarTabla();
        // Cerramos esta ventana para volver de nuevo a la principal
        dispose();
    }//GEN-LAST:event_jB_aceptarMouseClicked

    private void jTF_dniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_dniKeyPressed

    }//GEN-LAST:event_jTF_dniKeyPressed

    private void jTF_dniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_dniKeyReleased
        /*if (!validarDNIComplejo()) {
        // Quitamos el último caracter introducido, pues se supone que da error
        jTF_dni.setText(jTF_dni.getText().substring(0, jTF_dni.getText().length()-2));
        jL_dniInvalido.setText("El caracter que intentas introducir no es válido en un DNI");
        } */
    }//GEN-LAST:event_jTF_dniKeyReleased

    public boolean validarDNISencillo() {
        return Pattern.matches("^[0-9]{8}[A-Ba-b]", jTF_dni.getText());

    }

    // Vigilar en el momento de teclear que se está cumpliendo el patrón
    public boolean validarDNIComplejo() {
        boolean valido = true;
        String patronLetras = "A-Za-z";
        String patronNumero = "0-9";
        // Los 8 primeros caracteres serán válidos si son letras, el 9 si es dígito, a partir de ahí ninguno
        if (jTF_dni.getText().length() <= 8) {
            valido = Pattern.matches(patronNumero, String.valueOf(jTF_dni.getText().charAt(jTF_dni.getText().length()-1)));
        } else if (jTF_dni.getText().length() == 9) {
            valido = Pattern.matches(patronLetras, String.valueOf(jTF_dni.getText().charAt(jTF_dni.getText().length()-1)));
        } else {
            valido=false;
        }
        return valido;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_aceptar;
    private javax.swing.JLabel jL_apellidos;
    private javax.swing.JLabel jL_dni;
    private javax.swing.JLabel jL_dniInvalido;
    private javax.swing.JLabel jL_nombre;
    private javax.swing.JTextField jTF_apellidos;
    private javax.swing.JTextField jTF_dni;
    private javax.swing.JTextField jTF_nombre;
    // End of variables declaration//GEN-END:variables
}
