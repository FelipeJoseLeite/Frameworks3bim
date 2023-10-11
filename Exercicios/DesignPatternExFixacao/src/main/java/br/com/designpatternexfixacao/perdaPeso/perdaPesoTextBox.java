package br.com.designpatternexfixacao.perdaPeso;
/**
 *
 * @author Felipe
 */
import br.com.designpatternexfixacao.abstrasctFactory.TextBox;

public class perdaPesoTextBox implements TextBox{

    @Override
    public void render() {
        System.out.println("PERDA DE PESO TEXTBOX");
    }
    
}
