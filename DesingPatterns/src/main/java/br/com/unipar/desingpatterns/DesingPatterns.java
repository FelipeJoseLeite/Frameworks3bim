package br.com.unipar.desingpatterns;

import br.com.unipar.desingpatterns.abstractfactory.app.ContactForm;
import br.com.unipar.desingpatterns.abstractfactory.lighttheme.LightThemeFactory;

public class DesingPatterns {

    public static void main(String[] args) {
        new ContactForm().render(new LightThemeFactory());
    }
}
