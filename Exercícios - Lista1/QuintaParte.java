package exerciciosCurso;
import java.util.Scanner;

//Leia um número real e imprima a quinta parte deste número;
 
public class QuintaParte {
	public static void main(String[] args) {
		float num, res;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o um número: ");
			num= teclado.nextFloat();
			
			res= num / 5;
			
			System.out.println("A quinta parte do "+ num + " é: " + res );
			teclado.close();
	}

}
