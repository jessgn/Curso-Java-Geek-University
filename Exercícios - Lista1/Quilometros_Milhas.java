package exerciciosCurso;
import java.util.Scanner;
/*
 	Leia uma dist�ncia em quil�metros e apresente-a convertida em milhas. 
 	A f�rmula de convers�o �: M = K/ 1,61, sendo K a dist�ncia em quil�metros e M em milhas.
 
 */
public class Quilometros_Milhas {
	public static void main(String[] args) {
		double kil , mil; 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a dist�ncia que deseja converter ");
		kil= teclado.nextDouble();
		
		mil = kil/1.61;
		
		System.out.println(" A dist�ncia de " + kil + "km, equivale a " + mil+ "milhas");
		
		
		teclado.close();
	}

}
