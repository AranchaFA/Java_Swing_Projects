
import com.easynth.lookandfeel.EaSynthLookAndFeel;
import dtos.Expresion;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * ESTA CLASE DEBERÍA IR EN EL PAQUETE GUI, PERO AL MOVERLA ME CASCA EL IMPORT
 * DE TODOS LOS BOTONES Y TENDRÍA QUE VOLVER A MAQUETARLO TODO :(
 *
 * @author aranx
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {

        cambiarLookAndFeel();
        initComponents();

        // JavaHelp
        try {
            File fichero = new File("help/help_set.hs");
            URL hsURL = fichero.toURI().toURL();
            // Creamos el HelpSet y el HelpBroker
            HelpSet helpset;
            helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            // Configuramos el botón F1 y '?' que abrirán la ayuda
            hb.enableHelpOnButton(bt_interrogante, "principal", helpset); // CAMBIOS
            hb.enableHelpKey(getRootPane(), "principal", helpset); // CAMBIOS
        } catch (HelpSetException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTF_expresion = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        bt_1 = new BotonPersonalizado();
        bt_2 = new BotonPersonalizado();
        bt_3 = new BotonPersonalizado();
        bt_interrogante = new BotonPersonalizado();
        bt_4 = new BotonPersonalizado();
        bt_5 = new BotonPersonalizado();
        bt_6 = new BotonPersonalizado();
        bt_menorQue = new BotonPersonalizado();
        bt_7 = new BotonPersonalizado();
        bt_8 = new BotonPersonalizado();
        bt_9 = new BotonPersonalizado();
        bt_lista = new BotonPersonalizado();
        bt_mas = new BotonPersonalizado();
        bt_0 = new BotonPersonalizado();
        bt_menos = new BotonPersonalizado();
        bt_igual = new BotonPersonalizado();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTF_expresion.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jTF_expresion.setForeground(java.awt.Color.blue);
        jTF_expresion.setEnabled(false);
        getContentPane().add(jTF_expresion, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(4, 4));

        bt_1.setText("1");
        bt_1.setColorAlPasarPorEncima(java.awt.Color.red);
        bt_1.setColorInicial(java.awt.Color.blue);
        bt_1.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_1.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_1);

        bt_2.setText("2");
        bt_2.setColorAlPasarPorEncima(java.awt.Color.red);
        bt_2.setColorInicial(java.awt.Color.blue);
        bt_2.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_2.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_2);

        bt_3.setText("3");
        bt_3.setColorAlPasarPorEncima(java.awt.Color.red);
        bt_3.setColorInicial(java.awt.Color.blue);
        bt_3.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_3.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_3);

        bt_interrogante.setText("?");
        bt_interrogante.setColorAlPasarPorEncima(java.awt.Color.yellow);
        bt_interrogante.setColorInicial(java.awt.Color.blue);
        bt_interrogante.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_interrogante.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(bt_interrogante);

        bt_4.setText("4");
        bt_4.setColorAlPasarPorEncima(java.awt.Color.red);
        bt_4.setColorInicial(java.awt.Color.blue);
        bt_4.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_4.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_4ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_4);

        bt_5.setText("5");
        bt_5.setColorAlPasarPorEncima(java.awt.Color.red);
        bt_5.setColorInicial(java.awt.Color.blue);
        bt_5.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_5.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_5ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_5);

        bt_6.setText("6");
        bt_6.setColorAlPasarPorEncima(java.awt.Color.red);
        bt_6.setColorInicial(java.awt.Color.blue);
        bt_6.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_6.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_6ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_6);

        bt_menorQue.setText("<");
        bt_menorQue.setColorAlPasarPorEncima(java.awt.Color.yellow);
        bt_menorQue.setColorInicial(java.awt.Color.blue);
        bt_menorQue.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_menorQue.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_menorQue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menorQueActionPerformed(evt);
            }
        });
        jPanel1.add(bt_menorQue);

        bt_7.setText("7");
        bt_7.setColorAlPasarPorEncima(java.awt.Color.red);
        bt_7.setColorInicial(java.awt.Color.blue);
        bt_7.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_7.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_7ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_7);

        bt_8.setText("8");
        bt_8.setColorAlPasarPorEncima(java.awt.Color.red);
        bt_8.setColorInicial(java.awt.Color.blue);
        bt_8.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_8.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_8ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_8);

        bt_9.setText("9");
        bt_9.setColorAlPasarPorEncima(java.awt.Color.red);
        bt_9.setColorInicial(java.awt.Color.blue);
        bt_9.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_9.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_9ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_9);

        bt_lista.setText("Lista");
        bt_lista.setColorAlPasarPorEncima(java.awt.Color.cyan);
        bt_lista.setColorInicial(java.awt.Color.blue);
        bt_lista.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_lista.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_listaActionPerformed(evt);
            }
        });
        jPanel1.add(bt_lista);

        bt_mas.setText("+");
        bt_mas.setColorAlPasarPorEncima(java.awt.Color.green);
        bt_mas.setColorInicial(java.awt.Color.blue);
        bt_mas.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_mas.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_masActionPerformed(evt);
            }
        });
        jPanel1.add(bt_mas);

        bt_0.setText("0");
        bt_0.setColorAlPasarPorEncima(java.awt.Color.red);
        bt_0.setColorInicial(java.awt.Color.blue);
        bt_0.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_0.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_0ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_0);

        bt_menos.setText("-");
        bt_menos.setColorAlPasarPorEncima(java.awt.Color.green);
        bt_menos.setColorInicial(java.awt.Color.blue);
        bt_menos.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_menos.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menosActionPerformed(evt);
            }
        });
        jPanel1.add(bt_menos);

        bt_igual.setText("=");
        bt_igual.setColorAlPasarPorEncima(java.awt.Color.green);
        bt_igual.setColorInicial(java.awt.Color.blue);
        bt_igual.setFuenteAlPasarEncima(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        bt_igual.setFuenteInicial(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bt_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_igualActionPerformed(evt);
            }
        });
        jPanel1.add(bt_igual);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_1ActionPerformed
        String cadenaIntroducida = jTF_expresion.getText();
        cadenaIntroducida += "1";
        jTF_expresion.setText(cadenaIntroducida);
    }//GEN-LAST:event_bt_1ActionPerformed

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2ActionPerformed
        String cadenaIntroducida = jTF_expresion.getText();
        cadenaIntroducida += "2";
        jTF_expresion.setText(cadenaIntroducida);
    }//GEN-LAST:event_bt_2ActionPerformed

    private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_3ActionPerformed
        String cadenaIntroducida = jTF_expresion.getText();
        cadenaIntroducida += "3";
        jTF_expresion.setText(cadenaIntroducida);
    }//GEN-LAST:event_bt_3ActionPerformed

    private void bt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_4ActionPerformed
        String cadenaIntroducida = jTF_expresion.getText();
        cadenaIntroducida += "4";
        jTF_expresion.setText(cadenaIntroducida);
    }//GEN-LAST:event_bt_4ActionPerformed

    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_5ActionPerformed
        String cadenaIntroducida = jTF_expresion.getText();
        cadenaIntroducida += "5";
        jTF_expresion.setText(cadenaIntroducida);
    }//GEN-LAST:event_bt_5ActionPerformed

    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_6ActionPerformed
        String cadenaIntroducida = jTF_expresion.getText();
        cadenaIntroducida += "6";
        jTF_expresion.setText(cadenaIntroducida);
    }//GEN-LAST:event_bt_6ActionPerformed

    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_7ActionPerformed
        String cadenaIntroducida = jTF_expresion.getText();
        cadenaIntroducida += "7";
        jTF_expresion.setText(cadenaIntroducida);
    }//GEN-LAST:event_bt_7ActionPerformed

    private void bt_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_8ActionPerformed
        String cadenaIntroducida = jTF_expresion.getText();
        cadenaIntroducida += "8";
        jTF_expresion.setText(cadenaIntroducida);
    }//GEN-LAST:event_bt_8ActionPerformed

    private void bt_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_9ActionPerformed
        String cadenaIntroducida = jTF_expresion.getText();
        cadenaIntroducida += "9";
        jTF_expresion.setText(cadenaIntroducida);
    }//GEN-LAST:event_bt_9ActionPerformed

    private void bt_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_0ActionPerformed
        String cadenaIntroducida = jTF_expresion.getText();
        cadenaIntroducida += "0";
        jTF_expresion.setText(cadenaIntroducida);
    }//GEN-LAST:event_bt_0ActionPerformed

    private void bt_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_masActionPerformed
        String cadenaIntroducida = jTF_expresion.getText();
        cadenaIntroducida += "+";
        jTF_expresion.setText(cadenaIntroducida);
    }//GEN-LAST:event_bt_masActionPerformed

    private void bt_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menosActionPerformed
        String cadenaIntroducida = jTF_expresion.getText();
        cadenaIntroducida += "-";
        jTF_expresion.setText(cadenaIntroducida);
    }//GEN-LAST:event_bt_menosActionPerformed

    private void bt_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_listaActionPerformed
        VentanaSecundaria ventanaSecundaria = new VentanaSecundaria(this, false); // No modal!
        ventanaSecundaria.setVisible(true);
    }//GEN-LAST:event_bt_listaActionPerformed

    private void bt_menorQueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menorQueActionPerformed
        String cadenaIntroducida = jTF_expresion.getText();
        if (cadenaIntroducida.length() > 0) { // Si no da exception al darle a borrar sin nada escrito
            String cadenaConBorrado = cadenaIntroducida.substring(0, cadenaIntroducida.length() - 1);
            jTF_expresion.setText(cadenaConBorrado);
        }
    }//GEN-LAST:event_bt_menorQueActionPerformed

    private void bt_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_igualActionPerformed
        boolean valida = validarExpresion(jTF_expresion.getText());
        if (valida) {
            JOptionPane.showMessageDialog(this, "Se procede a guardar en la lista de operaciones", "Expresión correcta", JOptionPane.INFORMATION_MESSAGE);
            logica.Logica.addExpresion(new Expresion(new Date(), jTF_expresion.getText()));
            // Como cada vez que abramos la ventana secundaria cargará el JTable pasándole al TableModelExpresiones la lista de la lógica,
            // con añadirlo a la lógica ya se actualizaría en la del TableModel
            jTF_expresion.setText(""); // Limpiamos el TextField
        } else {
            JOptionPane.showMessageDialog(this, "Expresión incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bt_igualActionPerformed

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

    public static boolean validarExpresion(String expresion) {
        boolean valida = false;
        String expresionRegular = "^([+-]?[0-9]+)+$";
        return Pattern.matches(expresionRegular, expresion);
    }

    public void cambiarLookAndFeel() {
        try {
            UIManager.setLookAndFeel(EaSynthLookAndFeel.class.getCanonicalName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BotonPersonalizado bt_0;
    private BotonPersonalizado bt_1;
    private BotonPersonalizado bt_2;
    private BotonPersonalizado bt_3;
    private BotonPersonalizado bt_4;
    private BotonPersonalizado bt_5;
    private BotonPersonalizado bt_6;
    private BotonPersonalizado bt_7;
    private BotonPersonalizado bt_8;
    private BotonPersonalizado bt_9;
    private BotonPersonalizado bt_igual;
    private BotonPersonalizado bt_interrogante;
    private BotonPersonalizado bt_lista;
    private BotonPersonalizado bt_mas;
    private BotonPersonalizado bt_menorQue;
    private BotonPersonalizado bt_menos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTF_expresion;
    // End of variables declaration//GEN-END:variables
}
