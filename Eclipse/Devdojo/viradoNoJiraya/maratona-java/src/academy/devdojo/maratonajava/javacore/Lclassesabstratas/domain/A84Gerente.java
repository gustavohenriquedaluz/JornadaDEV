package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class A84Gerente extends A84Funcionario {

	public A84Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public String toString() {
		return "A84Gerente [nome=" + nome + ", salario=" + salario + "]";
	}

	@Override
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.2;
	}

}
