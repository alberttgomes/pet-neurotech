package br.unicap.pet.neurotech.model.dao;

import br.unicap.pet.neurotech.model.exceptions.SaldoInsuficienteException;

public class Conta {

    private int numConta;
    private float saldo;
    private String nome;
    private String senha;
    
    public Conta(int num){
        saldo = 0;
        numConta = num;
    }
    
    public int getNumero() {
        return numConta;
    }

    public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}


	public void sacar(float quantia) throws SaldoInsuficienteException {
        if (saldo > quantia){
            saldo = saldo - quantia;
        } else {
            throw new SaldoInsuficienteException();
        }
    }
    
    public void depositar(float quantia) {
        saldo = saldo + quantia;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
   
}
