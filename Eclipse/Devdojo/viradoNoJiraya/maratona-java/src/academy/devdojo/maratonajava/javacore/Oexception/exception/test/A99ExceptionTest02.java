package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class A99ExceptionTest02 {

	public static void main(String[] args) throws IOException {
		criarNovoArquivo();
	}

	private static void criarNovoArquivo() throws IOException { //Criação de método fora da main, do tipo checked (Não runtime)
		File file = new File("arquivo\\teste.txt");
		
		try { // Tenta executar o bloco
			boolean isCriado = file.createNewFile();
			System.out.println("Arquivo criado " + isCriado);
		} catch (IOException e) { // Se a exceção definida foi capturada, executa o bloco abaixo
			e.printStackTrace(); // Imprime no console
			throw e; // Relançando a exception
			// throw new RuntimeException("Problema na hora de criar arquivo"); // Variação, se quisesse retornar outra excepção e não precisa usar o throw
		}
	}
}
