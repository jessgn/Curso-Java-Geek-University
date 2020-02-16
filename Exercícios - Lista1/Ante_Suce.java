package exerciciosCurso;
import java.util.Scanner;
public class Ante_Suce {
	public static void main(String[] args) {
		int n,ante,suce;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Digite um número: ");
		n = teclado.nextInt();
		ante = n-1;
		suce= n+1;
		System.out.println("O número digitado foi: " + n + ". Seu antecessor é: " + ante + " e seu sucessor é: " + suce );
	}

}
