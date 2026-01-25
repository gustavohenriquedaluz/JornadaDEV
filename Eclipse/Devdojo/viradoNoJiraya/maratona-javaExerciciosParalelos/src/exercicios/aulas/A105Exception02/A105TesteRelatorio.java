package exercicios.aulas.A105Exception02;

import exercicios.aulas.A105Exception01.A105FalhaDeConexaoException;

public class A105TesteRelatorio {
	public static void main(String[] args) {

		try {
			gerarRelatorio("local", "admin");
		} catch (A105FalhaDeGeracaoException | A105ConexaoInstavelException e) {
			e.printStackTrace();
		}
		
	}

	public static void gerarRelatorio(String tipo, String usuario)
			throws A105FalhaDeGeracaoException, A105ConexaoInstavelException {
		if (!usuario.equals("admin")) {
			throw new A105CredenciaisInvalidasException();
		} else if (tipo.equalsIgnoreCase("Nuvem")) {
			throw new A105ConexaoInstavelException();
		} else if (tipo.equals("local")) {
			throw new A105FalhaDeGeracaoException();
		}
		System.out.println("Sem exceptions, teste");
	}

}
