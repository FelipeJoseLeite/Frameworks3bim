package br.com.unipar.desingpatters_adapter;

import br.com.unipar.desingpatters_adapter.instaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter{

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
    
}
