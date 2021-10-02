package br.unicap.pet.neurotech.model.dao;

public abstract class UsersBanco {
    private int login;
    private String senha;
	
	
    public UsersBanco(int login, String senha) {
      this.login = login;
      this.senha = senha;
    }
    
    public int getLogin(){
    	return this.login;
    }
    
    public boolean CheckSenha(String senhaC) {
    	boolean check = false;
    	if(this.senha.equals(senhaC) == true) {
    	  check = true;
    	}
    	return check;
    }
  

}
