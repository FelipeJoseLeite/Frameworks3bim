package br.com.designpatternexfixacao.app;
/**
 *
 * @author Felipe
 */
import javax.xml.parsers.FactoryConfigurationError;

import br.com.designpatternexfixacao.abstrasctFactory.WidgetFactory;


public class ContactForm {
    
    public void render(WidgetFactory factory){
        
        factory.createButton().render();
        factory.createTextBox().render();
   
}
}
