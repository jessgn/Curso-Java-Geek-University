package exerciciosCurso;
import java.util.Scanner;
/*
  	Leia um valor de área em metros quadrados m² e apresente-o convertid em hectares.
  	A fórmula de conversão é: H= M*0.0001, sendo M a área em metros quadrados e H a área em hectares.
 */
public class Metros_Hectares {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double met, hec;
		System.out.println("Informe a área em metros quadrados: ");
		 	met= teclado.nextDouble();
		 	
		 	hec= met*0.0001;
		 	
		 	System.out.println("A área de "+ met+ " metros, equivaem a "+ hec+ " hectares");
		 	
		 	teclado.close();
		 	
	}
}
