package Lojas;

public class Lojas {
    public static void main(String args []){
        Clientes[] clientes;

        clientes = new Clientes[2];

        clientes [0] = new Clientes("Isidro","is@gmail.com",100);
        clientes [1] = new ClientesVIP("geysa","ge@gmail.com",100,300);

        //System.out.println(c);
        for(Clientes c: clientes){
            System.out.println(c);
        }

        //compra do cliente [1]

        if(clientes[1].fazerCompra(300)){
            System.out.println("Compra realizada com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente!");
        }

        System.out.println(clientes[1]);

    }
}
