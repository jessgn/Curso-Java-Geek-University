package exerciciosCurso;
import java.util.Scanner;

//Fa�a um programa que leia um n�mero real e o imprima;

public class ImprimeReal {
	public static void main(String[] args) {
		float num;
		System.out.println("Digite o n�mero real que deseja que seja impresso: ");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextFloat();
		
		System.out.println(num);
		teclado.close();
	}
}
