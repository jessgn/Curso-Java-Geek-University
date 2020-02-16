package exerciciosCurso;
import java.util.Scanner;
/*
	Leia um valor de área em hectares e apresente-o convertido em metros quadrados m².
	A fórmula de conversão é: M= H *10000, sendo M a área em metros quadrados e H a área em hectares.
*/
public class Hectares_Metros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double hec, met;
			System.out.println("Informe a área em hectares: ");
			 hec= teclado.nextDouble();
			 
			 met= hec*10000;
			 
			 System.out.println(" A área de "+hec+" hectares, equivalem a " +met+" m²");
			 
			 teclado.close();
		
	}

}
