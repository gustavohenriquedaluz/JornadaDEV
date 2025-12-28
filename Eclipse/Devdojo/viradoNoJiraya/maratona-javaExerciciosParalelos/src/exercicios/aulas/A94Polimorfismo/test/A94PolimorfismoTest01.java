package exercicios.aulas.A94Polimorfismo.test;


import exercicios.aulas.A94Polimorfismo.domain.A94Boleto;
import exercicios.aulas.A94Polimorfismo.domain.A94Pagavel;
import exercicios.aulas.A94Polimorfismo.domain.A94Pix;
import exercicios.aulas.A94Polimorfismo.service.A94ProcessadorPagamento;

public class A94PolimorfismoTest01 {

	public static void main(String[] args) {
		A94Pagavel[] pagamentos = new A94Pagavel[2];
		pagamentos[0] = new A94Pix();
		pagamentos[1] = new A94Boleto();

		for (A94Pagavel pagavel : pagamentos) {
			A94ProcessadorPagamento.processar(pagavel);
		}
	}

}
