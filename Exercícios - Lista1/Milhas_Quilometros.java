package exerciciosCurso;
import java.util.Scanner;

/*
 	Leia uma dist�ncia em milhas e apresente-a convertida em quil�metros. 
 	A f�rmula � K= 1,61 * M, sendo K a dist�ncia em quil�metros e M em milhas;
 */
public class Milhas_Quilometros {
	public static void main(String[] args) {
		double mil, kil;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a dist�ncia em milhas que deseja converter ");
		mil = teclado.nextDouble();	
		
		kil = 1.61 * mil;
		
		System.out.println(" A dist�ncia de " + mil + "milhas, equivale a " + kil+ "Km");
		teclado.close();
	}

}
