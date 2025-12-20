package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.A77Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.A78Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.A79Ferrari;

public class A77CarroTest01 {

	public static void main(String[] args) {
		A77Carro carro = new A77Carro();

		System.out.println(A77Carro.VELOCIDADE_LIMITE);
		System.out.println(carro.COMPRADOR);
		carro.COMPRADOR.setNome("Kuririn");
		System.out.println(carro.COMPRADOR);
		A79Ferrari ferrari = new A79Ferrari();
		ferrari.setNome("Enzo");
		ferrari.imprime();

	}

}
