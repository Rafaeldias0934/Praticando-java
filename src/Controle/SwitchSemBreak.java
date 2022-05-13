package Controle;

import java.util.Locale;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "amarela";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o bassai-Dai...");
            case "marron":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
            default:
                System.out.println("Não sei Nada");
        }
        int idade = 2;
        switch (idade) {
            case 3:
                System.out.println("Sabe programar");
            case 2:
                System.out.println("Sabe andar");
            case 1:
                System.out.println("Sabe falar");
            case 0:
                System.out.println("Sabe respirar");
            default:
                System.out.println("Não sabe nada");
        }
    }
}
