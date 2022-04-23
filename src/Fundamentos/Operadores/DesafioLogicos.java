package Fundamentos.Operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		/* Trabalho na terça (V ou F)
		 * Trabalho na quinta (V ou F)
		 * 
		 * Se o Dois trabalhos derem certo, comprarei uma tv50polegadas no FDS
		 * Se apenas um dos trabalhos derem certo, comprarei uma tv de 32polegadas
		 * Comprando uma a TV50 ou TV32, tomaremos sorvete no shooping
		 * caso nenhum dos trabalhos não derem certos, ficaremos em casa, com fome :(
		 */
	
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = false;
		
	
		boolean comprouTv50 = trabalhoTerca && trabalhoQuinta;
		boolean comprouTv32 = trabalhoTerca ^ trabalhoQuinta;
		boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
	
		System.out.println("Comprou a TV de 50? "+ comprouTv50);
		System.out.println("Comprou a TV de 32? "+ comprouTv32);
		System.out.println("Comprou TV de 32\"Sorvete? "+ comprouSorvete);
		
		boolean maisSaudavel = !comprouSorvete;
		System.out.println("Mais saudável? "+ maisSaudavel);
	}
}
