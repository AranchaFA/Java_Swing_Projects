/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fondoPersonalizado;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author aranx
 */
public class FondoPersonalizadoPropertyEditorSupport extends PropertyEditorSupport {
    
    private FondoPersonalizadoPanel fondoPersonalizadoPanel;

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return fondoPersonalizadoPanel;
    }

    @Override
    public String getJavaInitializationString() {
        return super.getJavaInitializationString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValue() {
        return fondoPersonalizadoPanel.getPropiedadesFondo();
    }

}
