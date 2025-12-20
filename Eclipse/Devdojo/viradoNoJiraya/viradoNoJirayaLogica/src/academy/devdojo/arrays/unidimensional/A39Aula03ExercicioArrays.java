package academy.devdojo.arrays.unidimensional;

import java.util.Arrays;

/*
 * Armazenar em dois vetores V1 e V2 5 valores numéricos inteiros e exibir o resultado 
 * da multiplicação dos números do V1 com os correspondentes em V2
 */

public class A39Aula03ExercicioArrays {
	public static void main (String[]args) {
		double[] v1 = new double[5];
		double[] v2 = new double[5];
		double[] vr = new double[5];
		
		// Atribuindo valores para não precisar usar o scanner
		v1[0] = 1;
		v1[1] = 2;
		v1[2] = 3;
		v1[3] = 4;
		v1[4] = 5;
		
		v2[0] = 2;
		v2[1] = 3;
		v2[2] = 4;
		v2[3] = 5;
		v2[4] = 0;
		
		for (int i = 0; i < vr.length; i++) {
			vr[i] = v1[i] * v2[i];
		}
		
		//forma mais fácil de imprimir arrays, sem loop e sout
		System.out.println("v1: " + Arrays.toString(v1));
		System.out.println("v2: " + Arrays.toString(v2));
		System.out.println("vr: " + Arrays.toString(vr));
	}
	
}
