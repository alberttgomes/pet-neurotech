package br.unicap.pet.neurotech.model.dao;

public class autenticar {
    
	private boolean acesso;
	private Conta nomeCliente;
	private Conta senhaCliente;
	
	
	public Conta getNome() {
		return nomeCliente;
	}

	public Conta getSenha() {
		return senhaCliente;
	}


	//@Override
    public boolean getAcesso(Conta nome, Conta senha) {
    	acesso = false;
    	if(nome == nomeCliente && senha == senhaCliente) {
    	  acesso = true;
    	} else {
    	  System.out.println("Acesso Negado!");
    	}
    	return acesso;
    }
    
}
