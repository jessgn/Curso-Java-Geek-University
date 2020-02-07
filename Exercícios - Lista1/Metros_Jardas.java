package exerciciosCurso;
import java.util.Scanner;

/* 
Leia um valor de comprimento em metros e apresente-o convertido em jardas.
A fórmula de conversão é: J= M / 0.91, sendo J o comprimento em jardas e M ocomprimento em metros.
*/

	public class Metros_Jardas {
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			double jard,met;
				System.out.println("Informe o comprimento em metros: ");
				met = teclado.nextDouble();
				
				jard= met/0.91;
				
				System.out.println("O comprimento de "+ met+ " metros, equivalem a "+ jard +" jardas.");
				teclado.close();
		}
}
