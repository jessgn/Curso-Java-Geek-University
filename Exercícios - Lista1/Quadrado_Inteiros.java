package exerciciosCurso;
 import java.util.Scanner;
 
//Leia um número real e imprima o resultado quadrado desse número;
 
public class Quadrado_Inteiros {
	public static void main(String[] args) {
		float num, res;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um número: ");
		num = teclado.nextFloat();
		
		res= num*num;
		
		System.out.println(" O quadrado do número "+ num + " é : " + res);
		teclado.close();
		
	}

}
