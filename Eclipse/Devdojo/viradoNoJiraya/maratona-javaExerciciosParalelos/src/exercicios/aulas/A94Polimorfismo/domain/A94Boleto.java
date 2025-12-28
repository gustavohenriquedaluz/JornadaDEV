package exercicios.aulas.A94Polimorfismo.domain;

public class A94Boleto implements A94Pagavel {

	@Override
	public void processarPagamento() {
		System.out.println("Pagando via Boleto");
	}
	
	public void gerarCodigoBarras() {
		System.out.println("Gerando código de barras...");
	}

}
