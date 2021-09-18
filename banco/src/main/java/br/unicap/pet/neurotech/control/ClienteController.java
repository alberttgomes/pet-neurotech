package br.unicap.pet.neurotech.control;

import br.unicap.pet.neurotech.model.dao.ClienteDAO;
import br.unicap.pet.neurotech.model.dao.ClienteDAOMemoria;
import br.unicap.pet.neurotech.model.exceptions.ContaInexistenteException;
import br.unicap.pet.neurotech.model.exceptions.SaldoInsuficienteException;

public class ClienteController {

    private ClienteDAO dao = ClienteDAOMemoria.getInstance();
    //private ClienteDAO dao = new ClienteDAOMemoria();

    public boolean buscar (int numConta){
        return dao.buscarConta(numConta);
    }

    public void sacar(int numConta, float quantia) throws SaldoInsuficienteException, ContaInexistenteException {
        dao.sacarConta(numConta,quantia);
    }

    public void depositar(int numConta, float quantia) {
        dao.depositarConta(numConta,quantia);
    }

    public float getSaldo(int numConta) {
        return dao.getSaldo(numConta);
    }
}
