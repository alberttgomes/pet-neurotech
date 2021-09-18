package br.unicap.pet.neurotech.model.dao;

import java.util.ArrayList;
import java.util.List;

import br.unicap.pet.neurotech.model.exceptions.ContaInexistenteException;
import br.unicap.pet.neurotech.model.exceptions.SaldoInsuficienteException;

public class ClienteDAOMemoria implements ClienteDAO {

    private List<Conta> contas;
    private static ClienteDAOMemoria self;


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
    public void criarConta(int numConta) {
        boolean b = buscarConta(numConta);
        if (!b){
            Conta c = new Conta(numConta);
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
    public void criarContaBonus(int numConta) {
        boolean b = buscarConta(numConta);
        if (!b){
            contas.add(new ContaBonus(numConta));
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
}
