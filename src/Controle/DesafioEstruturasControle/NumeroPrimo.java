package Controle.DesafioEstruturasControle;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        // Criar um programa que receba um número e diga se ele é um número primo.
        int numero, divisores = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número para verificação");
        numero = scan.nextInt();

        for (int cont = 2; cont < numero; cont++) {
            if (numero % cont == 0) {
                divisores++;
                System.out.println(cont);
            }
        }
        if (divisores == 2) {
            System.out.println("É primo.");
        } else {
            System.out.println("Não é primo");
        }
    }
}

/*
int numeroPrimo = 1;
        Scanner scan = new Scanner(System.in);


        while(numeroPrimo >= 1) {
            System.out.println("Informe um número para verificação");
            numeroPrimo = scan.nextInt();
            if (numeroPrimo == 1) {
                System.out.println("Não é primo.");
                numeroPrimo++;
            } else if (numeroPrimo == 2) {
                System.out.println("É primo!");
            } else if (numeroPrimo == 3) {
                System.out.println("É primo!");
            } else if (numeroPrimo == 5) {
                System.out.println("É primo!");
            } else if (numeroPrimo == 7) {
                System.out.println("É primo!");
            } else if (numeroPrimo % 2 == 0) {
                System.out.println("Não é primo.");
            } else if (numeroPrimo % 3 == 0) {
                System.out.println("Não é primo.");
            } else if (numeroPrimo % 5 == 0) {
                System.out.println("Não é primo.");
            } else {
                System.out.println("É primo!");
            }
        }
 */