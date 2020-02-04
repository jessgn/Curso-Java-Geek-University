package exerciciosCurso;
import java.util.Scanner;
/*	
    Leia uma velocidade em Km/h (quilômetros por hora) e apresente-a convertida em m/s (metros por segundo).
  	A fórmula é: M = K/3.6, sendo K a velocidade em km/h e M em m/s
 
 */
public class Km_Ms {
	 public static void main(String[] args) {
		 double k, m; 
		 Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a velocidadeque deseja converter: ");
			k= teclado.nextDouble();
			
			m= k / 3.6;
			
			System.out.println("A velocidade de " + k + "km/h, equivale a "+ m + "m/s");
			
			teclado.close();
	}
}
