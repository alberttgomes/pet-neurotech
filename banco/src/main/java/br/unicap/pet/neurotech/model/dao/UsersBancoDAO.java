package br.unicap.pet.neurotech.model.dao;

public interface UsersBancoDAO {
	
    boolean VerificarGerente (int login);
	boolean Senha(String senha);
	boolean AutenticarLogin(int login, String senha);
	void CriarUserGerente(int login, String senha);
	void CriarUserCliente(int login, String senha);
	boolean buscarConta(int numConta, int login);
	void criarConta(int numConta, int login);
	void renderBonus(int numConta, int login);
	void criarContaBonus(int numConta, int login);
	
}
