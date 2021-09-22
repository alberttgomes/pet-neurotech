package br.unicap.pet.neurotech.view;

import br.unicap.pet.neurotech.model.exceptions.UsuarioNaoEncontradoException;
import br.unicap.pet.neurotech.view.util.Leitor;

public class MenuPrincipal {

    public static void main(String[] args) throws UsuarioNaoEncontradoException {
        int op;
        //MenuCliente acessoCliente = new MenuCliente();
        MenuGerente acessoGerente = new MenuGerente();
        LoginView login = new LoginView();
        
        do {
            
            System.out.println("<<MENU PRINCIPAL>>");
            System.out.println("1 - Cliente"); 
            System.out.println("2 - Gerente"); 
            System.out.println("3 - Sair"); 
            op = Leitor.getLeitor().nextInt();
            switch (op) {

                case 1:
                    login.Entrar();
                    break;
                case 2:
                    acessoGerente.Menu();
                    break;
            }
        } while (op != 3);

    }

}
