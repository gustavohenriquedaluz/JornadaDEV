package exercicios.aulas.test;

import exercicios.aulas.domain.A62MetodosEstaticosCalculadora;

public class A62MetodosEstaticosCalculadoraTest01 {

	public static void main(String[] args) {
		System.out.println("Argumentos: A = "+A62MetodosEstaticosCalculadora.a + " B = " + A62MetodosEstaticosCalculadora.b);
		System.out.println("Somar: " + A62MetodosEstaticosCalculadora.somar(A62MetodosEstaticosCalculadora.a, A62MetodosEstaticosCalculadora.b));
		System.out.println("Subtrair: " + A62MetodosEstaticosCalculadora.subtrair(A62MetodosEstaticosCalculadora.a, A62MetodosEstaticosCalculadora.b));
		System.out.println("Multiplicar: " + A62MetodosEstaticosCalculadora.multiplicar(A62MetodosEstaticosCalculadora.a, A62MetodosEstaticosCalculadora.b));
		System.out.println("Dividir: " + A62MetodosEstaticosCalculadora.dividir(A62MetodosEstaticosCalculadora.a, A62MetodosEstaticosCalculadora.b));
		
		System.out.println("------------------------");
		
		A62MetodosEstaticosCalculadora calc1 = new A62MetodosEstaticosCalculadora();
		A62MetodosEstaticosCalculadora calc2 = new A62MetodosEstaticosCalculadora();
		
		calc1.setHistoricoUltimaOperacao("Soma e Subtração");
		calc2.setHistoricoUltimaOperacao("Multiplicação e Divisão");
		
		System.out.println(calc1.getHistoricoUltimaOperacao());
		System.out.println(calc2.getHistoricoUltimaOperacao());
	}

}
