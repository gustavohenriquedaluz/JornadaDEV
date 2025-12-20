package exercicios.aulas.A67Associacao.domain;

public class Seminario {
	private String titulo;
	private Local local;
	private Aluno[] alunos;
	private Professor professor;

	public Seminario(String titulo, Local local, Professor professor) {
		this.titulo = titulo;
		this.local = local;
		this.professor = professor;
	}

	public void imprimeResumo() {
		System.out.println("Seminario " + titulo);
		System.out.println(this.local.getLocal());
		System.out.println("Ministrado pelo professor " + this.professor.getNome());
		if (this.alunos != null) {
			System.out.println("Alunos matriculados:");
			for (Aluno aluno : alunos) {
				System.out.println(aluno.getNome());
			}
		} else {
			System.out.println("Nenhum aluno foi matriculado no seminario " + titulo);
		}

	}

	public String getLocal() {
		return this.local.getLocal();
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public void imprimeAlunos() { // Substui o get alunos, pq o get só retornaria a referência na memória
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;

		if (this.alunos != null) {
			for (Aluno aluno : alunos) {
				aluno.setSeminario(this);
			}
		}
	}

	public String getProfessor() {
		return this.professor.getNome();
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
