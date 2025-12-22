package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class A84Desenvolvedor extends A84Funcionario {

	public A84Desenvolvedor(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.05;
	}


	@Override
	public String toString() {
		return "A84Desenvolvedor [nome=" + nome + ", salario=" + salario + "]";
	}
	
	

}
