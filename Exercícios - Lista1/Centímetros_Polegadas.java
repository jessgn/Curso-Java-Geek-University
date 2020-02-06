package exerciciosCurso;
import java.util.Scanner;
/* 
  	Leia um valor de comprimento em polegada e apresente-o convertido em centímetros.
  	A fórmula de conversão é: P = C/ 2,54, sendo C o comprimento em centímetros e P o comprimento em polegadas.
 */

public class Centímetros_Polegadas {
	public static void main(String[] args) {
		double cent, pole;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o comprimento em centímetros: ");
		cent = teclado.nextDouble();
		
		pole= cent/2.54;
		
		System.out.println(cent+ "centímetros, equivale a " + pole + " polegadas");
		
		teclado.close();
	}
}
