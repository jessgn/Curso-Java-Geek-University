package exerciciosCurso;
import java.util.Scanner;

///Faça um programa que leia um número inteiro e o imprima

public class ImprimeNumero {
	public static void main(String[] args) {
		int num;
		System.out.println("Digite o número a ser impresso: ");
		Scanner teclado = new Scanner (System.in); 
		num = Integer.parseInt(teclado.nextLine());
		
		System.out.println(num);
		teclado.close();
	}
}
