package exercicios.aulas.A76toString.domain;

public class A76Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;

	public A76Livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}
	
	@Override
	public String toString() {
		return "O livro " + this.titulo + " escrito por " + this.autor + " em " + this.anoPublicacao;
	}
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(short anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

}
