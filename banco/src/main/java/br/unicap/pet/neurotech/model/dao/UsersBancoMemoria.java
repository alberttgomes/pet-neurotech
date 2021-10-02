package br.unicap.pet.neurotech.model.dao;

import java.util.ArrayList;
import java.util.List;

public class UsersBancoMemoria implements UsersBancoDAO {

    private List<UsersBanco> UsersBanco;
    private static UsersBancoMemoria self;
    
    public UsersBancoMemoria() {
        UsersBanco = new ArrayList<UsersBanco>();
    }

    public static UsersBancoDAO getInstance() {
        if (self == null) {
            self = new UsersBancoMemoria();
        }
        return self;
    }

	@Override
	public boolean VerificarGerente(int login) {
		boolean check = false;
		if(UsersBanco.isEmpty() == false) {
			for(UsersBanco usersbanco : UsersBanco ) {
				if(usersbanco.getLogin() == login) {
					check = true;
				}
			}
		}
		return check;
	}

	@Override
	public boolean Senha(String senha) {
		boolean check = false;
		if(UsersBanco.isEmpty() == false) {
			for(UsersBanco usersbanco : UsersBanco) {
				check = usersbanco.CheckSenha(senha);
			}
		}
		return check;
	}

	@Override
	public boolean AutenticarLogin(int login, String senha) {
		boolean check = false;
		if(UsersBanco.isEmpty() == false) {
			for(UsersBanco usersbanco : UsersBanco) {
				if(usersbanco.getLogin() == login) {
					check = true;
				}
			}
		}
		return check;
	}

	@Override
	public void CriarUserGerente(int login, String senha) {
		GerenteUser cria = new GerenteUser(login, senha);
		UsersBanco.add(cria);
	}

	@Override
	public void CriarUserCliente(int login, String senha) {
		ClientUser cria = new ClientUser(login, senha);
        UsersBanco.add(cria);
	}

	@Override
	public boolean buscarConta(int numConta, int login) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void criarConta(int numConta, int login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderBonus(int numConta, int login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void criarContaBonus(int numConta, int login) {
		// TODO Auto-generated method stub
		
	}


}
