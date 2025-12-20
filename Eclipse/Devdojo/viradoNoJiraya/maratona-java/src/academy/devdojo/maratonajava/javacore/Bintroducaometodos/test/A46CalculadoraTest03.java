package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.A44Calculadora;

public class A46CalculadoraTest03 {
	public static void main(String[] args) {
		A44Calculadora calculadora = new A44Calculadora();
		double result = calculadora.divideDoisNumeros(20, 0);
		System.out.println(result);
		System.out.println(calculadora.divideDoisNumeros02(20, 0));
		System.out.println("------------");
		calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
	}	
}
