package br.unicap.pet.neurotech.model.dao;

import java.util.ArrayList;
import java.util.List;

import br.unicap.pet.neurotech.model.exceptions.ContaInexistenteException;
import br.unicap.pet.neurotech.model.exceptions.SaldoInsuficienteException;
//import br.unicap.pet.neurotech.model.exceptions.UsuárioNaoEncontradoException;
import br.unicap.pet.neurotech.model.exceptions.UsuarioNaoEncontradoException;

public class ClienteDAOMemoria implements ClienteDAO {

    private List<Conta> contas;
    private static ClienteDAOMemoria self;
    private static ClienteDAOMemoria login;

    private ClienteDAOMemoria(){
        contas = new ArrayList<Conta>();
    }

    @Override
    public boolean buscarConta(int numConta) {
        boolean encontrado = false;
        for (Conta conta : contas) {
            if (conta.getNumero()== numConta){
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static ClienteDAO getInstance() {
        if (self == null){
            self = new ClienteDAOMemoria();
        }
        return self;
    }
    
    public static ClienteDAO getInstanceLogin(String nome, String senha) {
    	if(login == null) {
    		login = new ClienteDAOMemoria();
    	}
    	return login;
    }

    @Override
    public void sacarConta(int numConta, float quantia) throws SaldoInsuficienteException, ContaInexistenteException {
        for (Conta conta : contas) {
            if (conta.getNumero()== numConta){
                conta.sacar(quantia);
            }
        }
        throw new ContaInexistenteException();
    }

    @Override
    public void depositarConta(int numConta, float quantia) {
        for (Conta conta : contas) {
            if (conta.getNumero()== numConta){
                conta.depositar(quantia);
            }
        }
    }

    
	@Override
    public void criarConta(int numConta, String nome, String senha) {
        boolean b = buscarConta(numConta);
        if (!b){
            Conta c = new Conta(numConta, nome, senha);
            contas.add(c);
        }
    }

    @Override
    public void renderBonus(int numConta){
        for (Conta conta : contas) {
            if (conta.getNumero() == numConta){
                if (conta instanceof ContaBonus){
                    ((ContaBonus)conta).renderBonus();
                }
                return;
            }
        }
    }

    
	@Override
    public void criarContaBonus(int numConta, String nome, String senha) {
        boolean b = buscarConta(numConta);
        if (!b){
            contas.add(new ContaBonus(numConta, nome, senha));
        }
    }

    @Override
    public float getSaldo(int numConta) {
        for (Conta conta : contas) {
            if (conta.getNumero()== numConta){
                return conta.getSaldo();
            }
        }
        return -1;
    }
    
    @Override
  	public boolean buscarLogin(String nome, String senha) throws  UsuarioNaoEncontradoException {
  		boolean autenticar = false;
  		if(login.equals(nome) && login.equals(senha)) {
  			autenticar = true;
  		} else {
  			throw new  UsuarioNaoEncontradoException();		
  		}
  	
  		return autenticar;
  	}

	
}









