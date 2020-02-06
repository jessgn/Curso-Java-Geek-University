package exerciciosCurso;
import java.util.Scanner;

/*
 	Leia um volume em metros cúbicos m³ e apresente-o convertido em litros.
 	A fórmula de conversão é L= 1000*M, sendo L o valume em litros e M o volume em metros cúbicos.
 
 */

public class Cubicos_Litros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double lit, met;
			System.out.println("Informe o volume em metros cúbicos: ");
				met = teclado.nextDouble();
				
				lit= 1000*met;
				System.out.println(met+ " metros cúbicos, equivalem a "+ lit + " litros.");
	
				teclado.close();
	}

}
