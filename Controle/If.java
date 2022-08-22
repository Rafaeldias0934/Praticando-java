package Controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        double media;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua média");
        media = scan.nextDouble();

        boolean mediaAtingida = media >= 7 && media <= 10;
        if (mediaAtingida) {
            System.out.println("Aprovado!");
            System.out.println("Parabens!!");
        }
        boolean mediaNaoAtingida = media < 7 && media >= 0;
        if(mediaNaoAtingida) {
            System.out.println("reprovado.");
            System.out.println("Estudar mais!!");
        }

    }
}
