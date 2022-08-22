package Fundamentos.DesafioModuloFundamentos;
import java.util.Scanner;

public class DesafioIMC {
	public static void main(String[] args) {
		
		double peso,altura;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu peso em Kg");
		peso = scan.nextDouble();
		
		System.out.println("Digite sua altura em m");
		altura = scan.nextDouble();
		
		double squared = Math.pow(altura,2);
		double formula = peso / squared;
		
		
		String imc = formula < 18.5 ? "Abaixo do peso": "0";
		imc = formula >= 18.5 ? "Normal": imc;
		imc = formula >= 25.0 ? "Sobrepeso": imc;
		imc = formula >= 30.0 ? "Obeso": imc;
		imc = formula >= 40.0 ? "Super Obeso": imc;
		
		System.out.printf("Seu IMC é: %.1f. Você está %s. ",formula,imc);
		scan.close();
	}
}
