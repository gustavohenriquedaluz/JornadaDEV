package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class A65Time {
	private String nome;
	private A64Jogador[] jogadores;

	public A65Time(String nome) {
		this.nome = nome;
	}

	public A65Time(String nome, A64Jogador[] jogadores) {
		this.nome = nome;
		this.jogadores = jogadores;
	}

	public void imprime() {
		System.out.println(this.nome);
		if (jogadores == null)
			return;
		for (A64Jogador jogador : jogadores) {
			System.out.println(jogador.getNome());
		}
	}

	public A64Jogador[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(A64Jogador[] jogadores) {
		this.jogadores = jogadores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
