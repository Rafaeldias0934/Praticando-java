package Controle.DesafioEstruturasControle;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        // Criar um programa que informa se o ano atual é um ano Bissexto.

        int ano = 0;
        Scanner scan = new Scanner(System.in);

        while (ano < 2023) {
            System.out.println("Informe o ano atual");
            ano = scan.nextInt();
            if (ano % 4 == 0) {
                System.out.printf("O ano: %d, é um ano Bissexto.\n", ano);
                ano++;
            } else if (ano % 4 > 0 && ano < 2023) {
                System.out.printf("O ano: %d, Não é um ano Bissexto.\n", ano);
            } else {
                System.out.printf("Ainda não chegamos no ano de %d.\n", ano);
            }
        }
    }
}




