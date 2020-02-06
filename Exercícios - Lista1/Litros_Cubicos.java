package exerciciosCurso;
import java.util.Scanner;
/*
	Leia um valor em litros e apresente-o convertido em metros cúbicos m³.
	A fórmula de conversão é M= L/1000, sendo L o volume em litros e M o volume em metros cúbicos.

*/

public class Litros_Cubicos {
	public static void main(String[] args) {
		double  lit, met;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Informe o volume em litros: ");
		lit = teclado.nextDouble();
		
		met= lit/1000;
		System.out.println(lit+" litros, equivalem a "+ met +" m³");
		
		teclado.close();
	}
}
