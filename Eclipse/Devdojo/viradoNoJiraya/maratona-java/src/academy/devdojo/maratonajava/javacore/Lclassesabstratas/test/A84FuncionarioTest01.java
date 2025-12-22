package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.A84Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.A84Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.A84Gerente;

public class A84FuncionarioTest01 {

	public static void main(String[] args) {
		A84Gerente gerente = new A84Gerente("Nami", 5000);
		A84Desenvolvedor desenvolvedor = new A84Desenvolvedor("Touya", 12000);
		System.out.println(gerente);
		System.out.println(desenvolvedor);
		gerente.imprime();
		desenvolvedor.imprime();
	}

}
