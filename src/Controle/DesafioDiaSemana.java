package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        String diaDaSemana;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o dia da semana");
        diaDaSemana = scan.next();

        if (diaDaSemana.equalsIgnoreCase("Domingo")) {
            System.out.println("1");
        } else if (diaDaSemana.equalsIgnoreCase("Segunda")) {
            System.out.println("2");
        } else if (diaDaSemana.equalsIgnoreCase("Terça")) {
            System.out.println("3");
        } else if (diaDaSemana.equalsIgnoreCase("Quarta")) {
            System.out.println("4");
        } else if (diaDaSemana.equalsIgnoreCase("Quinta")) {
            System.out.println("5");
        }else if (diaDaSemana.equalsIgnoreCase("Sexta")) {
            System.out.println("6");
        } else if (diaDaSemana.equalsIgnoreCase("Sábado")) {
            System.out.println("7");
        } else {
            System.out.println("Dia Invalid");
        }
    }
}
