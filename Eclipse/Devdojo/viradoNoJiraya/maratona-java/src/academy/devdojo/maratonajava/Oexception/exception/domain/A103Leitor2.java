package academy.devdojo.maratonajava.Oexception.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class A103Leitor2 implements Closeable {

	@Override
	public void close() throws IOException {
		System.out.println("Fechando Leitor 2");

	}
}
