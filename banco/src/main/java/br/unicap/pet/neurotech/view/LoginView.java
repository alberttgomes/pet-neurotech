package br.unicap.pet.neurotech.view;

import java.util.Scanner;

import br.unicap.pet.neurotech.control.ClienteController;
//import br.unicap.pet.neurotech.model.dao.ClienteDAO;
import br.unicap.pet.neurotech.model.exceptions.UsuarioNaoEncontradoException;

public class LoginView {
	
	MenuCliente acessoCliente = new MenuCliente();
	ClienteController autenticar = new ClienteController();
	String nomeL;
    String senhaL;
    boolean haUser = false;
    
    public void Entrar() throws UsuarioNaoEncontradoException {
    	 
    	try (Scanner leitor = new Scanner(System.in)) {
			System.out.println("<<AUTENTICAÇÃO>> \n");
			System.out.println("Digite seu nome: \n");
			nomeL = leitor.nextLine();
			System.out.println("Digite sua senha: \n");
			senhaL = leitor.nextLine();
            haUser =  autenticar.entrar(nomeL, senhaL);
			
            if(haUser) {
				System.out.println("Entrando...");
				acessoCliente.Menu();
			}
			    System.out.println("Usuário não foi encontrado!!");
		} 
    }
}
