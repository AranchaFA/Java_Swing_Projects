
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aranx
 */
public class BotonPersonalizado extends JButton {

    // ATRIBUTOS
    private Color colorAlPasarPorEncima;
    private Font fuenteAlPasarEncima;
    private Color colorInicial;
    private Font fuenteInicial;

    // MÉTODOS
    // Constructor sin parámetros
    public BotonPersonalizado() {
        // Asignamos el listener que controlará los eventos del ratón
        addMouseListener(new MouseAdapter() {
            // Cuando pasamos el ratón por encima
            @Override
            public void mouseEntered(MouseEvent me) {
                if (fuenteAlPasarEncima != null) {
                    setFont(fuenteAlPasarEncima);
                }
                if (colorAlPasarPorEncima != null) {
                    setForeground(colorAlPasarPorEncima);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if (colorInicial != null) {
                    setForeground(colorInicial);
                }
                if (fuenteInicial != null) {
                    setFont(fuenteInicial);
                }
            }
        });
    }

    // Getters + Setters
    public Color getColorAlPasarPorEncima() {
        return colorAlPasarPorEncima;
    }

    public void setColorAlPasarPorEncima(Color colorAlPasarPorEncima) {
        this.colorAlPasarPorEncima = colorAlPasarPorEncima;
    }

    public Font getFuenteAlPasarEncima() {
        return fuenteAlPasarEncima;
    }

    public void setFuenteAlPasarEncima(Font fuenteAlPasarEncima) {
        this.fuenteAlPasarEncima = fuenteAlPasarEncima;
    }

    public Color getColorInicial() {
        return colorInicial;
    }

    public void setColorInicial(Color colorInicial) {
        this.colorInicial = colorInicial;
        // Asignamos el color inicial, controlando que no sean null
        if (colorInicial != null) {
            setForeground(colorInicial);
        }
    }

    public Font getFuenteInicial() {
        return fuenteInicial;
    }

    public void setFuenteInicial(Font fuenteInicial) {
        this.fuenteInicial = fuenteInicial;
        // Asignamos la fuente inicial, controlando que no sean null
        if (fuenteInicial != null) {
            setFont(fuenteInicial);
        }
    }

}
