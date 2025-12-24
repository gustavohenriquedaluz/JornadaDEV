package exercicios.aulas.A89Interfaces.domain;

public abstract class A89Veiculo {
	private String tipo;
	private String placa;

	public A89Veiculo(String tipo, String placa) {
		this.tipo = tipo;
		this.placa = placa;
	}

	public void mostrarDetalhes() {
		System.out.println("Detalhes do veículo:");
		System.out.println("Tipo: " + tipo);
		System.out.println("Placa: " + placa);
	}

	@Override
	public String toString() {
		return "A89Veiculo [tipo=" + tipo + ", placa=" + placa + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public String getPlaca() {
		return placa;
	}

}
