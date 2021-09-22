package br.unicap.pet.neurotech.model.dao;

import br.unicap.pet.neurotech.model.exceptions.*;

public interface ClienteDAO {
    
    boolean buscarConta(int numConta);

    void sacarConta(int numConta, float quantia) throws SaldoInsuficienteException , ContaInexistenteException ;

    void criarConta(int numConta, String nome, String senha);

    void depositarConta(int numConta, float quantia);

    void renderBonus(int numConta);

    float getSaldo(int numConta);

	boolean buscarLogin(String nome, String senha) throws  UsuarioNaoEncontradoException;

	void criarContaBonus(int numConta, String nome, String senha);

	
}
