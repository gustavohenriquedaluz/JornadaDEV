package exercicios.aulas.A86ClassesAbstratas.domain;

public abstract class A86Notificacao {
	protected String destinatario;
	protected String mensagem;

	public A86Notificacao(String destinatario, String mensagem) {
		this.destinatario = destinatario;
		this.mensagem = mensagem;
	}

	public void visualizarDetalhes() {
		System.out.println("Para: [" + this.destinatario + "] | Msg: [" + this.mensagem + "]");
	}

	public abstract void enviar();

	@Override
	public String toString() {
		return "A86Notificacao [destinatario=" + destinatario + ", mensagem=" + mensagem + "]";
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
