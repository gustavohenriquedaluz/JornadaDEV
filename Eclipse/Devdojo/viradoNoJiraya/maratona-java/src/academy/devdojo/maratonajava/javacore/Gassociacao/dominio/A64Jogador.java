package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

//Jogador 1 -- 1 personagem
//Time 1 -- N Jogador
//Jogador N -- 1 Time
//Estudante N -- N Curso

public class A64Jogador {
	private String nome;
	private A65Time time;

	public void imprime() {
		System.out.println(this.nome);
		if (this.time != null) {
			System.out.println(this.time.getNome());
		}
	}

	public A64Jogador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public A65Time getTime() {
		return time;
	}

	public void setTime(A65Time time) {
		this.time = time;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
