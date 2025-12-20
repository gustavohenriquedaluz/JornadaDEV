package academy.devdojo.variaveis;

public class A11PorcentagemSalario {
	public static void main(String[] args) {
	double salario = 1500.0;	
	double porcentagem = 30;
	//porcentagem = 15;
	//porcentagem = 5;
	double resultado = salario * (porcentagem / 100);
	System.out.println(porcentagem + "% do salário R$" + salario + " representa o valor de R$" + resultado);
	}
}
