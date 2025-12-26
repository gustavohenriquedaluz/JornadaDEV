package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class A92Televisao extends A90Produto {
	public static final double IMPOSTO_POR_CENTO = 0.21;

	public A92Televisao(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double calcularImposto() {
		System.out.println("Calculando imposto da Televisão");
		return this.valor * IMPOSTO_POR_CENTO;
	}

	public static double getImpostoPorCento() {
		return IMPOSTO_POR_CENTO;
	}

}
