package Label_BalanceIngresosGastos;


import java.io.Serializable;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aranx
 */
public class Label_BalanceIngresosGastos extends JLabel implements Serializable {

    // ATRIBUTOS
    private ConfiguracionBalance configuracionBalance;

    // MÉTODOS
    public Label_BalanceIngresosGastos() {
    }

    public ConfiguracionBalance getConfiguracionBalance() {
        return configuracionBalance;
    }

    public void setConfiguracionBalance(ConfiguracionBalance configuracionBalance) {
        this.configuracionBalance = configuracionBalance;
    }

   

}
