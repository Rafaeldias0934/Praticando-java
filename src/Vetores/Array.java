package Vetores;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int i, num;
        int[] numeros = new int[5];
        Scanner scan = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.println("Informe um número");
            num = scan.nextInt();
            numeros[i] = num;
        }

        System.out.println("Listando od numeros de forma inversa");
        for (i = 4; i >= 0 ; i--) {
            System.out.println(numeros[i]);
        }
    }
}
