package br.com.unipar.desingpatters_adapter;

import br.com.unipar.desingpatters_adapter.instaFilters.Caramel;

public class CaramelFilter implements Filter{
    
    private Caramel caramel;
    
    public CaramelFilter(Caramel caramel){
        this.caramel = caramel;
    }
    
    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
    
}
