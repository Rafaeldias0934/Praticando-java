package Fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double tempFahrenheit= 150;
		final double ajuste = 32;
		final double fator = 5/9.0;
		double grauCelsius;
		
		grauCelsius = (tempFahrenheit - ajuste) * fator;
		
		System.out.println("O valor da temperatura Fahrenheit, convertido em graus Celsius é " + grauCelsius + " C°");
		
		tempFahrenheit = 0;
		grauCelsius = (tempFahrenheit - ajuste) * fator;
		
		System.out.println("O valor da temperatura Fahrenheit, convertido em graus Celsius é " + grauCelsius + " C°");
	}
}

