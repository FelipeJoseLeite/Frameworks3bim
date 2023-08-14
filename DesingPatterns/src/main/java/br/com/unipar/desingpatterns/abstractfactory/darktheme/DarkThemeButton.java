package br.com.unipar.desingpatterns.abstractfactory.darktheme;

import br.com.unipar.desingpatterns.abstractfactory.Button;

public class DarkThemeButton implements Button{

    @Override
    public void render() {
        System.out.println("DarkTheme Button!");
    }
    
}
