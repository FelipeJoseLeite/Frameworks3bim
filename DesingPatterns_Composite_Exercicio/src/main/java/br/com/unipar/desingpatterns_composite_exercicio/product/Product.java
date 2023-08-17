package br.com.unipar.desingpatterns_composite_exercicio.product;

import br.com.unipar.desingpatterns_composite_exercicio.Box;
import lombok.Data;

@Data
public abstract class Product implements Box{
    
    protected final String title;
    protected final double price;
    
}
