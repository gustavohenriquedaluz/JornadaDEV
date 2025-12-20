package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.A60Anime;

public class A60AnimeTest01 {
	public static void main(String[] args) {
		A60Anime anime = new A60Anime();
		
		for (int episodio : anime.getEpisodios()) {
			System.out.print(episodio + " ");
		}
		
	}
}
