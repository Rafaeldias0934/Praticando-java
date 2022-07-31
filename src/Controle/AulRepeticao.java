package Controle;

public class AulRepeticao {
    public static void main(String[] args) {
        int x = 0, soma = 0;

        while (x <= 7) {
            x++;
            soma += x + 1;
            //soma = soma + x + 1;
        }
        System.out.println("x = " + x + " soma = " + soma);

    }
}
