package br.com.unipar.desingpatterns_factorymethod.matcha;

import java.util.Map;

public interface ViewEngine {

    String render(String viewName, Map<String, Object> context);
    
}
