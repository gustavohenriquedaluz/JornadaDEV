package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class A97ExceptionTest01 {
	public static void main(String[] args) {
		criarNovoArquivo(); // Chama o método
	}
	
	private static void criarNovoArquivo() { //Criação do método fora da main
		File file = new File("arquivo\\teste.txt"); // Criando objeto do tipo File
		//File file = new File("arquivoComPermissão\\teste.txt"); // Teste Gustavo - se cria, atribue true
		try {
		boolean isCriado = file.createNewFile(); //Tenta criar o arquivo
		System.out.println("Arquivo criado " + isCriado);
		} catch (IOException e) {
			e.printStackTrace();
			
		}

	}
}
