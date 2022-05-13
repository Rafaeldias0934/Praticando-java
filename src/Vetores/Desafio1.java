package Vetores;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        int i,soma = 0, numerosDigitado=0;
        int[] armazenamento = new int[10];
        Scanner scan = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.println("Informe o " + (i + 1) + "° número");
            numerosDigitado = scan.nextInt();
            armazenamento[i] = numerosDigitado;
            soma += armazenamento[i];
        }
        for (i = 0; i < 10; i++) {
            System.out.println("O número digitado foi: " + armazenamento[i]);
        }
        System.out.println("A soma desses valores é: " + soma);
    }
}
