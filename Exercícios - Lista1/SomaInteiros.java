package exerciciosCurso;
import java.util.Scanner;

//Pe�a ao usu�rio para digitar tr�s valores inteiros e imprima a soma deles.
public class SomaInteiros {
	public static void main(String[] args) {
		int pri, seg, ter, soma;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o primeiro n�mero:");
		pri = teclado.nextInt();
		
		System.out.println("Informe o segundo n�mero:");
		seg = teclado.nextInt();
		
		System.out.println("Informe o terceiro n�mero:");
		ter = teclado.nextInt();
		
		soma= pri+seg+ter;
		
		System.out.println(" A soma dos n�meros �: " + soma);
		teclado.close();
		
	}

}
