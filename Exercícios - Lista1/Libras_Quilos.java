package exerciciosCurso;
import java.util.Scanner;

/* 
		Leia um valor de massa em libras e apresente-o convertido em quilogramas.
		A fórmula de conversão é: K= L *0,45 , sendo K a massa em quilogramas e L a massa em Libras.
		
 */
public class Libras_Quilos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double qui, lib;
		System.out.println("Informe um valor de massa em quilogramas: ");
		lib = teclado.nextDouble();
		
		qui= lib*0.45;
		
		System.out.println(lib+ " Libras, equivalem a "+ qui+ " Quilogramas.");
	
		teclado.close();
	}
}