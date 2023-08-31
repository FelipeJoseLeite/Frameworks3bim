package br.com.unipar.desingpatterns_factorymethod.matcha;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine{
    
    @Override
    public String render(String view, Map<String, Object> context){
        return "View rendered by Matcha!";
    }
    
}
