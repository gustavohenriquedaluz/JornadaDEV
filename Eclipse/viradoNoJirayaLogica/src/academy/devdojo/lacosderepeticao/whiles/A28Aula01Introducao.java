package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class A28Aula01Introducao {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número para contar até 10:");
		int contador = scanner.nextInt();
		
		while (contador <=10) {
			System.out.println("Contador: " + contador);
			contador++; // contador = contador + 1
		}
		
		scanner.close();	
		
	}
}