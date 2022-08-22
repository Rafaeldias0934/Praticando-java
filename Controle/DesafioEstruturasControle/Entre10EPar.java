

package Controle.DesafioEstruturasControle;

import java.util.Scanner;

public class Entre10EPar {
    public static void main(String[] args) {
        // 1. Criar um programa que receba um número
        // e verifique se ele está entre 0 e 10 e é par;

        int numero = 0;
        Scanner scan = new Scanner(System.in);

        while (numero >= 0 && numero <= 10) {
            System.out.println("Informe um número");
            numero = scan.nextInt();
            if (numero % 2 == 0 && numero >= 0 && numero <= 10) {
                System.out.println("O número informado é Par e está entre 0 e 10.");
            } else if (numero % 2 == 1) {
                System.out.println("O número é impar e está entre 0 e 10");
            } else {
                System.out.println("O número não está entre 0 e 10");
            }
        }
    }
}
