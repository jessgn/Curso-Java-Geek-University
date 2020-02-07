package exerciciosCurso;
import java.util.Scanner;

/* 
 Leia um valor de área em acres e apresente-o em metros quadrados m². 
 A fórmula de conversão é: M = A * 4048.58, sendo M a área em metros quadrados e A a área em acres.
*/
public class Acres_Metros2 {
		public static void main(String[] args) {
			Scanner teclado = new Scanner (System.in);
			double met, acres;
			System.out.println("Informe a área em acres:  ");
			acres= teclado.nextDouble();
			
			met= acres * 4048.58;
			
			System.out.println("A área de "+ acres+ " acres, equivalem a "+ met + " m².");
			
			teclado.close();
			
			
		}
}
