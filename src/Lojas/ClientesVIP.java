package Lojas;

public class ClientesVIP extends Clientes {
    private float creditoExtra;

    public ClientesVIP(String nome, String email, float credito, float creditoExtra){
        super(nome, email, credito);
        this.creditoExtra = creditoExtra;
    }

    public String toString(){
        return "(VIP) "+super.toString()+" Crédito Extra R$ "+ creditoExtra;
    }

    public boolean fazerCompra( float valor){
        if(valor > creditoExtra + super.getCredito()){
            return false;
        }else{
            super.setCredito(super.getCredito() - valor);
            return true;
        }
    }
}
