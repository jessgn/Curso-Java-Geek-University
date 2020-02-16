package exerciciosCurso;
import java.util.Scanner;

// Faça a leitura de três valores e apresente como resultado a soma dos quadrados dos três valores lidos.
public class Soma_Quadrados {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, resp, q1,q2,q3;
		
			System.out.println("Informe o primeiro numero: ");
				num1= Integer.parseInt(teclado.nextLine());
			System.out.println("Informe o segundo numero: ");
				num2=Integer.parseInt(teclado.nextLine());
			System.out.println("Informe o terceiro numero: ");
				num3= Integer.parseInt(teclado.nextLine());
				q1 = num1 * num1;
				q2 = num2 * num2;
				q3 = num3 * num3;
				resp= q1+q2+q3;
		System.out.println("A soma dos quadrados dos numeros informados é: "+ resp);
		teclado.close();
	}
}

