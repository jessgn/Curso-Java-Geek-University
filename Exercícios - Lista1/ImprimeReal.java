package exerciciosCurso;
import java.util.Scanner;

//Faça um programa que leia um número real e o imprima;

public class ImprimeReal {
	public static void main(String[] args) {
		float num;
		System.out.println("Digite o número real que deseja que seja impresso: ");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextFloat();
		
		System.out.println(num);
		teclado.close();
	}
}
