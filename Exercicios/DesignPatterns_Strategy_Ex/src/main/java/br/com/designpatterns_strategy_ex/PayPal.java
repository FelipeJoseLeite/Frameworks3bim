package br.com.designpatterns_strategy_ex;
/**
 *
 * @author Felipe
 */
public class PayPal implements FormaPagamento{

    @Override
    public void pagamento(String dsPagamento) {
        
        System.out.println("Forma Pagamento: PayPal selecionado");
        
    }
    
    
    
}
