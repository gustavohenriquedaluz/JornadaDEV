package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class A61Carro {
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 250;

	public A61Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void imprime() {
		System.out.println("-------------");
		System.out.println("Nome " + this.nome);
		System.out.println("Velocidade máxima " + this.velocidadeMaxima);
		System.out.println("Velocidade Limite " + A61Carro.velocidadeLimite);
	}

	public static void setVelocidadeLimite(double velocidadeLimite) {
		A61Carro.velocidadeLimite = velocidadeLimite;
	}

	public static double getVelocidadeLimite() {
		return A61Carro.velocidadeLimite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

}
