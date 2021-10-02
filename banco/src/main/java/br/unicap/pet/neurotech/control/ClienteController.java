package br.unicap.pet.neurotech.control;

import br.unicap.pet.neurotech.model.dao.ClienteDAO;
import br.unicap.pet.neurotech.model.dao.ContaDAODataBase;
import br.unicap.pet.neurotech.model.exceptions.ContaInexistenteException;
import br.unicap.pet.neurotech.model.exceptions.SaldoInsuficienteException;



public class ClienteController {

    private ClienteDAO dao = (ClienteDAO) ContaDAODataBase.getInstance();
  

    public boolean buscar (int login, int numConta){
        return dao.buscarConta(login, numConta);
    }

    public void sacar(int login, int numConta, float quantia) throws SaldoInsuficienteException, ContaInexistenteException {
        dao.sacarConta(login, numConta, quantia);
    }

    public void depositar(int login, int numConta, float quantia) {
        dao.depositarConta(login, numConta, quantia);
    }

    public float getSaldo(int login, int numConta) {
        return dao.getSaldo(login, numConta);
    }
    
    
}
