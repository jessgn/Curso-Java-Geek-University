package exerciciosCurso;
import java.util.Scanner;

/* 
 Leia um valor de �rea em acres e apresente-o em metros quadrados m�. 
 A f�rmula de convers�o �: M = A * 4048.58, sendo M a �rea em metros quadrados e A a �rea em acres.
*/
public class Acres_Metros2 {
		public static void main(String[] args) {
			Scanner teclado = new Scanner (System.in);
			double met, acres;
			System.out.println("Informe a �rea em acres:  ");
			acres= teclado.nextDouble();
			
			met= acres * 4048.58;
			
			System.out.println("A �rea de "+ acres+ " acres, equivalem a "+ met + " m�.");
			
			teclado.close();
			
			
		}
}
