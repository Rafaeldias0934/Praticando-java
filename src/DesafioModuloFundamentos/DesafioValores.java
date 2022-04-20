package DesafioModuloFundamentos;

import java.util.Scanner;

public class DesafioValores {
	public static void main(String[] args) {
		
		double valor1,valor2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		valor1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número");
		valor2 = scan.nextDouble();
		
		double aoQuadrado = Math.pow(valor1, 2);
		double aoCubo = Math.pow(valor2, 3);
		
		System.out.println("O primeiro valor ao Quadrado é " + aoQuadrado);
		System.out.println("O segundo valor ao Cubo é " + aoCubo);
		scan.close();
	}
}
