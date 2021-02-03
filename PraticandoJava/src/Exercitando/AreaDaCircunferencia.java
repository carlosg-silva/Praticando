package Exercitando;

public class AreaDaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;
		double area = PI * raio * raio;

		System.out.println(area);

//alterando valor da variável e adicionando texto
		raio = 10;
		area = PI * raio * raio;

		System.out.println("Area = " + area + "m2.");
	}

}
