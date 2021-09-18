package br.unicap.pet.neurotech.control;

import br.unicap.pet.neurotech.model.dao.ClienteDAOMemoria;
import br.unicap.pet.neurotech.model.dao.ClienteDAO;

public class GerenteController {

    private ClienteDAO dao = ClienteDAOMemoria.getInstance();
    public void criarConta(int num) {
        dao.criarConta(num);
    }
    public void renderBonus(int numConta) {
        dao.renderBonus(numConta);
    }
    public void criarContaBonus(int numConta) {
        dao.criarContaBonus(numConta);
    }
    
}
