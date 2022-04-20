package DesafioModuloFundamentos;
import java.util.Scanner;

public class DesafioCelsiusFahrenheit {
	public static void main(String[] args) {
		
		double temperaturaCelsius;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua temperatura em graus °C");
		temperaturaCelsius = scan.nextDouble();
		
		double formula = (temperaturaCelsius * 1.8 + 32);
		
		System.out.printf("A sua temperatura em Fahrenheit é: %.1f", formula);
		scan.close();
	}
}
