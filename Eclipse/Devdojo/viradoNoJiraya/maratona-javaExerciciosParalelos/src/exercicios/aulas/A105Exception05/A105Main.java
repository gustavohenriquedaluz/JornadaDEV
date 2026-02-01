package exercicios.aulas.A105Exception05;

public class A105Main {

	public static void main(String[] args) {
		
		try (A105Conexao c = new A105Conexao()) {
			c.lerDados("Erro");
		} catch (IllegalStateException e) { // Aqui não deveria ser illegalState? mas da erro, pq autoclose é exception?
			e.printStackTrace();
		}

	}

}
