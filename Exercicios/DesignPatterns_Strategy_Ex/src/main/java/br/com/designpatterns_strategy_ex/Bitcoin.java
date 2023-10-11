package br.com.designpatterns_strategy_ex;
/**
 *
 * @author Felipe
 */
public class Bitcoin implements FormaPagamento{

    @Override
    public void pagamento(String dsPagamento) {
        System.out.println("Forma de Pagamento: Bitcoin Selecionado");
    }
    
}
