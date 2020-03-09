package Banco;

public class PIbankTest {

    public static void main(String [] args){
        Conta conta;
        ContaEspecial contaEspecial;
        String debitoRealizado = "Debitado com sucesso!";
        String debitoImpossibilitado = "Não foi possível realizar a operação. Saldo insuficiente! Adicione créditos a sua conta e continue usando nossos serviços.";

        conta = new Conta("Joana Souza","0000", 521,100);
        contaEspecial = new ContaEspecial("Marcela Assis","0001",235,100,200);

        System.out.println(conta);
        System.out.println(contaEspecial);

        //Teste de Débito

        if(conta.debitarConta(50)){
            System.out.println(debitoRealizado);
        }
        else {
            System.out.println(debitoImpossibilitado);
        }

        if(contaEspecial.debitarConta(500)){
            System.out.println(debitoRealizado);
        }
        else {
            System.out.println(debitoImpossibilitado);
        }
    }
}
