package br.com.designpatternexfixacao.comecoZero;
/**
 *
 * @author Felipe
 */
import br.com.designpatternexfixacao.abstrasctFactory.Button;

public class comecoZeroButton implements Button{

    @Override
    public void render() {
        System.out.println("SELECIONOU COMEÇO DO ZERO BUTTON!!!");
    }
    
}
