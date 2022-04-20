package DesafioModuloFundamentos;
import java.util.Scanner;

public class DesafioAreaTriangulo {
	public static void main(String[] args) {
		
		double area,base,altura;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do Trinagulo (cm²)");
		base = scan.nextDouble();
		
		System.out.println("Digite o valor da altura do triangulo (cm²)");
		altura = scan.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.println("O valor a area do triangulo é " + area + "cm²");
		scan.close();
				
	}
}
