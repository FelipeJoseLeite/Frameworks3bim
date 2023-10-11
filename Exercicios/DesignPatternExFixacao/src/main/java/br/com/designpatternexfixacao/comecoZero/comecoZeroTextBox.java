package br.com.designpatternexfixacao.comecoZero;
/**
 *
 * @author Felipe
 */
import br.com.designpatternexfixacao.abstrasctFactory.TextBox;

public class comecoZeroTextBox implements TextBox{

    @Override
    public void render() {
        System.out.println("ComecoZero TextBox !!!");
    }
    
}
