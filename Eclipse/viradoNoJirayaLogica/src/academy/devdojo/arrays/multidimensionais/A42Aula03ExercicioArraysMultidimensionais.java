package academy.devdojo.arrays.multidimensionais;
//Calcule a multiplicação dos elementos da diagonal principal de uma matriz quadrada

public class A42Aula03ExercicioArraysMultidimensionais {
	public static void main (String[]args) {
		
		int[][] arrayMulti = new int[3][3];
		arrayMulti[0][0] = 2;
		arrayMulti[0][1] = 3;
		arrayMulti[0][2] = 4;
		arrayMulti[1][0] = 5;
		arrayMulti[1][1] = 6;
		arrayMulti[1][2] = 7;
		arrayMulti[2][0] = 8;
		arrayMulti[2][1] = 9;
		arrayMulti[2][2] = 10;
		
		int resultado = 1;
// 		SOLUÇÃO 1:		
//		for (int i = 0; i < arrayMulti.length; i++) {
//			for (int j = 0; j < arrayMulti.length; j++) {
//				
//				if (i == j) {
//					System.out.println("arrayMulti[i][j] = " + arrayMulti[i][j]);
//					resultado = resultado * arrayMulti[i][j];					
//				}
//			}
//		}
		
		
// 		SOLUÇÃO 2:
		for (int i = 0; i < arrayMulti.length; i++) {
			System.out.println("arrayMulti[i][i] = " + arrayMulti[i][i]);
			resultado = resultado * arrayMulti[i][i];				
		}
		System.out.println("Resultado = " + resultado);
	}
}
