package exerciciosCurso;
import java.util.Scanner;
/*
	Leia um valor de �rea em hectares e apresente-o convertido em metros quadrados m�.
	A f�rmula de convers�o �: M= H *10000, sendo M a �rea em metros quadrados e H a �rea em hectares.
*/
public class Hectares_Metros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double hec, met;
			System.out.println("Informe a �rea em hectares: ");
			 hec= teclado.nextDouble();
			 
			 met= hec*10000;
			 
			 System.out.println(" A �rea de "+hec+" hectares, equivalem a " +met+" m�");
			 
			 teclado.close();
		
	}

}
