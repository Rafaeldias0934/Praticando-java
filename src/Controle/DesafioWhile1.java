package Controle;

import java.util.Scanner;


public class DesafioWhile1 {
    public static void main(String[] args) {
        double qtdNotas = 0, nota = 0, soma = 0, media = 0, maior = 0;
        double encerrarPrograma = -1;
        Scanner scan = new Scanner(System.in);

        while (nota != encerrarPrograma) {
            System.out.println("Informe a sua nota");
            nota = scan.nextDouble();
            if (nota >= 0 && nota <= 10) {
                soma += nota;
                qtdNotas++;
                media = (soma / qtdNotas);
                if (nota > maior) {
                    maior = nota;
                }
            } else {
                if (nota == encerrarPrograma) {
                        System.out.println("Encerramento do programa: ");
                        System.out.println("A soma das notas foram: " + soma);
                        System.out.println("A quantidade de notas digitadas foi: " + qtdNotas);
                        System.out.printf("A média das notas digitas é: %.2f\n", media);
                        System.out.println("A Maior nota digitada foi: " + maior);
                } else {
                        System.out.println("ERRO - Digite uma nota válida!");
                }
            }
        }
    }
}


