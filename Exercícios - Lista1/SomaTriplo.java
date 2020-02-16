package exerciciosCurso;
import java.util.Scanner;

 	// Leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro

public class SomaTriplo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n,ant,suc,soma;
		n = teclado.nextInt();
		
		suc=(n*n*n)+1;
		ant=(n*n)-1;
		soma = suc+ant;
		System.out.println("O numero digitado foi: " + n + ". O sucessor de seu triplo é: "+suc+". O antecessor de seu dobro é: "+ant+ ". A soma dos dois é: " + soma);
		
	}

}