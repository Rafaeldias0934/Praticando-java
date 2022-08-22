package Controle.DesafioEstruturasControle;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        int numeroDigitado,maior = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o " + (i + 1) + " número");
            numeroDigitado = scan.nextInt();
            if (numeroDigitado > maior) {
                maior = numeroDigitado;
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
       // System.out.println("O menor número digitado foi:" + menor);
    }
}
