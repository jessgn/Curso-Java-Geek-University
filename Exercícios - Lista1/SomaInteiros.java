package exerciciosCurso;
import java.util.Scanner;

//Peça ao usuário para digitar três valores inteiros e imprima a soma deles.
public class SomaInteiros {
	public static void main(String[] args) {
		int pri, seg, ter, soma;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o primeiro número:");
		pri = teclado.nextInt();
		
		System.out.println("Informe o segundo número:");
		seg = teclado.nextInt();
		
		System.out.println("Informe o terceiro número:");
		ter = teclado.nextInt();
		
		soma= pri+seg+ter;
		
		System.out.println(" A soma dos números é: " + soma);
		teclado.close();
		
	}

}
