package br.unicap.pet.neurotech.control;

import br.unicap.pet.neurotech.model.dao.UsersBancoDAO;
import br.unicap.pet.neurotech.model.dao.UsersBancoMemoria;


public class AdminController {
   
	public UsersBancoDAO dao = UsersBancoMemoria.getInstance();
	
	public boolean AutenticarLogin(int login, String senha) {
		return dao.AutenticarLogin(login, senha);
	}
	
	public boolean AutenticarGerente (int login, String senha) {
		return AutenticarGerente(login, senha);
	}
	
	public boolean Senha (String senha) {
		return dao.Senha(senha);
	}
	
	public void CriarUserGerente(int login, String senha) {
		dao.CriarUserGerente(login,senha);
	}
	
	public void CriarUserCliente(int login, String senha) {
		dao.CriarUserCliente(login,senha);
	}
	
	
}
