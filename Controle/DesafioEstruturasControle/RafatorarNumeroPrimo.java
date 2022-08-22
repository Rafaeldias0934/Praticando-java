package Controle.DesafioEstruturasControle;

import java.util.Scanner;

public class RafatorarNumeroPrimo {
    public static void main(String[] args) {
        // Refatorar o exercício 04, utilizando a estrutura switch.
        int numeroPrimo, qtdDivisores = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número");
        numeroPrimo = scan.nextInt();

        for (int cont = 2; cont < numeroPrimo ; cont++) {
            if (numeroPrimo % cont == 0) {
                qtdDivisores++;
                System.out.println(cont);
            }
        }
        switch (qtdDivisores) {
            case 0:
                System.out.println("É primo");
                break;
            default:
                System.out.println("Não é primo");
                break;
        }
    }
}
