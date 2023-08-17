package br.com.unipar.desingpatters_adapter;

import br.com.unipar.desingpatters_adapter.instaFilters.Caramel;

public class DesingPatters_Adapter {

    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
