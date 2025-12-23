package exercicios.aulas.A86ClassesAbstratas.domain;

public class A86Email extends A86Notificacao {

	public A86Email(String destinatario, String mensagem) {
		super(destinatario, mensagem);
	}

	@Override
	public void enviar() {
		System.out.println("Conectando servidor SMTP... Enviando Email para [" + super.destinatario +"]");
	}

	
	
}
