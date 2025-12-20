package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.A44Calculadora;

public class A52CalculadoraTest05 {

	public static void main(String[] args) {
		A44Calculadora calculadora = new A44Calculadora();
		
		int[] numeros = {1,2,3,4,5};
		
		for (int i: numeros) {
			System.out.println(i);
		}
		
		
		System.out.println("-------------");
		
		calculadora.somarArray(numeros);
		
		
		
		calculadora.somaVarArgs(1,2,3,4,5);
		
	}

}
