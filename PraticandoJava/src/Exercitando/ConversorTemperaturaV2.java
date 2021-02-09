package Exercitando;

import java.util.Scanner;

public class ConversorTemperaturaV2 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final double FATOR = 9.0 / 5.0;
		final double AJUSTE = 32;
		
		System.out.print("Informe a temperatura em C°:");
		double C = entrada.nextDouble();
		
		
		
		double resultado = (C * FATOR) + AJUSTE;
		
		System.out.printf("Temperatura = %.2f F°", resultado);

		entrada.close();
	}


}
