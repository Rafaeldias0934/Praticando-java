package DesafioModuloFundamentos;

import java.util.Scanner;

public class DesafioFahrenheitCelsius {
	public static void main(String[] args) {
		
		double temperaturaFahrenheit;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua temperatura em Fahrenheit");
		temperaturaFahrenheit = scan.nextDouble();
		
		double formula = (temperaturaFahrenheit - 32) * 5/9;
		
		System.out.printf("A sua temperatura em graus °F é: %.1f", formula);
		scan.close();
	}
}
