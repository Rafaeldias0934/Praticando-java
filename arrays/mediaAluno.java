package arrays;

import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {

        int tamanho, i;
        double notasDigitadas,soma = 0, media = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas que o programa deve receber");
        tamanho = scan.nextInt();

        double[] notas = new double[tamanho];

        for (i = 0; i < tamanho; i++) {
            System.out.println("Digite a " + (i + 1) + " nota");
            notasDigitadas = scan.nextDouble();
            notas[i] = notasDigitadas;

        }
        for (double nota: notas) {
            soma += nota;
            media = (soma / tamanho);
        }

        System.out.println("A média das notas digitadas é: " + media);

    }
}
