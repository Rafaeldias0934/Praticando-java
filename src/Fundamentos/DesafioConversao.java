package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		String valor1,valor2,valor3;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu primeiro salário:");
		valor1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o valor do seu segundo salário:");
		valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o valor do seu terceiro salário:");
		valor3 = entrada.nextLine().replace(",", ".");
		
		float n1 = Float.parseFloat(valor1);
		float n2 = Float.parseFloat(valor2);
		float n3 = Float.parseFloat(valor3);
		
		entrada.close();
		
		float soma = n1 + n2 + n3;
		
		System.out.println("Soma é " + soma);
		System.out.println("Média é " + soma / 3);
	}
}
