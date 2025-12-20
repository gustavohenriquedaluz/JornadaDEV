package exercicios.aulas.A75HerancaSeqInicializacao.domain;

public class A75Pagamento {
	protected double valor;
	private int ano;
	
	
	static {
		System.out.println("Dentro do bloco de inicialização estático PAI");
	}
	
	{
		System.out.println("Dentro do bloco de incialização do PAI");
	}
	
	public A75Pagamento(double valor) {
		this.valor = valor;
		System.out.println("Dentro do construtor PAI");
	}
	
	public void imprime() {
		System.out.println("Imprimir relatório:");
		System.out.println("Valor: " + this.valor);
		System.out.println("Ano: " + this.ano);
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
