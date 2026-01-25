package exercicios.aulas.A105Exception02;

public class A105GeradorRelatorioNuvem extends A105GerarRelatorio{

	@Override
	public void gerar() { // Não posso mudar o throw, pq estou extendendo uma classe que define um throw específico
		System.out.println("Gerando relatório da núvem...");
	}

	
	
}
