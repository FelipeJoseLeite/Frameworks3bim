package br.com.unipar.desingpatterns_composite_exercicio;

public class DeliveryService {
    
    private Box box;
    
    public DeliveryService(){
        
    }
    
    public void setupOrder(Box... boxes){
        this.box = new CompositeBox(boxes);
    }
    
    public double calculateOrderPride(){
        return box.calculatePrice();
    }
    
}
