package Fundamentos.DesafioModuloFundamentos;

import java.util.Scanner;

public class DesafioEqucaoSegundoGrau {
	public static void main(String[] args) {
		
		double a,b,c,x1,x2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do coeficiente a");
		a = scan.nextInt();
		System.out.println("Digite o valor do coeficiente b");
		b = scan.nextInt();
		System.out.println("Digite o valor do coeficiente c");
		c = scan.nextInt();
		
		double bAoQuadrado = Math.pow(b, 2);
		
		double delta = bAoQuadrado - 4*a*c;
		
		
		String raiz = delta > 0 ? "a equação possui duas soluções reais." : "0";
		raiz = delta == 0 ? "a equação possui uma única solução real." : raiz;
		raiz = delta < 0 ? "a equação não possui solução real." : raiz;
		
		System.out.printf("O valor de delta é %.2f.\nEntão %s", delta,raiz);
		
		double denominador = 2 * a;
		
		x1 = -b + Math.sqrt(delta) / denominador;
		x2 = -b - Math.sqrt(delta) / denominador;
		
		System.out.printf("\nO valor do x1 da equação é %.2f\n", x1);
		System.out.printf("O valor do x2 da equação é %.2f", x2);
		
		
	}
}
