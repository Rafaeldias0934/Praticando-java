package Controle.DesafioEstruturasControle;


import java.util.Random;
import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        /* Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
         Armazene um numero aleatório em uma variável. O Jogador tem 10
         tentativas para adivinhar o número gerado. Ao final de cada tentativa,
         imprima a quantidade de tentativas restantes, e imprima se o número
         inserido é maior ou menor do que o número armazenado.
        */
        int numeroDigitado, qtdDeTentativas = 10;
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(100) + 1 ;
        Scanner scan = new Scanner(System.in);
        System.out.println(numeroAleatorio);

            for (int i = 10; i > 0; i--) {
                System.out.println("Digite um número para verificação");
                numeroDigitado = scan.nextInt();

                if (numeroDigitado > numeroAleatorio) {
                    System.out.println("O número digitado é maior, que o número sorteado.");
                } else if (numeroDigitado < numeroAleatorio) {
                    System.out.println("O número digitado é menor, que o número sorteado.");
                } else {
                    System.out.println("ACERTOU !! O número aleatório é " + numeroAleatorio);
                }
                qtdDeTentativas--;
                System.out.printf("Agora você tem %d tentativas.\n",qtdDeTentativas);
            }
            System.out.println("Suas tentativas acabaram, Por favor, inicie o programa novamente.");
        }
    }



