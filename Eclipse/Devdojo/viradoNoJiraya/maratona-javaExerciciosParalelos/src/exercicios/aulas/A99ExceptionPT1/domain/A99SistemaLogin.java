package exercicios.aulas.A99ExceptionPT1.domain;

import java.io.IOException;

public class A99SistemaLogin {

	public static void logar(String usuario, String senha) throws IOException {

		// Corrigido, colocar validação de null antes, pois se for null, ele não consegue fazer o .isBlank()
		
		if (usuario == null || senha == null || usuario.isBlank() || senha.isBlank() ) {
			throw new IllegalArgumentException("Login/Senha inválidos");
		} else if (usuario.equals("teste") || senha.equals("banco_off") ) {
			throw new IOException("Falha de conexão com o banco");
		} else {
			System.out.println("Usuário " + usuario + " logado com sucesso.");
		}

	}

}
