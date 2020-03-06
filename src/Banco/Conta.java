package Banco;

public class Conta{
    protected String nomeTitular;
    protected String cpf;
    protected int numeroConta;
    protected float saldo;

    public Conta(String nomeTitular, String cpf, int numeroConta, float saldo){
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String toString(){
        return "Conta do titular: " +nomeTitular + ", portador do CPF: "+cpf+", conta:  "+numeroConta +" | SALDO ATUAL: R$ "+saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return this.saldo;
    }

    public boolean debitarConta(float valor){
        if(valor > saldo){
            return false;
        }
        else{
            saldo = saldo - valor;
            return true;
        }
    }

    public void creditarConta(float valor){
        saldo = saldo + valor;
    }


}
