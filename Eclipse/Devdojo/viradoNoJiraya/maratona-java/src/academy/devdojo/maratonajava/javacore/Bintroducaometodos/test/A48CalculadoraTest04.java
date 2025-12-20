package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.A44Calculadora;

public class A48CalculadoraTest04 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		A44Calculadora calculadora = new A44Calculadora();
		calculadora.alteraDoisNumeros(num1, num2);
		System.out.println("Dentro A48CalculadoraTest04");
		System.out.println(num1);
		System.out.println(num2);

	}

}
