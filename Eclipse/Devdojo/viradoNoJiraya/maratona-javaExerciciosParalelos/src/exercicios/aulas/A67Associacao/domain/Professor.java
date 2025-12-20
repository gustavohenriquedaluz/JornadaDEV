package exercicios.aulas.A67Associacao.domain;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;

	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public void imprimeSeminarios() { //Alternativa ao get seminarios
		if (seminarios == null) {
			System.out.println("Professor " + this.nome + " sem seminários cadastrados");
		} else {
			System.out.println("Seminários ministrados pelo professor " + this.nome);
			for (Seminario seminario : seminarios) {
				System.out.println(seminario.getTitulo());
			}
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
// Não faz sentito ter isso, vai só retornar a referência e quebrar o encapsulamento,  mas não vou tirar para manter o meu entendimento
//	public Seminario[] getSeminarios() { 
//		return seminarios;
//	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}

}
