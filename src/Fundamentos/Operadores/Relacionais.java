package Fundamentos.Operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		
		System.out.println(a == b);
		
		System.out.println(4 > 5);
		System.out.println(2 >= 3);
		System.out.println(8 < 5);
		System.out.println(8 <= 8);
		System.out.println(1 == 3);
		System.out.println(8 != 8);
		
		double nota = 6.8;
		boolean bomComportamento = true;
		boolean temDesconto = bomComportamento && nota >= 7.0;
		
		System.out.println("Tem Desconto ? " + temDesconto);
	}
}
