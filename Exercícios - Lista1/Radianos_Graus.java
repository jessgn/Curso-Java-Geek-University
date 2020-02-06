package exerciciosCurso;

import java.util.Scanner;
 
/*
 	Leia um ângulo em radianos e apresente-o convertido em graus. 
 	A fórmula de conversão é: G =  R * 180/π , sendo G o ângulo em graus e R em radianos e π = 3.14.
 	
 */
public class Radianos_Graus {
	public static void main(String[] args) {
		System.out.println("Informe o ângulo em radianos:  ");
			double rad , grau, pi = 3.14;
			Scanner teclado = new Scanner(System.in);
			 rad = teclado.nextDouble();
			 
			 grau= rad * 180 / pi;
			  
			System.out.println("O ângulo de " + rad + " radianos, equivale ao ângulo de " + grau + "graus" );
			
			teclado.close();
		
	}

}
