package exercicios.aulas.A99ExceptionPT3;

public class A99Conexao {
	public static void main(String[] args) {

		
		try {
			conectar("SQL");		
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			System.out.println("4. Fechando conexão (LIBERANDO RECURSO)");
		}
		
		
		System.out.println("------------------");
		
		try {
			conectar("Excel");		
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			System.out.println("4. Fechando conexão (LIBERANDO RECURSO)");
		}
		
	}
	
	public static void conectar(String bancoDeDados) { // Runtime = unchecked, sem throws
		System.out.println("1. Abrindo conexão...");
		System.out.println("2. Lendo dados...");
		if (bancoDeDados.equals("SQL")) {
			throw new RuntimeException("Erro de leitura");			
		}
		System.out.println("3. Isso apareceu, pq não é SQL e nunca lançou o exception, não foi capturado pelo catch"); // Texte de quando lança a exception
		
	}
	
}
