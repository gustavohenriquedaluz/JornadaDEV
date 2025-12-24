package exercicios.aulas.A89Interfaces.domain;

public interface A89PassagemTributavel {
	public abstract double calcularTarifa();
	
	static void consultarTabelaPreco() {
		System.out.println("Tabela 2025 carregada");
	}
	
}
