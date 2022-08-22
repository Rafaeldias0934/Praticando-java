package Fundamentos;
import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		double x,y;
		String op;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1° número");
		x = scan.nextDouble();
		
		System.out.println("Digite o 2° número");
		y = scan.nextDouble();
		
		System.out.println("Digite a operação. Ex: +,-,*,/,%");
		op = scan.next();
		
		double resultado = "+".equals(op) ? x + y : 0;
		resultado = "-".equals(op) ? x - y : resultado;
		resultado = "*".equals(op) ? x * y : resultado;
		resultado = "/".equals(op) ? x / y : resultado;
		resultado = "%".equals(op) ? x % y : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",x,op,y,resultado);
		scan.close();
		
	}
}
