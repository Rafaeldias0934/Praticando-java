package Vetores;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        int i, tamanho;
        Scanner scan = new Scanner(System.in);


        System.out.println("informe o tamanho do Array");
        tamanho = scan.nextInt();

        int[] impares = new int[tamanho];

        for (i = 1; i < tamanho; i+=2) {
            impares[i] = i;
        }
        for (i = 1; i < tamanho; i+=2) {
            System.out.println(impares[i]);
        }
    }
}
