package exercicios.aulas.A89Interfaces.domain;

public class A89CarroPasseio extends A89Veiculo implements A89PassagemTributavel, A89Monitoravel {

	public A89CarroPasseio(String tipo, String placa) {
		super(tipo, placa);
	}

	@Override
	public double calcularTarifa() {
		return 10;
	}

	
	
}
