package Fundamentos.Operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2" );
		
		String a = new String("2");
		System.out.println("2" == a);
		System.out.println("2".equals(a));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals( s2.trim()));
		
	}
}
