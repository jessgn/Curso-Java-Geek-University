package exerciciosCurso;
import java.util.Scanner;

///Fa�a um programa que leia um n�mero inteiro e o imprima

public class ImprimeNumero {
	public static void main(String[] args) {
		int num;
		System.out.println("Digite o n�mero a ser impresso: ");
		Scanner teclado = new Scanner (System.in); 
		num = Integer.parseInt(teclado.nextLine());
		
		System.out.println(num);
		teclado.close();
	}
}
