package Fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "@@@");
		System.out.println(s.startsWith("Boa")); // s. começa com(?)
		System.out.println(s.toLowerCase().startsWith("boa")); //s. transforma tudo pra minuscula()
																//	começa com(?)
		System.out.println(s.toUpperCase().endsWith("TARDE"));//s. transforma tudo pra maiuscula()
															 //começa com(?)
		System.out.println(s.length()); // Comprimento
		System.out.println(s.toLowerCase().equals("boa tarde"));//s. transforma tudo pra minuscula()
																//	compara o valor da String(?). obs Letra e o tipo
		System.out.println(s.equalsIgnoreCase("boa tarde"));//não considera letras minusculas e maiusculas().
		
		
		var nome = "Rafael";
		var sobrenome = "Dias";
		var salario = 12345.987;
		var idade = 33;
		
		System.out.println("Nome: " + nome + "\n Sebrenome: " + sobrenome + "\n idade: " + idade + "\n Salário " + salario);
		
		System.out.printf("O senhor %s %s, tem %d anos de idade e ganha R$%.2f", nome,sobrenome,idade,salario);
		
		String frase = String.format("\nO senhor %s %s, tem %d anos de idade e ganha R$%.2f", nome,sobrenome,idade,salario);
		System.out.println(frase);
		
		System.out.println("Qualquer frase".contains("Qual"));
		System.out.println("frase qualquer".indexOf("qual"));
		System.out.println("frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		 
	}
}
