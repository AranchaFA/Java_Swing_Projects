/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fondoPersonalizado;

import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author aranx
 */
public class FondoPersonalizado extends JPanel implements Serializable{

    private PropiedadesFondo propiedades;

    public FondoPersonalizado() {
    }

    public PropiedadesFondo getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(PropiedadesFondo propiedades) {
        this.propiedades = propiedades;
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        // Antes de elegir en el editor las propiedades es null, y daría nullPointerExcptn el if interno
        if (propiedades != null) {
            if (propiedades.getFicheroImagen() != null && propiedades.getFicheroImagen().exists()) {
                ImageIcon imagen = new ImageIcon(propiedades.getFicheroImagen().getAbsolutePath());
                grphcs.drawImage(imagen.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
            } else if (propiedades.getColorFondo() != null) {
                setBackground(propiedades.getColorFondo());
            }
        }
    }

}
