package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class A70Seminario {
	private String titulo;
	private A70Aluno[] alunos;
	private A70Local local;

	public A70Seminario(String titulo, A70Local local) {
		this.titulo = titulo;
		this.local = local;
	}

	public A70Seminario(String titulo, A70Aluno[] alunos, A70Local local) {
		this.titulo = titulo;
		this.alunos = alunos;
		this.local = local;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public A70Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(A70Aluno[] alunos) {
		this.alunos = alunos;
	}

	public A70Local getLocal() {
		return local;
	}

	public void setLocal(A70Local local) {
		this.local = local;
	}

}
