package Fundamentos.Operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		double numA,denA,numB,denB,superiorA,superiorB,superior,inferior,resultado;
		
		numA = Math.pow(6 * (3 + 2), 2);
		denA = 3 * 2;
		
		superiorA = numA / denA;
		
		System.out.println("O primeiro resultado é " + superiorA);
		
		numB = (1 - 5) * (2 - 7);
		denB =  2;
		
		superiorB = Math.pow(numB / denB, 2);
		
		System.out.println(superiorB);	
		
		superior = Math.pow(superiorA - superiorB, 3);
		inferior = Math.pow(10, 3);
		
		resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);
		
		
		
	}
}
