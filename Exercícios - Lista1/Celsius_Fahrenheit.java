package exerciciosCurso;
import java.util.Scanner;
/*
 		Leia a temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
		A fórmula de conversão é: F= C *(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
*/ 
public class Celsius_Fahrenheit {
	public static void main(String[] args) {
		double cel, fah;
		Scanner teclado= new Scanner (System.in);
		System.out.println("Informe a temperatura em graus Celsius: ");
		cel = teclado.nextFloat();
		
		fah = cel*(9.0/5.0) + 32.0;
		
		System.out.println("A temperatura de " + cel + " ºC, equivale a " + fah + " F");
		teclado.close();
	}

}
