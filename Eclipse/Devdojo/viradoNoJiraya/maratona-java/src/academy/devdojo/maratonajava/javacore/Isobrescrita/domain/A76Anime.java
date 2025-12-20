package academy.devdojo.maratonajava.javacore.Isobrescrita.domain;

public class A76Anime extends Object{
	private String nome;

	@Override
	public String toString() {
		return "Anime: " + this.nome;
	}
	
	
	
	public A76Anime(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
