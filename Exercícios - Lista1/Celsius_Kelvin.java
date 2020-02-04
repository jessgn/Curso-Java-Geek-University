package exerciciosCurso;
import java.util.Scanner;
/*
 Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin. 
 A fórmula de conversão é: K = C+273.15, sendo C a temperatura em Celsius e K a temperatura em Kelvin. 
 */
public class Celsius_Kelvin {
	public static void main(String[] args) {
		double cel, kel;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a temperatura que deseja converter: ");
			cel= teclado.nextDouble();
			
			kel= cel+273.15;
			
			System.out.println(" A temperatura de " + cel + " ºC, equivale a " + kel + "K");
			
			teclado.close();
	}
}
