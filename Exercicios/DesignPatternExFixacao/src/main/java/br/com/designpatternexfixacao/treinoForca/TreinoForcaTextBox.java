package br.com.designpatternexfixacao.treinoForca;
/**
 *
 * @author Felipe
 */
import br.com.designpatternexfixacao.abstrasctFactory.TextBox;


public class TreinoForcaTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("TREINO FORCA TEXTBOX !!!");
    }
    
}
