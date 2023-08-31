package br.com.unipar.desingpatterns_factorymethod;

import java.util.Calendar;

public class DesingPatterns_FactoryMethod {

    public static void main(String[] args) {
        Calendar.getInstance(); //exemplo de Factory Method
        
        new ProductsController().listProducts();
        
    }
}
