package Lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MeuTesteOrdenado {
    public static void main(String args[]){

        ArrayList<String> listaNomes = new ArrayList<String>();

        listaNomes.add("Zelia");
        listaNomes.add("Isidro");
        listaNomes.add("Adriano");
        listaNomes.add("Jose");
        listaNomes.add("Pedro");

        System.out.println("**** IMPRIMINDO A LISTA ****");

        Collections.sort(listaNomes);
        for(String player: listaNomes){
            System.out.println("Nome = " + player);
        }

        /* fristPlayer  = "aose";
        String secondPlayer = "csidro";
        System.out.println("Resultado da comparacao: " + fristPlayer.compareTo(secondPlayer));*/


    }
}
