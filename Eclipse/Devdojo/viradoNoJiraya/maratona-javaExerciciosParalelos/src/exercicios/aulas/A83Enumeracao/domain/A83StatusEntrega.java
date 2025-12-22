package exercicios.aulas.A83Enumeracao.domain;

public enum A83StatusEntrega {

	EM_PREPARACAO(1, "Aguardando preparo"), 
	EM_TRANSITO(2, "Saiu para entrega"), 
	ENTREGUE(3, "Entregue ao cliente");

	private int codigo;
	private String descricao;

	private A83StatusEntrega(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static A83StatusEntrega buscaPorCodigo(int codigo) {
		for (A83StatusEntrega statusEntrega : values()) {
			if (statusEntrega.getCodigo() == codigo) {
				return statusEntrega;
			}
		}
		return null;
	}
	
	

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

}
