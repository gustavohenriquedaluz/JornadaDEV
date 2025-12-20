package exercicios.aulas.domain;

public class A58Filme {
	private String titulo;
	private String diretor;
	private int anoLancamento;

	public A58Filme(String titulo, String diretor) {
		this.titulo = titulo;
		this.diretor = diretor;
	}

	public A58Filme(String titulo, String diretor, int anoLancamento) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.anoLancamento = anoLancamento;
	}

	public void exibirDetalhes() {
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Diretor: " + this.diretor);
		if (this.anoLancamento == 0) {
			System.out.println("Ano: Não informado");
		} else {
			System.out.println("Ano: " + this.anoLancamento);
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

}
