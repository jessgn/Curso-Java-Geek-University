package exerciciosCurso;
import java.util.Scanner;

/* 
 	 Leia um valor de �rea em metros quadrados m� e apresente-o em acres. 
 	 A f�rmula de convers�o �: A= M * 0.000247, sendo M a �rea em metros quadrados e A a �rea em acres.
 */

public class Metros_Acres {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double met, acres;
		
		System.out.println("Informe a �rea em metros quadrados: ");
		met = teclado.nextDouble();
		
		acres= met * 0.000247;
		
		System.out.println("A �rea de "+ met+ " m�, equivalem a "+ acres + " acres.");
		
		teclado.close();
	}

}
