package exercicios.aulas.A67Associacao.domain;

public class Aluno {
	private String nome;
	private int idade;
	private Seminario seminario;

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
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

	public void setIdade(short idade) {
		this.idade = idade;
	}

	public String getSeminario() {
		return this.seminario.getTitulo();
	}

	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}

}
