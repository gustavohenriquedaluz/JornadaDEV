package exercicios.aulas.A75HerancaSeqInicializacao.domain;

public class A75PagamentoCartao extends A75Pagamento {
	private String bandeira;

	public A75PagamentoCartao(double valor, String bandeira, int ano) {
		super(valor);
		this.bandeira = bandeira;
		this.setAno(ano);
	}

	static {
		System.out.println("Dentro do bloco de inicialização estático do FILHO");
	}

	{
		System.out.println("Dentro do bloco de inicialização do FILHO");
	}
	
	@Override
	public void imprime() {
		System.out.println("Imprimir relatório sobrescrito:");
		System.out.println("Valor: " + super.valor);
		System.out.println("Bandeira: " + this.bandeira);
		System.out.println("Ano: " + super.getAno());
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

}
