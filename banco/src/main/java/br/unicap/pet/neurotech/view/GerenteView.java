package br.unicap.pet.neurotech.view;

import br.unicap.pet.neurotech.control.GerenteController;
import br.unicap.pet.neurotech.view.util.Leitor;

public class GerenteView {

    GerenteController acesso = new GerenteController();
   
    public void criarConta() {
        System.out.println("Número da conta: ");
        int numConta = Leitor.getLeitor().nextInt();
        
        System.out.println("É uma conta bonus?");
        boolean ehBonus = Leitor.getLeitor().nextBoolean();
        if (ehBonus){
            acesso.criarContaBonus(numConta);
        } else{
            acesso.criarConta(numConta);
        }
    }
    
    public void renderBonus() {
        System.out.println("Número da conta: ");
        int numConta = Leitor.getLeitor().nextInt();
        acesso.renderBonus(numConta);
    }
    
}
