package exercicios.aulas.domain;

public class A60BlocosDeInicializacaoPersonagem {
	private String nome;
	private int nivel = 1;

	// Bloco de inicializacao
	{
		System.out.println("Bloco de Instância: Preparando novo personagem...");
		System.out.println("Nível inicial (antes do bloco): " + this.nivel);
		this.nivel = 5;
	}

	public A60BlocosDeInicializacaoPersonagem(String nome) {
		this.nome = nome;
		System.out.println("Construtor: Personagem criado! Nível final:" + this.nivel);
	}

	public void exibirStatus() {
		System.out.println("Status atual:");
		System.out.println("Nome: " + this.nome);
		System.out.println("Nível: " + this.nivel);
	}

}
