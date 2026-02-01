package academy.devdojo.maratonajava.javacore.Oexception.RuntimeException.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class A102RuntimeExceptionTest04 {

	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) { // A100 Arrays
																										// multicatch
			System.out.println("Dentro do ArrayIndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Dentro do IndexOutOfBoundsException");
		} catch (RuntimeException e) { // Genérica, se não atender as específicas
			System.out.println("Dentro do RuntimeException");
		}

		try {
			talvezLanceException();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void talvezLanceException() throws SQLException, FileNotFoundException {

	}

}
