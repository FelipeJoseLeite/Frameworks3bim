package br.com.designpatternexfixacao.perdaPeso;
/**
 *
 * @author Felipe
 */
import br.com.designpatternexfixacao.abstrasctFactory.Button;


public class perdaPesoButton implements Button {

    @Override
    public void render() {
    
        System.out.println("SELECIONOU PERCA DE PESO!!!");
        
    }
    
}
