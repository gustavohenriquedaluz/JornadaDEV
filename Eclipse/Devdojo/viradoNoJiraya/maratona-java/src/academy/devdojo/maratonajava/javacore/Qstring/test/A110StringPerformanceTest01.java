package academy.devdojo.maratonajava.javacore.Qstring.test;

public class A110StringPerformanceTest01 {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		concatString(100000);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo gasto para String: " + (fim - inicio) + "ms");
		
		inicio = System.currentTimeMillis();
		concatStringBuilder(100000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + "ms");
		
		inicio = System.currentTimeMillis();
		concatStringBuffer(100000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + "ms");

	}

	private static void concatString(int tamanho) { //
		String texto = ""; // Objeto criado, para ser atualizado, mantendo o apontador vivo
		for (int i = 0; i < tamanho; i++) {
			texto+=i; // Cria um novo objeto a cada loop
		}
	}
	
	private static void concatStringBuilder(int tamanho) { // Syncronized?!
		StringBuilder sb = new StringBuilder(tamanho); 
		for (int i = 0; i < tamanho; i++) {
			sb.append(i);
		}
	}
	
	
	private static void concatStringBuffer(int tamanho) { // Usada em ambiente MULTITHREAD
		StringBuffer sb = new StringBuffer(tamanho); 
		for (int i = 0; i < tamanho; i++) {
			sb.append(i);
		}
	}
	

	
	
	
}
