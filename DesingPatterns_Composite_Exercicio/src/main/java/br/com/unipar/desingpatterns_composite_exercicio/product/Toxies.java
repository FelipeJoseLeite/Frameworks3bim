package br.com.unipar.desingpatterns_composite_exercicio.product;

public class Toxies extends Product{

    public Toxies(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
    
}
