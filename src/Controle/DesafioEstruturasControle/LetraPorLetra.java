package Controle.DesafioEstruturasControle;

import java.util.Scanner;

public class LetraPorLetra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a palavra desejada");
        String s = scan.next();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
