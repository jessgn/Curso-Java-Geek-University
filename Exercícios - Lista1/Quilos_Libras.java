package exerciciosCurso;
import java.util.Scanner;

/* 
		Leia um valor de massa em quilogramas e apresente-o convertido em libras.
		A fórmula de conversão é: L= k/0,45 , sendo K a massa em quilogramas e L a massa em Libras.
		
 */
public class Quilos_Libras {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double qui, lib;
		System.out.println("Informe um valor de massa em quilogramas: ");
		qui = teclado.nextDouble();
		
		lib= qui/ 0.45;
		
		System.out.println(qui+ " Kg equivalem a "+ lib+ " Libras.");
		
		teclado.close();
	}

}
