package br.unicap.pet.neurotech.view;

import br.unicap.pet.neurotech.view.util.Leitor;

public class MenuPrincipal {

    public static void main(String[] args) {
        int op;
        MenuCliente acessoCliente = new MenuCliente();
        do {
            
            System.out.println("<<MENU PRINCIPAL>>");
            System.out.println("1 - Cliente"); 
            op = Leitor.getLeitor().nextInt();
            switch (op) {

                case 1:
                    acessoCliente.Menu();
                    break;
                case 3:                    
                    break;
            }
        } while (op != 3);

    }

}
