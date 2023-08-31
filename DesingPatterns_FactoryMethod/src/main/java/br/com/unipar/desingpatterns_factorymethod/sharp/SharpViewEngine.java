package br.com.unipar.desingpatterns_factorymethod.sharp;

import br.com.unipar.desingpatterns_factorymethod.matcha.ViewEngine;
import java.util.Map;

public class SharpViewEngine implements ViewEngine{

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Sharp!";
    }
    
}
