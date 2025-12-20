package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum A80TipoCliente {
	PESSOA_FISICA(1, "Pessoa Física"),
	PESSOA_JURIDICA(2, "Pessoa Jurídica");
	
	private int valor;
	private String nomeRelatorio;
	
	A80TipoCliente(int valor, String nomeRelatorio) {
		this.valor = valor;
		this.nomeRelatorio = nomeRelatorio;
	}

	
	public static A80TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
		for (A80TipoCliente tipoCliente : values()) {
			if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
				return tipoCliente;
			}
		}
		return null;
		}
	
	
	public int getValor() {
		return valor;
	}

	public String getNomeRelatorio() {
		return nomeRelatorio;
	}
	
	
}
