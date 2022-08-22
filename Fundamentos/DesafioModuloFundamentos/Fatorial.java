package Fundamentos.DesafioModuloFundamentos;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int numero,fatorial = 1, i = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número positivo");
        numero = scan.nextInt();
        while (i <= numero){
         fatorial *= i;
         i++;
        }
        System.out.println(numero + "!=" + fatorial);
    }
}
