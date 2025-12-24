package exercicios.aulas.A89Interfaces.domain;

public class A89Caminhao extends A89Veiculo implements A89PassagemTributavel, A89Monitoravel {

	public A89Caminhao(String tipo, String placa) {
		super(tipo, placa);
	}

	@Override
	public double calcularTarifa() {
		return 50;
	}

	@Override
	public void verificarPlaca() {
		System.out.println("Analisando placa e peso na balança");
	}

}
