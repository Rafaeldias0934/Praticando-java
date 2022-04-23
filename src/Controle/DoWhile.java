package Controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // if(...) sentença; ou {}
        // while(...) setença; ou {}
        //for(...;...;...) sentenca; ou {}

        // do sentenca; ou {} while(...);

        Scanner scan = new Scanner(System.in);
        String valor = "";
        do {
            System.out.println("Você precisa falar as palavras mágicas");
            System.out.println("Quer sair ?");
            valor = scan.nextLine();
        } while(!valor.equalsIgnoreCase("por favor"));
        System.out.println("Obrigado");
    }
}
