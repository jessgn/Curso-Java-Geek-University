package exerciciosCurso;
 import java.util.Scanner;
 
//Leia um n�mero real e imprima o resultado quadrado desse n�mero;
 
public class Quadrado_Inteiros {
	public static void main(String[] args) {
		float num, res;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		num = teclado.nextFloat();
		
		res= num*num;
		
		System.out.println(" O quadrado do n�mero "+ num + " � : " + res);
		teclado.close();
		
	}

}
