package exercicios.aulas.A94Polimorfismo.service;

import exercicios.aulas.A94Polimorfismo.domain.A94Boleto;
import exercicios.aulas.A94Polimorfismo.domain.A94Pagavel;
import exercicios.aulas.A94Polimorfismo.domain.A94Pix;

public class A94ProcessadorPagamento {

	public static void processar(A94Pagavel pagavel) {
		
		pagavel.processarPagamento();
		
		if (pagavel instanceof A94Boleto) {
			((A94Boleto)pagavel).gerarCodigoBarras();
		} else if (pagavel instanceof A94Pix) {
			((A94Pix)pagavel).gerarQrCode();
		} else {
			System.out.println("Revisar tipo de pagamento.");
		}
	}
	
}