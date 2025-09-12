package academy.devdojo.arrays.unidimensional;

// colocar a media das notas junto do primeiro for

import java.util.Scanner;

public class A38Aula02ArraysComForDesafio {
	public static void main (String[]args) {
		double[] notas = new double[4];
		double media = 0;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i + 1));
			notas[i] = scanner.nextDouble();
			media = media + notas[i];
			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
		}

//		for (int i = 0; i < notas.length; i++) {
//			media = media + notas[i];
//			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
//		}
		
		media = media/notas.length;
		System.out.println("Media das notas: " + media);
		scanner.close();
	}
}
