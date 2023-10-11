package br.com.designpatterns_strategy_ex;
/**
 *
 * @author Felipe
 */
public class FormaPagamentoAleatoria implements FormaPagamento{

    @Override
    public void pagamento(String dsPagamento) {
        
        System.out.println("Forma de Pagamento: 2 litros de leite, 2 queijos, 3 salame");
        
    }
    
}
