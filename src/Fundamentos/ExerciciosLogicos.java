package Fundamentos;

public class ExerciciosLogicos {
	public static void main(String[] args) {
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = false;
		
		boolean comprarTV50 = trabalhoTerca && trabalhoQuinta;
		boolean comprarTV32 = trabalhoTerca  ^ trabalhoQuinta;
		boolean comprarSorvete = trabalhoTerca || trabalhoQuinta;
		boolean maisSaudavel = !comprarSorvete;
		
		System.out.println("Comprar TV de 50 ? " + comprarTV50);
		System.out.println("Comprar TV de 32 ? " + comprarTV32);
		System.out.println("Comprar a TV de 32 e comprar Sorvete? " + comprarSorvete);
		System.out.println("maisSaudavel ? " + maisSaudavel);
	}
}
