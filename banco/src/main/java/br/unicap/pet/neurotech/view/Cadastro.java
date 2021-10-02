package br.unicap.pet.neurotech.view;

import br.unicap.pet.neurotech.view.util.Leitor;

public class Cadastro {
    

	int op; 
	 
	public void cadastrar() {
	   System.out.println("1 - Cadastrar cliente");
	   System.out.println("2 - Cadastrar gerente");
	   op =  Leitor.getLeitor().nextInt();
	     switch(op) {
	          case 1:
	        	  
	     }
	}
	
	
}
