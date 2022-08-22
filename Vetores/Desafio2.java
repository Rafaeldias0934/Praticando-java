package Vetores;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        int i, qtdNotas = 0;
        double maior = 0,menor = 0,notasDigitadas,media = 0;
        double[] notas = new double[3];
        Scanner scan = new Scanner(System.in);

        for (i = 0; i < 3; i++) {
            System.out.println("Informe a " + (i + 1) + " nota");
            notasDigitadas = scan.nextDouble();
            notas[i] = notasDigitadas;
            qtdNotas++;
            if (notasDigitadas > maior) {
                maior = notasDigitadas;
            }
            if (notasDigitadas < maior){
                menor = notasDigitadas;
            }
        }
        for (i = 0; i < 3; i++) {
            System.out.println("As notas digitadas foram " + notas[i]);
            media += notas[i] / qtdNotas;
        }

        System.out.println("\nA maior nota digitada foi: " + maior);
        System.out.println("A menor nota digitada foi: " + menor + "\n");
        System.out.println("A média das notas digitadas é: " + media);
    }
}
