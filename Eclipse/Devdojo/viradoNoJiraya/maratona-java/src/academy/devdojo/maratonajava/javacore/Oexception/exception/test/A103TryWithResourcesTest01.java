package academy.devdojo.maratonajava.javacore.Oexception.exception.test;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.A103Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.A103Leitor2;

public class A103TryWithResourcesTest01 {
	public static void main(String[] args) {
		lerArquivo();

	}

	public static void lerArquivo() {

		try (A103Leitor1 leitor1 = new A103Leitor1(); A103Leitor2 leitor2 = new A103Leitor2();) { // Precisa ser
																									// closable

		} catch (IOException e) {

		}

	}

	public static void lerArquivo2() {
		Reader reader = null; // Declarado fora do Try, pois o que está dentro do TRY morre ali, aqui temos a
								// referência intatcta
		try {
			reader = new BufferedReader(new FileReader("teste.txt"));

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
