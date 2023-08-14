package br.com.unipar.desingpatterns.abstractfactory.lighttheme;

import br.com.unipar.desingpatterns.abstractfactory.TextBox;

public class LightThemeTextBox implements TextBox{

    @Override
    public void render() {
        System.out.println("LinghtTheme TextBox!");    
    }
    
}
