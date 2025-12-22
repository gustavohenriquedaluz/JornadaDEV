package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class A84Funcionario extends A86Pessoa {
	protected String nome;
	protected double salario;

	public A84Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	}
	
	

	@Override
	public void imprime() {
		System.out.println("Imprimindo");
	}



	public abstract void calculaBonus();

}
