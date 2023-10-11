package br.com.designpatterns_factorymethod_ex.Burguer.Angus;
/**
 *
 * @author Felipe
 */
import br.com.designpatterns_factorymethod_ex.Burguer.ControllerAngus;
import br.com.designpatterns_factorymethod_ex.Burguer.ViewBurguer;

public class AngusController extends ControllerAngus{


    @Override
    protected ViewBurguer createViewEngine(){
    return new AngusViewEngine();
    }
    
}
