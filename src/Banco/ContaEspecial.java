package Banco;

public class ContaEspecial extends Conta {

    private float limiteAdicional;

    public ContaEspecial(String nomeTitular, String cpf, int numeroConta, float saldo, float limiteAdicional){
        super(nomeTitular, cpf, numeroConta, saldo);
        this.limiteAdicional = limiteAdicional;
    }

    public String toString(){
        return "(Conta Especial) " + super.toString()+ " com Limite Adicional: R$ "+limiteAdicional;
    }

    public void setLimiteAdicional(float limiteAdicional){
        this.limiteAdicional = limiteAdicional;
    }
    public float getLimiteAdicional(){
        return this.limiteAdicional;
    }

    public boolean debitarConta(float valor){
        if(valor > super.getSaldo() + limiteAdicional){
            return false;
        }
        else {
            super.setSaldo(super.getSaldo()- valor);
            return true;
        }
    }
}
