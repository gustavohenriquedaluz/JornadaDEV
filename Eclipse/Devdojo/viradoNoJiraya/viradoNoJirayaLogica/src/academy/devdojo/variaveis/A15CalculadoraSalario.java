package academy.devdojo.variaveis;

public class A15CalculadoraSalario {
	public static void main(String[]args) {
		double salario = 4000.00;
		float porcentagem = 0; 
		double resultado = 0;
		if (salario > 4500) {
			porcentagem = 30;
		} else {
			porcentagem = 15;
		}
		resultado = salario * (porcentagem / 100);
		System.out.println(porcentagem + "% de " + salario + " é " + resultado);
	}
}


