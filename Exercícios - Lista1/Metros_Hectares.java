package exerciciosCurso;
import java.util.Scanner;
/*
  	Leia um valor de �rea em metros quadrados m� e apresente-o convertid em hectares.
  	A f�rmula de convers�o �: H= M*0.0001, sendo M a �rea em metros quadrados e H a �rea em hectares.
 */
public class Metros_Hectares {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double met, hec;
		System.out.println("Informe a �rea em metros quadrados: ");
		 	met= teclado.nextDouble();
		 	
		 	hec= met*0.0001;
		 	
		 	System.out.println("A �rea de "+ met+ " metros, equivaem a "+ hec+ " hectares");
		 	
		 	teclado.close();
		 	
	}
}
