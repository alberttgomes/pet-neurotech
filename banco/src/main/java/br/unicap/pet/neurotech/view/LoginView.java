package br.unicap.pet.neurotech.view;

import java.util.Scanner;

import br.unicap.pet.neurotech.control.ClienteController;
//import br.unicap.pet.neurotech.model.dao.ClienteDAO;
import br.unicap.pet.neurotech.model.dao.Conta;

public class LoginView {
	
	//MenuCliente acessoCliente = new MenuCliente();
	ClienteController autenticar = new ClienteController();
	
	
	private boolean acesso = false;
	private Conta nomeCliente;
	private Conta senhaCliente;
	
	
	public Conta getNome() {
		return nomeCliente;
	}

	public Conta getSenha() {
		return senhaCliente;
	}
    
    public boolean Entrar(String nome, String senha) {
    	
    	try (Scanner leitor = new Scanner(System.in)) {
			System.out.println("<<AUTENTICAÇÃO>> \n");
			System.out.println("Digite seu nome: \n");
			nome = leitor.nextLine();
			System.out.println("Digite sua senha: \n");
			senha = leitor.nextLine();

	    	if (nomeCliente.equals(nome) && senhaCliente.equals(senha)) {
	    		acesso = true;
	    	    System.out.println("Entrando no perfil...");
	    	} else {
	    		System.out.println("Não encontrado!!!");
	    	} 
	 
    	}
		   	
        return acesso;
    }
}
