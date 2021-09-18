package br.unicap.pet.neurotech.model.dao;

public class ContaBonus extends Conta {
    
    private float bonus; 
    public ContaBonus(int num) {
        super(num);
        bonus = 0;
    }

    @Override
    public void depositar(float quantia) {
        bonus = (float) (bonus + (quantia*0.01));
        super.depositar(quantia);
    }

    public void renderBonus(){
        super.depositar(bonus);
        bonus = 0;
    }

    
}
