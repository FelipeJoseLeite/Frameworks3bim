package br.com.unipar.desingpatterns.abstractfactory.darktheme;

import br.com.unipar.desingpatterns.abstractfactory.TextBox;

public class DarkThemeTextBox implements TextBox{
    
    @Override
    public void render() {
        System.out.println("DarkTheme TextBox!");
    }
    
}
