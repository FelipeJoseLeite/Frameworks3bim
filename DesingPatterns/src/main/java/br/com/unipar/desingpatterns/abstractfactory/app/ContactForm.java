package br.com.unipar.desingpatterns.abstractfactory.app;

import br.com.unipar.desingpatterns.abstractfactory.darktheme.DarkThemeButton;
import br.com.unipar.desingpatterns.abstractfactory.darktheme.DarkThemeTextBox;
import br.com.unipar.desingpatterns.abstractfactory.lighttheme.LightThemeButton;

public class ContactForm {
    
    public void render(ThemeEnum theme){
        if(theme.equals(ThemeEnum.DARK_THEME)){
            new DarkThemeButton(). render();
            new DarkThemeTextBox(). render();
        }else if(theme.equals(ThemeEnum.LIGHT_THEME)){
            new LightThemeButton(). render();
            new LightThemeButton(). render();
        }
    }
    
}
