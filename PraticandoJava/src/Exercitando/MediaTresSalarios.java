package Exercitando;

import java.util.Scanner;

public class MediaTresSalarios {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		// .replace("," , ".") foi usado para substituir  v�rgula "," por ponto "." se necess�rio.
		
		System.out.print("Informe o primeiro sal�rio: ");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.print("Informe o segundo sal�rio: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("Informe o terceiro sal�rio: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("\nA m�dia salarial � : " + media);
			
	
		entrada.close();
		
	}
	

}
