package Controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        String EncerrarPrograma = "";
        Scanner scan = new Scanner(System.in);

        while(!EncerrarPrograma.equalsIgnoreCase("sair")) {
            System.out.println("informe o texto");
            EncerrarPrograma = scan.nextLine();

            System.out.println("Você digitou " + EncerrarPrograma);
        }
        System.out.println("Programa Encerrado");
    }
}
