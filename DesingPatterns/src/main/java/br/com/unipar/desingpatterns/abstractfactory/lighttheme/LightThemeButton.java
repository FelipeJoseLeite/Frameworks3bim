package br.com.unipar.desingpatterns.abstractfactory.lighttheme;

import br.com.unipar.desingpatterns.abstractfactory.Button;

public class LightThemeButton implements Button{

    @Override
    public void render() {
        System.out.println("LinghtTheme Button!");
    }
    
}
