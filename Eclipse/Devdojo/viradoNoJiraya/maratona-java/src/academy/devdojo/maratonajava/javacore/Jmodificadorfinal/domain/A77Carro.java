package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class A77Carro {
	private String nome;
	public static final double VELOCIDADE_LIMITE = 250;
	public final A78Comprador COMPRADOR = new A78Comprador();

	public final void imprime() {
		System.out.println(this.nome);
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
