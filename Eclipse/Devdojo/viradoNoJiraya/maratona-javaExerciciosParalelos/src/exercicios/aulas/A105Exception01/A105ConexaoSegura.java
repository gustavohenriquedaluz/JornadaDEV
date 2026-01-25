package exercicios.aulas.A105Exception01;

public class A105ConexaoSegura implements AutoCloseable {

	public A105ConexaoSegura() {
		System.out.println("Conexão realizada com sucesso");
	}
	
	
	@Override
	public void close() {
		System.out.println("Fechando conexão segura...");
	}

}
