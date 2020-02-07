package exerciciosCurso;
import java.util.Scanner;

/* 
	Leia um valor de comprimento em jardas e apresente-o convertido em metros.
	A fórmula de conversão é: M= 0.91 * J, sendo J o comprimento em jardas e M ocomprimento em metros.
*/
	public class Jardas_Metros {
		public static void main(String[] args) {
			Scanner teclado= new Scanner(System.in);
			double jard, met; 
			System.out.println("Informe o comprimento em jardas: ");
				jard= teclado.nextDouble();
				
			met= jard * 0.91;
			System.out.println("O comprimento de "+ jard+ " jardas, equivalem a "+ met +" metros.");
			teclado.close();
		}
}
