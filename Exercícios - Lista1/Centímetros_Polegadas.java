package exerciciosCurso;
import java.util.Scanner;
/* 
  	Leia um valor de comprimento em polegada e apresente-o convertido em cent�metros.
  	A f�rmula de convers�o �: P = C/ 2,54, sendo C o comprimento em cent�metros e P o comprimento em polegadas.
 */

public class Cent�metros_Polegadas {
	public static void main(String[] args) {
		double cent, pole;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o comprimento em cent�metros: ");
		cent = teclado.nextDouble();
		
		pole= cent/2.54;
		
		System.out.println(cent+ "cent�metros, equivale a " + pole + " polegadas");
		
		teclado.close();
	}
}
