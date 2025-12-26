package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class A90Tomate extends A90Produto {
	public static final double IMPOSTO_POR_CENTO = 0.06;
	private String dateValidade;

	public A90Tomate(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double calcularImposto() {
		System.out.println("Calculando imposto do Computador");
		return this.valor * IMPOSTO_POR_CENTO;
	}

	public String getDateValidade() {
		return dateValidade;
	}

	public void setDateValidade(String dateValidade) {
		this.dateValidade = dateValidade;
	}

}
