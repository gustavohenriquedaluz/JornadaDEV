package exercicios.aulas.A86ClassesAbstratas.domain;

public class A86Whatsapp extends A86NotificacaoMobile {

	public A86Whatsapp(String destinatario, String mensagem, String sistemaOperacional) {
		super(destinatario, mensagem, sistemaOperacional);
	}

	@Override
	public void enviar() {
		System.out.println(
				"Abrindo API do WhatsApp no [" + sistemaOperacional + " ]... Enviando msg para [" + destinatario + "]");
	}

}
