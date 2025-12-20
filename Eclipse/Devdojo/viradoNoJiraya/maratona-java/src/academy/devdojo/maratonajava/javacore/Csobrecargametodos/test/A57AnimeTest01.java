package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.A57Anime;

public class A57AnimeTest01 {

	public static void main(String[] args) {
		A57Anime anime = new A57Anime();
		//anime.init("Akudama Drive", "TV", 12);
		anime.init("Akudama Drive", "TV", 14, "Ação");
		anime.imprime();
		
		
	}

}
