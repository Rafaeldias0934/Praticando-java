package Fundamentos;

import java.util.Scanner;

public class MetodosNextIntNextDouble {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		int idade = teclado.nextInt();
		teclado.nextLine(); // lê "\\n" que o teclado.nextInt() deixa para trás.
		System.out.println("Qual o seu nome?");
		String nome = teclado.nextLine();
		System.out.println("Qual o seu sobrenome");
		String sobrenome = teclado.nextLine();
		
		teclado.close();
		
		System.out.printf("Tenho %d e me chamo %s %s", idade,nome,sobrenome);
	}
}
