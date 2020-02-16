package exerciciosCurso;
import java.util.Scanner;

// Leia quatro notas, calcule a média aritmética e imprima o resultado.
public class Media {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float nota1,nota2,nota3,nota4,resp;
		System.out.println("Informe a primeira média ");
			nota1= teclado.nextFloat();
		System.out.println("Informe a primeira média ");
			nota2= teclado.nextFloat();
		System.out.println("Informe a primeira média ");
			nota3= teclado.nextFloat();
		System.out.println("Informe a primeira média ");
			nota4= teclado.nextFloat();
			
		resp=(nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A média das notas é: "+resp);
		teclado.close();
	}

}
