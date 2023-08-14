package br.com.unipar.desingpatterns.abstractfactory.lighttheme;

import br.com.unipar.desingpatterns.abstractfactory.Button;
import br.com.unipar.desingpatterns.abstractfactory.TextBox;
import br.com.unipar.desingpatterns.abstractfactory.WidgetFactory;



public class LightThemeFactory implements WidgetFactory{

    @Override
    public Button createButton() {
        return new LightThemeButton();
    }

    @Override
    public TextBox createTextBox() {
        return new LightThemeTextBox();
    }
    
    
    
}
