package exercicios.aulas.A77FinalA1EX02.domain;

public class Comprador {
	public String nome;

	@Override
	public String toString() {
		return this.nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
