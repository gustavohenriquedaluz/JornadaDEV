package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.A80Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.A80TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.A82TipoPagamento;

public class A80ClienteTest01 {
	public static void main(String[] args) {
		A80Cliente cliente1 = new A80Cliente("Tsubasa", A80TipoCliente.PESSOA_FISICA, A82TipoPagamento.CREDITO);
		A80Cliente cliente2 = new A80Cliente("Akira", A80TipoCliente.PESSOA_JURIDICA, A82TipoPagamento.CREDITO);
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(A82TipoPagamento.DEBITO.calcularDesconto(100));
		A80TipoCliente tipoCliente = A80TipoCliente.valueOf("PESSOA_FISICA");
		System.out.println(tipoCliente.getNomeRelatorio());
		A80TipoCliente tipoCliente2 = A80TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
		System.out.println(tipoCliente2);
		System.out.println(tipoCliente.PESSOA_FISICA.getNomeRelatorio());
	}
}
