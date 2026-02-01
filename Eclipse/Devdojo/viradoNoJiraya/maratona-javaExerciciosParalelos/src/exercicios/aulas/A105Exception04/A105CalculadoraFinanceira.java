package exercicios.aulas.A105Exception04;

import java.util.Iterator;

public class A105CalculadoraFinanceira {

	public static int somarValores(String valorA, String valorB) {
		int a = converterSafe(valorA);
		int b = converterSafe(valorB);

		return a + b;
	}

	private static int converterSafe(String valor) {

		try {
			return Integer.parseInt(valor);
		} catch (NumberFormatException e) {
			System.out.println("Input inválido: " + valor);
		}
		return 0;

	}

//
//	public static int somarValores(String valorA, String valorB) throws NumberFormatException {
//
//		String[] valoresBrutos = {valorA, valorB};
//		int[] valoresConvetidos = new int[2];
//		
//		
//		try {
//			for (int i = 0; i < valoresBrutos.length; i++) {
//				valoresConvetidos[i] = Integer.parseInt(valoresBrutos[i]);
//			}
//			
//		} catch (NumberFormatException e) {
//			System.out.println("Input inválido: [valor]");
//			return 0;
//		}
//		return valoresConvetidos[0] + valoresConvetidos[1];
//	}

}
