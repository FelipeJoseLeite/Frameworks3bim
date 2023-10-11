package br.com.designpatternexfixacao;
/**
 *
 * @author Felipe
 */
import br.com.designpatternexfixacao.app.ContactForm;
import br.com.designpatternexfixacao.treinoForca.TreinoForcaFactory;


public class DesignPatternExFixacao {

    public static void main(String[] args) {
      
        new ContactForm().render(new TreinoForcaFactory());
        
    }
}
