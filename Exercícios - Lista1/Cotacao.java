package exerciciosCurso;
import java.util.Scanner;

//Leia um valor real e a cota��o do d�lar. Em seguida imprima o valor correspondente em d�lar.
public class Cotacao {
	public static void main(String[] args) {
		float dolar,real,aux;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Informe o valor do d�lar: ");
		dolar= teclado.nextFloat();
		System.out.println("Informe o valor em real: ");
		real= teclado.nextFloat();
		
		aux= dolar/real;
		System.out.println(dolar+" dolares, equivalem a "+ aux+" reais.");
		
		teclado.close();
	}
}
