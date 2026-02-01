package exercicios.aulas.A105Exception05;

public class A105Conexao implements AutoCloseable {

	@Override
	public void close() {
		System.out.println("Fechando conexão automaticamente...");
	}

	public void lerDados(String imputTeste) throws IllegalStateException {
		if (imputTeste.equals("ok")) {
			System.out.println("Dados lidos com sucesso");
		} else {
			throw new IllegalStateException();
		}
	}
}
