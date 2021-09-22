package br.unicap.pet.neurotech.view;

import java.util.Scanner;

import br.unicap.pet.neurotech.control.ClienteController;
//import br.unicap.pet.neurotech.model.dao.ClienteDAO;
import br.unicap.pet.neurotech.model.dao.Conta;
import br.unicap.pet.neurotech.model.exceptions.UsuarioNaoEncontradoException;

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
    
    public boolean Entrar() throws UsuarioNaoEncontradoException {
    	   String nomeL;
    	   String senhaL;
    	 
    	try (Scanner leitor = new Scanner(System.in)) {
			System.out.println("<<AUTENTICAÇÃO>> \n");
			System.out.println("Digite seu nome: \n");
			nomeL = leitor.nextLine();
			System.out.println("Digite sua senha: \n");
			senhaL = leitor.nextLine();
            
			autenticar.entrar(nomeL, senhaL);
			
	   	} 
    	   System.out.println("Usuário não foi encontrado!!");
		   	
        return acesso;
    }
}
