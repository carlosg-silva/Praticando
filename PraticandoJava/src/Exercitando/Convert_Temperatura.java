package Exercitando;

public class Convert_Temperatura {

	public static void main(String[] args) {

		// Transformando "°F" fhrenheit em "°C" celsius

		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;

		double F = 86;
		double C = (F - AJUSTE) * FATOR;
		System.out.println("O resultado é " + C + "°C");

		F = 150;
		C = (F - AJUSTE) * FATOR;
		System.out.println("O resultado é " + C + "°C");

	}

}
