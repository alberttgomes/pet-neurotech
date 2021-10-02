package br.unicap.pet.neurotech.control;

import br.unicap.pet.neurotech.model.dao.ContaDAODataBase;
//import br.unicap.pet.neurotech.model.dao.UsersBancoDAO;
//import br.unicap.pet.neurotech.model.dao.ClienteDAO;
import br.unicap.pet.neurotech.model.dao.UsersBancoDAO;

public class GerenteController {

    private UsersBancoDAO dao = (UsersBancoDAO) ContaDAODataBase.getInstance();
    
    
    public boolean buscar(int numConta, int login) {
    	 return dao.buscarConta(numConta, login);
    }
    
    public void criarConta(int numConta, int login) {
        dao.criarConta(numConta, login);
    }
    
    public void renderBonus(int numConta, int login) {
        dao.renderBonus(numConta, login);
    }
    
    public void criarContaBonus(int numConta,int login) {
        dao.criarContaBonus(numConta, login);
    }
    
}
