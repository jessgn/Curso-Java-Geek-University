package exerciciosCurso;
import java.util.Scanner;

/*
 	Leia um volume em metros c�bicos m� e apresente-o convertido em litros.
 	A f�rmula de convers�o � L= 1000*M, sendo L o valume em litros e M o volume em metros c�bicos.
 
 */

public class Cubicos_Litros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double lit, met;
			System.out.println("Informe o volume em metros c�bicos: ");
				met = teclado.nextDouble();
				
				lit= 1000*met;
				System.out.println(met+ " metros c�bicos, equivalem a "+ lit + " litros.");
	
				teclado.close();
	}

}
