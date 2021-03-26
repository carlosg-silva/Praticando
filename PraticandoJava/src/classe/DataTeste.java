package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		 Data d1 = new Data();
		 
		 d1.dia = 26;
		 d1.mes = 3;
		 d1.ano = 2021;
		 
		 System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
		 
		 var d2 = new Data();
		 
		 d2.dia = 12;
		 d2.mes = 06;
		 d2.ano = 2020;
		 
		 System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);

	}

}
