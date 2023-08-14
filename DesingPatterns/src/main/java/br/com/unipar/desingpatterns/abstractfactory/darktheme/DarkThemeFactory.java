package br.com.unipar.desingpatterns.abstractfactory.darktheme;

import br.com.unipar.desingpatterns.abstractfactory.Button;
import br.com.unipar.desingpatterns.abstractfactory.TextBox;
import br.com.unipar.desingpatterns.abstractfactory.WidgetFactory;
import br.com.unipar.desingpatterns.abstractfactory.darktheme.DarkThemeButton;
import br.com.unipar.desingpatterns.abstractfactory.darktheme.DarkThemeTextBox;

public class DarkThemeFactory implements WidgetFactory{

    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }

    @Override
    public TextBox createTextBox() {
        return new DarkThemeTextBox();
    }
    
}
