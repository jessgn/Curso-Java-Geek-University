package exerciciosCurso;
import java.util.Scanner;

//Leia um n�mero real e imprima a quinta parte deste n�mero;
 
public class QuintaParte {
	public static void main(String[] args) {
		float num, res;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o um n�mero: ");
			num= teclado.nextFloat();
			
			res= num / 5;
			
			System.out.println("A quinta parte do "+ num + " �: " + res );
			teclado.close();
	}

}
