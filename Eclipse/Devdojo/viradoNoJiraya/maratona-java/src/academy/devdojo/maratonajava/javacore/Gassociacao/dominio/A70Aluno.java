package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class A70Aluno {
	private String nome;
	private int idade;
	private A70Seminario seminario;

	public A70Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public A70Aluno(String nome, int idade, A70Seminario seminario) {
		this.nome = nome;
		this.idade = idade;
		this.seminario = seminario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public A70Seminario getSeminario() {
		return seminario;
	}

	public void setSeminario(A70Seminario seminario) {
		this.seminario = seminario;
	}

}
