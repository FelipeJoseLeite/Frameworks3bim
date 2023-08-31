package br.com.unipar.desingpatterns_factorymethod;

import java.util.Map;
import br.com.unipar.desingpatterns_factorymethod.matcha.Controller;
import br.com.unipar.desingpatterns_factorymethod.matcha.MatchaViewEngine;
import br.com.unipar.desingpatterns_factorymethod.sharp.SharpController;
import java.util.HashMap;

public class ProductsController extends SharpController{
    
    public void listProducts(){
        //aqui pega os dados do banco
        Map<String, Object> context = new HashMap<>();
        //context é populado
        render("productsView.html", context);
    }
    
}
