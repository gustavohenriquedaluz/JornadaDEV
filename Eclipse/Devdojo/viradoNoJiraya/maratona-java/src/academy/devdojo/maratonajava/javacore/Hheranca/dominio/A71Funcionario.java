package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class A71Funcionario extends A71Pessoa {
	private double salario;
	
	static {
		System.out.println("Dentro do bloco de inicialização estático de funcionário");
	}

	{
		System.out.println("Dentro do construtor de funcionário 1");
	}

	{
		System.out.println("Dentro do construtor de funcionário 2");
	}

	public A71Funcionario(String nome) {
		super(nome);
		System.out.println("Dentro do construtor do funcionário");
	}

	public double getSalario() {
		return salario;
	}

	public void imprime() {
		super.imprime();
		System.out.println(this.salario);
	}

	public void relatorioPagamento() {
		System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
