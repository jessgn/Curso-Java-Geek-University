package exerciciosCurso;
import java.util.Scanner;

// Leia quatro notas, calcule a m�dia aritm�tica e imprima o resultado.
public class Media {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float nota1,nota2,nota3,nota4,resp;
		System.out.println("Informe a primeira m�dia ");
			nota1= teclado.nextFloat();
		System.out.println("Informe a primeira m�dia ");
			nota2= teclado.nextFloat();
		System.out.println("Informe a primeira m�dia ");
			nota3= teclado.nextFloat();
		System.out.println("Informe a primeira m�dia ");
			nota4= teclado.nextFloat();
			
		resp=(nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A m�dia das notas �: "+resp);
		teclado.close();
	}

}
