package academy.devdojo.maratonajava.Oexception.exception.test;

import java.util.Scanner;

import academy.devdojo.maratonajava.Oexception.exception.domain.A104LoginInvalidoException;

public class A104LoginInvalidoExceptionTest01 {

	public static void main(String[] args) {

		try {
			logar();
		} catch (A104LoginInvalidoException e) {
			e.printStackTrace();
		}
		
	}

	private static void logar() throws A104LoginInvalidoException {
		Scanner teclado = new Scanner(System.in);
		String usernameDB = "Goku";
		String senhaDB = "ssj";
		System.out.println("Usuário");
		String usernameDigitado = teclado.nextLine();
		System.out.println("Senha");
		String senhaDigitada = teclado.nextLine();

		if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
			throw new A104LoginInvalidoException("Usuário ou senha inválidos");
		}
		System.out.println("Usuário logado com sucesso");
	}
}
