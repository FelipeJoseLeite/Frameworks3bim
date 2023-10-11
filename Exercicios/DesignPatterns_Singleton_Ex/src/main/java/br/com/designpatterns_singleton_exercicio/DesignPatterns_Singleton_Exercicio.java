package br.com.designpatterns_singleton_exercicio;
/**
 *
 * @author Felipe
 */
public class DesignPatterns_Singleton_Exercicio {

    public static void main(String[] args) {
        
        ConfigManager manager = ConfigManager.getInstance();
        manager.setLoggedInUser("Usuário Logado no Sistema!!!");

        ConfigManager otherManager = ConfigManager.getInstance();
        System.out.println(otherManager.getLoggedInUser());
        
    }
}
