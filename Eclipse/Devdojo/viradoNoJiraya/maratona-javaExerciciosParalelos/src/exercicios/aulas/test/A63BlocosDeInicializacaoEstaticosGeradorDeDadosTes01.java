package exercicios.aulas.test;

import exercicios.aulas.domain.A63BlocosDeInicializacaoEstaticosGeradorDeDados;

public class A63BlocosDeInicializacaoEstaticosGeradorDeDadosTes01 {

	public static void main(String[] args) {
		
		System.out.println("-----------------");
		A63BlocosDeInicializacaoEstaticosGeradorDeDados g1 = new A63BlocosDeInicializacaoEstaticosGeradorDeDados();
		A63BlocosDeInicializacaoEstaticosGeradorDeDados g2 = new A63BlocosDeInicializacaoEstaticosGeradorDeDados();

		System.out.println("-----------------");

		A63BlocosDeInicializacaoEstaticosGeradorDeDados.getNumerosGerados();
	}

}
