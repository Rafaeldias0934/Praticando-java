package Controle;

import java.util.Scanner;

public class SequenciaLogica {
    public static void main(String[] args) {
        int x,y,i,aux = 0;
        String quebraLinha = "\n";
        String espaco = " ";
        Scanner scan = new Scanner(System.in);

        x = scan.nextInt();
        y = scan.nextInt();


        for (i = 1; i <= y;++i) {
            System.out.printf("%d",i);
            aux += 1;
            if (aux == x) {
                System.out.printf("%s",quebraLinha);
                aux = 0;
            } else if (y != i){
                    System.out.printf("%s",espaco);
            }
        }
    }
}
