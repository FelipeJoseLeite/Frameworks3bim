package br.com.designpatterns_strategy_ex;
/**
 *
 * @author Felipe
 */

public class DogeCoin implements FormaPagamento{

    @Override
    public void pagamento(String dsPagamento) {
       
        System.out.println("Forma de Pagamento: DogeCoin Selecionado");
        
    }


    
}
