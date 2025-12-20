package exercicios.aulas.A75HerancaSeqInicializacao.test;

import exercicios.aulas.A75HerancaSeqInicializacao.domain.A75PagamentoCartao;

public class A75PagamentoTest01 {

	public static void main(String[] args) {
		A75PagamentoCartao pagCartao = new A75PagamentoCartao(1500.97, "Mastercard", 2025);
		pagCartao.imprime();
	}

}
