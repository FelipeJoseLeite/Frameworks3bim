package br.com.unipar.desingpatterns_factorymethod.sharp;

import br.com.unipar.desingpatterns_factorymethod.matcha.Controller;
import br.com.unipar.desingpatterns_factorymethod.matcha.ViewEngine;

public class SharpController extends Controller{
    
    @Override
    protected ViewEngine creViewEngine(){
        return new SharpViewEngine();
    }
    
}
