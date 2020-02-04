package exerciciosCurso;
import java.util.Scanner;
/*
 	Leia uma distância em quilômetros e apresente-a convertida em milhas. 
 	A fórmula de conversão é: M = K/ 1,61, sendo K a distãncia em quilômetros e M em milhas.
 
 */
public class Quilometros_Milhas {
	public static void main(String[] args) {
		double kil , mil; 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a distância que deseja converter ");
		kil= teclado.nextDouble();
		
		mil = kil/1.61;
		
		System.out.println(" A distância de " + kil + "km, equivale a " + mil+ "milhas");
		
		
		teclado.close();
	}

}
