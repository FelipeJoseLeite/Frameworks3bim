package br.com.unipar.desingpatters_adapter;

public class VividFilter implements Filter{

    @Override
    public void apply(Image image) {
        System.out.println("Apicando Filtro Vivido!");
    }
    
}
