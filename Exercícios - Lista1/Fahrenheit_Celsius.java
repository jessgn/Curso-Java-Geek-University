package exerciciosCurso;

import java.util.Scanner;

/* 
 	Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
    A f�rmula de convers�o � : C= 5.0*(F-32.0)/9.0, sendo C a temperatura em Celsius e F a temperatura em Fahrenheit.
 
 */
public class Fahrenheit_Celsius {
	public static void main(String[] args) {
		double cel, fah;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Informe a temperatura em graus Fahrenheit");
		fah = teclado.nextDouble();
		
		cel= 5.0*(fah-32.0)/9.0;
		
		System.out.println(" A temperatura " + fah + "�F equivale a " + cel + "�C");
		
		teclado.close();
	}
}
