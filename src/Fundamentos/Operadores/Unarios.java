package Fundamentos.Operadores;
/*
public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		//Incremento pós fixado
		a++;// a = a + 1;
		a--;// a = a - 1; 
		
		//Incremento pré fixado
		
		++b; //b = b + 1;
		--b; // b = b -1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desifio");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
*/

public class Unarios {
	public static void main(String[] args) {
		int[] vet = new int[10];
		
		for (int i = 0; i < 10; i++) {
			vet[i] = i*3;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Valor " + i + ": " + vet[i]);
		}
	}
}