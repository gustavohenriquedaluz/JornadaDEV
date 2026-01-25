package exercicios.aulas.A105Exception01;

public class A105AuthService {
	public static void main(String[] args) {
		try {
			autenticar("admin", "Mamão");
		} catch (A105FalhaDeConexaoException e) {
			System.out.println("Erro Crítico: Chamar DevOps");
			e.printStackTrace();
		} catch (A105CredenciaisInvalidasException e) {
			System.out.println("Erro: Digite novamente");
			e.printStackTrace();
		}
	}

	public static void autenticar(String login, String senha) throws A105FalhaDeConexaoException {
		try (A105ConexaoSegura conexaoSegura = new A105ConexaoSegura()) {
			if (login.equals("admin")) {
				throw new A105FalhaDeConexaoException();
			} else if (!senha.equals("1234")) {
				throw new A105CredenciaisInvalidasException();
			}
		}
	}
}