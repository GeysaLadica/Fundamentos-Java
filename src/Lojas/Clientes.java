package Lojas;

public class Clientes {
    protected String nome;
    protected String email;
    protected float credito;

    public Clientes (String nome, String email, float credito){
        this.nome = nome;
        this.email = email;
        this.credito = credito;
    }

    public String toString(){
        return "CLIENTE: "+ nome+ "("+email+")"+ " Crédito = R$ "+credito;
    }

    public void setCredito(float credito){
        this.credito = credito;
    }
    public float getCredito(){
        return this.credito;
    }

    public boolean fazerCompra(float valor){
        if(valor > credito){
            return false;
        }else{
            credito = credito - valor;
            return true;
        }
    }

    public void quitarDivida(float valor){
        credito = credito + valor;
    }

}
