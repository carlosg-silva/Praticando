package Exercitando;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//Informa��es do funcion�rio
		
		
		//Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 58689;
		long pontosAcumulados = 3_568_879_356L;
		
		//Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_754_789_254.02;
		
		//Tipos booleanos
		boolean estaDeFerias = true; // ou false
		
		//Tipo caractere
		char status = 'A'; //Ativo 
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real R$
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario + " R$");
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status " + status);
		
		
		
		
	}


}
