package academy.devdojo.maratonajava.Oexceotion.exception.test;

import java.io.File;
import java.io.IOException;

public class A97ExceptionTest01 {
	public static void main(String[] args) {
		
	}
	
	private static void criarNovoArquivo() {
		File file = new File("arquivo\\teste.txt");
		try {
			
		} catch (IOException e) {
			
		}
		file.createNewFile();
	}
}
