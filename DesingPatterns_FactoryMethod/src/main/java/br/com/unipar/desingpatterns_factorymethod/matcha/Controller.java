package br.com.unipar.desingpatterns_factorymethod.matcha;

import java.util.Map;

public class Controller{
    
    public void render(String viewName, Map<String, Object> context){
        ViewEngine engine = creViewEngine();
        String html = engine.render(viewName, context);
        System.out.println(html);
    }
    
    protected ViewEngine creViewEngine(){
        return new MatchaViewEngine();
    }
    
}
