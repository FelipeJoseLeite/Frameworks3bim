package br.com.designpatternexfixacao.ganhoMassa;
/**
 *
 * @author Felipe
 */
import br.com.designpatternexfixacao.abstrasctFactory.Button;


public class GanhoMassaButton implements Button {

    @Override
    public void render() {
        System.out.println("SELECIONOU GANHO DE MASSA BUTTON!!!");
    }
    
}
