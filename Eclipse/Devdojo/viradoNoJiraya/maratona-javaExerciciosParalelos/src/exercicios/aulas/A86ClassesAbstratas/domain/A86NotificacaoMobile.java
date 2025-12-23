package exercicios.aulas.A86ClassesAbstratas.domain;

public abstract class A86NotificacaoMobile extends A86Notificacao {
	protected String sistemaOperacional;

	public A86NotificacaoMobile(String destinatario, String mensagem, String sistemaOperacional) {
		super(destinatario, mensagem);
		this.sistemaOperacional = sistemaOperacional;
	}

	@Override
	public String toString() {
		return "A86NotificacaoMobile [sistemaOperacional=" + sistemaOperacional + ", destinatario=" + destinatario
				+ ", mensagem=" + mensagem + "]";
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

}
