package exerciciosCurso;
import java.util.Scanner;
/* 
 		Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius. 
 		A f�rmula de convers�o �: C = K-273.15, sendo C a temperatura em Celsius e K a Temperatura em Kelvin.
 */
public class Kelvin_Celsius {
	public static void main(String[] args) {
		double kel, cel;
			Scanner teclado= new Scanner(System.in);
		System.out.println("Informe a temperatura que deseja converter: ");
			kel = teclado.nextDouble();
			
			cel= kel-273.15;
			
			System.out.println(" A temperatura de " + kel + " K, equivale a " + cel + " �C");
			
			teclado.close();
	}
}
