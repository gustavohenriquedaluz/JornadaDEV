package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

//Eu como usuário gostaria de imprimir todos os números impares de 0 ao valor digitado pelo usuário

public class A29Aula02ExercicioImpares {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número abaixo para saber quantos números impares há até ele:");
		int numero = scanner.nextInt();
		int iterador = 0;
		int contadorDeImpares = 0;
		
		 while (iterador <= numero) {
			 if (iterador % 2 != 0) {
				 System.out.println("Impar: " + iterador);
				 contadorDeImpares++;
			 }
			 iterador++;
		}
		
		
		System.out.println("Entre 0 e " + numero + " há " + contadorDeImpares + " numeros impares");
		
		scanner.close();
	}
}