package Vetores;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int i;
        String[] listaNomes = new String[10];
        String nome;
        Scanner scan = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.println("informe um nome:");
            nome = scan.next();
            listaNomes[i] = nome;
        }

        System.out.println("Listando os nomes");
        for (i = 0; i < 10; i++) {
            System.out.println(listaNomes[i]);
        }
    }
}
