package br.unicap.pet.neurotech.model.dao;

import br.unicap.pet.neurotech.model.exceptions.*;

public interface ClienteDAO {
    
    boolean buscarConta(int login, int numConta);

    void sacarConta(int login, int numConta, float quantia) throws SaldoInsuficienteException , ContaInexistenteException ;

    void depositarConta(int login, int numConta, float quantia);

    void renderBonus(int login, int numConta);

    float getSaldo(int login, int numConta);

	void criarContaBonus(int login, int numConta);

	void criarConta(int login, int numConta);


	
}
