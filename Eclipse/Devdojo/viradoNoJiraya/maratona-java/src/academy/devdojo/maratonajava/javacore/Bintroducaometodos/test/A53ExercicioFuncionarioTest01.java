package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.A53ExercicioFuncionario;

public class A53ExercicioFuncionarioTest01 {

	public static void main(String[] args) {
		A53ExercicioFuncionario funcionario = new A53ExercicioFuncionario();
		funcionario.setNome("Sanji");
		funcionario.setIdade(23);
		funcionario.setSalarios(new double[] {1200, 987.32, 2000});
		funcionario.imprime();
		System.out.println("Média: " + funcionario.getMedia());
		
	}

}
