package exerciciosCurso;
import java.util.Scanner;

/* 
 	 Leia um valor de área em metros quadrados m² e apresente-o em acres. 
 	 A fórmula de conversão é: A= M * 0.000247, sendo M a área em metros quadrados e A a área em acres.
 */

public class Metros_Acres {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double met, acres;
		
		System.out.println("Informe a área em metros quadrados: ");
		met = teclado.nextDouble();
		
		acres= met * 0.000247;
		
		System.out.println("A área de "+ met+ " m², equivalem a "+ acres + " acres.");
		
		teclado.close();
	}

}
