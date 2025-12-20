package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class A63Anime {
	private String nome;
	private static int[] episodios;
	// 0 - Bloco de inicialização estático é executado quando a JVM carregar a classe.
	// 1 - Alocado espaco em memória pro objeto
	// 2 - Cada atributo de classe é criado e inicializado com valores default ou o
	// que for passado
	// 3 - Bloco de inicializacao de instância é executado
	// 4 - Construtor é executado
//	static {
//		System.out.println("Dentro do bloco de inicializacao");
//		episodios = new int[100];
//		for (int i = 0; i < episodios.length; i++) {
//			episodios[i] = i + 1;
//		}
//	}

	public A63Anime(String nome) {
		this.nome = nome;
	}

	public A63Anime() {
		for (int episodio : A63Anime.episodios) {
			System.out.print(episodio + " ");
		}
		System.out.println();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getEpisodios() {
		return A63Anime.episodios;
	}

}
