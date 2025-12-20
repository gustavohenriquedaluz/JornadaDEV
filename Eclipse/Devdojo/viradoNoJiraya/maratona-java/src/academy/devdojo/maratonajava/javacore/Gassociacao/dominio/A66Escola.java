package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class A66Escola {
	private String nome;
	private A66Professor[] professores;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public A66Escola(String nome, A66Professor[] professores) {
		this.nome = nome;
		this.professores = professores;
	}

	public void imprime() {
		System.out.println(this.nome);
		if (professores == null) return;
			for (A66Professor professor : professores) {
				System.out.println(professor.getNome());
			}
		
	}

	public String getNome() {
		return nome;
	}

	public A66Professor[] getProfessores() {
		return professores;
	}

	public void setProfessores(A66Professor[] professores) {
		this.professores = professores;
	}

	public A66Escola(String nome) {
		this.nome = nome;
	}

}
