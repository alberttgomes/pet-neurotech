package br.unicap.pet.neurotech.view;

import br.unicap.pet.neurotech.view.util.Leitor;

public class MenuGerente {
 
    public void Menu() {
        GerenteView cv = new GerenteView();
        int op;
        do {
            System.out.println("\n<<MENU CLIENTE>>");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Render Bonus");
            System.out.println("3 - Voltar");
            op = Leitor.getLeitor().nextInt();
            System.out.println("");
            switch (op) {
                case 1:
                    cv.criarConta();
                    break;
                case 2:
                    cv.renderBonus();
                    break;
                case 3:
                    System.out.println("Voltando!!");
                    break;
                default:
                    System.out.println("Opcao invalida!!");
            }
        } while (op != 3);

    }
}
