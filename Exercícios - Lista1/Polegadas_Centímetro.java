package exerciciosCurso;
import java.util.Scanner;

/* 
  	Leia um valor de comprimento em polegada e apresente-o convertido em cent�metros.
  	A f�rmula de convers�o �: C = P* 2,54, sendo C o comprimento em cent�metros e P o comprimento em polegadas.
 */
public class Polegadas_Cent�metro {
	public static void main(String[] args) {
		double cent, pole;
		System.out.println("Informe o comprimento em Polegadas: ");
			Scanner teclado= new Scanner(System.in);
			pole= teclado.nextFloat();
			
			cent = pole * 2.54;
			
			 System.out.println(" O comprimento de " + pole + " polegadas, equivale a " + cent + " cennt�metros");
			 
			 teclado.close();
	}

}
