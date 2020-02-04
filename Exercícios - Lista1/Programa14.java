package exerciciosCurso;
import java.util.Scanner;
/* 
 	Leia um ângulo em graus e apresente-o convertido em radianos. 
 	A fórmula de conversão é: R= G * π /180, sendo G o ângulo em graus e R em radianos e π = 3.14.
 */
public class Programa14 {
	public static void main(String[] args) {
		double grau, pi = 3.14;
		 double rad;
	
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o ângulo em graus: ");
			grau = teclado.nextDouble();
			
			rad= grau * pi / 180;
			
			System.out.println("O ângulo de " + grau + "graus, equivale a " + rad + " radianos");
			
			teclado.close();
	}
}
