package academy.devdojo.maratonajava.javacore.Oexception.RuntimeException.test;

public class A98RuntimeExceptionTest02 {

	public static void main(String[] args) {
		divisao(1, 0);

//		try {
//			divisao(1, 0);
//		} catch (RuntimeException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Código finalizado");
	}

	/**
	 * 
	 * @param a
	 * @param b não pode ser 0
	 * @return
	 * @throws IllegalArgumentException
	 */

	private static int divisao(int a, int b) { // Criação do método fora da main, (Runtime \ unchecked)
		if (b == 0) { 
			throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
		}
		return a / b;
	}
}
