package exerciciosCurso;
import java.util.Scanner;
/*
 		Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida em km/h (quil�metros por hora).
 		A f�rmula cde convers�o � : K = M *3,6, sendo K a velocidade em km/h e M em m/s.
 */
public class Ms_Km {
	public static void main(String[] args) {
		double k, m;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Informe a velocidade que deseja converter: ");
		m = teclado.nextDouble();
		
		k = m * 3.6;
	
		System.out.println("A velocidade de "+ m + "m/s, equivale a " + k +" km/h" );
		teclado.close();
	}

}
