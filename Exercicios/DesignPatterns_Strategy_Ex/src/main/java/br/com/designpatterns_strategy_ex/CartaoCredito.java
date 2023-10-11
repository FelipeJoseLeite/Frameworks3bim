package br.com.designpatterns_strategy_ex;
/**
 *
 * @author Felipe
 */
public class CartaoCredito implements FormaPagamento{

    @Override
    public void pagamento(String dsPagamento) {
        
        System.out.println("Forma de Pagamento: Cartão de Credito Selecionado");
        
    }


    
}
