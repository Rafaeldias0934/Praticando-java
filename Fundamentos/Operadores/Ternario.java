package Fundamentos.Operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 8.6;
		//String resultadoRecuoeracao = media >= 5 ? 
		//		"em recuperação" : "reprovado";
		String resultado = media >= 7.0 ? "Aprovado" : "em recuperação";
		
		System.out.println("O Aluno está " + resultado);
	}
}
