package exercicios.aulas.A83Enumeracao.test;

import exercicios.aulas.A83Enumeracao.domain.A83StatusEntrega;

public class A83EnumTest01 {

	public static void main(String[] args) {
		System.out.println("A84 - Teste Enum");

		A83StatusEntrega codigo1 = A83StatusEntrega.buscaPorCodigo(2);
		A83StatusEntrega codigo2 = A83StatusEntrega.buscaPorCodigo(5);

		if (codigo1 == null) {
			System.out.println("Código inválido");
		} else {
			System.out.println(codigo1.getDescricao());
		}

		if (codigo2 == null) {
			System.out.println("Código inválido");
		} else {
			System.out.println(codigo2.getDescricao());
		}

		// Valueof test

		System.out.println(A83StatusEntrega.valueOf("EM_TRANSITO")); // Sem getCodigo
		System.out.println(A83StatusEntrega.valueOf("EM_TRANSITO").getCodigo()); // Com getCodigo

	}

}
