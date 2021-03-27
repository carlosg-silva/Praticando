package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		 Data d1 = new Data();
		 
		 d1.dia = 26;
		 d1.mes = 3;
		 d1.ano = 2021;
		 
		 System.out.println(d1.obterDataFormatada());
		 
		 var d2 = new Data();
		 
		 d2.dia = 12;
		 d2.mes = 06;
		 d2.ano = 2020;
		 
		 System.out.println(d2.obterDataFormatada());

	}

}
