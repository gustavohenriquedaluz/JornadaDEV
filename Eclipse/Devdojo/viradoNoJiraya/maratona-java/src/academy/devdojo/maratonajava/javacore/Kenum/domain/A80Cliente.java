package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class A80Cliente {


	private String nome;
	private A80TipoCliente tipoCliente;
	private A82TipoPagamento tipoPagamento;

	public A80Cliente(String nome, A80TipoCliente tipoCliente, A82TipoPagamento tipoPagamento) {
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "A80Cliente [nome=" + nome + ", tipoCliente=" + tipoCliente.getNomeRelatorio() + ", tipoClienteInt=" + tipoCliente.getValor()
				+ ", tipoPagamento=" + tipoPagamento + "]";
	}

}
