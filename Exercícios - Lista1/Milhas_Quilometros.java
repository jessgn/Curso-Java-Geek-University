package exerciciosCurso;
import java.util.Scanner;

/*
 	Leia uma distância em milhas e apresente-a convertida em quilômetros. 
 	A fórmula é K= 1,61 * M, sendo K a distância em quilômetros e M em milhas;
 */
public class Milhas_Quilometros {
	public static void main(String[] args) {
		double mil, kil;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a distância em milhas que deseja converter ");
		mil = teclado.nextDouble();	
		
		kil = 1.61 * mil;
		
		System.out.println(" A distância de " + mil + "milhas, equivale a " + kil+ "Km");
		teclado.close();
	}

}
