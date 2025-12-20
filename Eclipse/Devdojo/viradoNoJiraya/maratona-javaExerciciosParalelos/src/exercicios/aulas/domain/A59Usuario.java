package exercicios.aulas.domain;

public class A59Usuario {
	private String nome;
	private String email;
	private int idade;
	private String apelido;

	public A59Usuario(String nome, String email) { // Construtor principal
		this.nome = nome;
		this.email = email;
	}

	public A59Usuario(String nome, String email, int idade) { // Construtor secundário c idade
		this(nome, email);
		this.idade = idade;
	}

	public A59Usuario(String nome, String email, String apelido) { // Construtor secundário c apelido
		this(nome, email);
		this.apelido = apelido;
	}

	public A59Usuario(String nome, String email, int idade, String apelido) { // Construtor terciario c idade e apelido
		this(nome, email, idade);
		this.apelido = apelido;
	}

	public void mostrarPerfil() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		if (this.idade == 0) {
			System.out.println("Idade: Não informada");
		} else if (this.idade < 0) {
			System.out.println("Idade inválida, recrie o objeto ou corrija com setter");
		} else {
			System.out.println("Idade: " + this.idade);
		}

		if (this.apelido == null) {
			System.out.println("Apelido: Não informado");
		} else {
			System.out.println("Apelido: " + this.apelido);
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

}
