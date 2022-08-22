package Controle;

import java.util.Scanner;

public class switchComBreak {
    public static void main(String[] args) {


        String conceito = "";
        int nota;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a nota");
        nota = scan.nextInt();

        switch(nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;
            case 4: case 3:
                conceito = "D";
                break;
            case 2: case 1:
                conceito = "E";
                break;
            default:
                conceito = "Conceito não informado!";
        }
        System.out.println("Conceito é " + conceito);
        scan.close();
    }
}
