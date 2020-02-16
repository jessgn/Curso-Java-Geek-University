package exerciciosCurso;
import java.util.Scanner;

//Leia um valor real e a cotação do dólar. Em seguida imprima o valor correspondente em dólar.
public class Cotacao {
	public static void main(String[] args) {
		float dolar,real,aux;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Informe o valor do dólar: ");
		dolar= teclado.nextFloat();
		System.out.println("Informe o valor em real: ");
		real= teclado.nextFloat();
		
		aux= dolar/real;
		System.out.println(dolar+" dolares, equivalem a "+ aux+" reais.");
		
		teclado.close();
	}
}
