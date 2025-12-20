package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

/*
Crie uma classe Funcionário com os seguintes atributos
nome
idade
salario // três salários devem ser guardados

Crie dois métodos
1)Para imprimir os dados
2)Para tirar a média dos salários e imprimir o resultado
*/

public class A53ExercicioFuncionario {
	private String nome;
	private int idade;
	private double[] salarios;
	private double media;

	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		if (salarios == null) {
			return;
		}
		for (double salario : salarios) {
			System.out.print(salario + " ");
		}

		imprimeMediaSalario();
	}

	public void imprimeMediaSalario() {
		if (salarios == null) {
			return;
		}

		for (double salario : salarios) {
			media += salario;
		}
		media /= salarios.length;

		System.out.println("\nMédia salarial " + media);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getSalarios() {
		return salarios;
	}

	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}

	public double getMedia() {
		return media;
	}

	
	
}
