package br.com.unipar.desingpatterns_composite_exercicio;

import br.com.unipar.desingpatterns_composite_exercicio.product.Juice;
import br.com.unipar.desingpatterns_composite_exercicio.product.Toxies;

public class DesingPatterns_Composite_Exercicio {

    public static void main(String[] args) {
        
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(new CompositeBox(new Juice("SUCO", 1233.00)),new CompositeBox(new Toxies("TOXICO 1", 25.55),
        new Toxies("CREATINA", 58.66)), new Juice("TREMBOLONA", 1481.00));
        
        System.out.println("TOTAL GASTO: " + deliveryService.calculateOrderPride());
        
    }
}
