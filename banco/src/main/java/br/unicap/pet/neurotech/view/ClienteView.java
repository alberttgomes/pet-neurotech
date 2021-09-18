package br.unicap.pet.neurotech.view;

import br.unicap.pet.neurotech.control.ClienteController;
import br.unicap.pet.neurotech.model.exceptions.ContaInexistenteException;
import br.unicap.pet.neurotech.model.exceptions.SaldoInsuficienteException;
import br.unicap.pet.neurotech.view.util.Leitor;

public class ClienteView {

    ClienteController acesso = new ClienteController();

    public void sacar(){
        int numConta;

        System.out.println("numero da conta ");
        numConta = Leitor.getLeitor().nextInt();
        boolean haConta = acesso.buscar(numConta);

        if(haConta){
            System.out.println("Informe a quantia a Sacar: ");
            float quantia = Leitor.getLeitor().nextFloat();
            try {
                acesso.sacar(numConta,quantia);
                System.out.println("Saque realizado com sucesso");
            } catch (SaldoInsuficienteException e) {
                System.out.println("Saldo Insuficiente para o saque");
            } catch (ContaInexistenteException e) {
                System.out.println("Número de conta não existe");
            }
        } else {
            System.out.println("Conta Inexistente");
        }
    }
    
    public void depositar(){
        int numConta;

        System.out.println("numero da conta ");
        numConta = Leitor.getLeitor().nextInt();
        boolean haConta = acesso.buscar(numConta);

        if(haConta){
            System.out.println("Informe a quantia a Sacar: ");
            float quantia = Leitor.getLeitor().nextFloat();
            acesso.depositar(numConta,quantia);
        } else {
            System.out.println("Conta Inexistente");
        }
    }

    public void verSaldo() {
        int numConta;
        System.out.println("numero da conta ");
        numConta = Leitor.getLeitor().nextInt();
        boolean haConta = acesso.buscar(numConta);

        if(haConta){
            float saldo = acesso.getSaldo(numConta);
            System.out.format("o saldo da conta é %.2f",saldo);
        } else {
            System.out.println("Conta Inexistente");
        }
    }
}
