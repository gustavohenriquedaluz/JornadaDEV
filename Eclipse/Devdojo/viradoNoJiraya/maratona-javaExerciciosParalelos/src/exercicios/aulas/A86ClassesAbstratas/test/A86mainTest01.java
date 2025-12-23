package exercicios.aulas.A86ClassesAbstratas.test;

import exercicios.aulas.A86ClassesAbstratas.domain.A86Email;
import exercicios.aulas.A86ClassesAbstratas.domain.A86Notificacao;
import exercicios.aulas.A86ClassesAbstratas.domain.A86Whatsapp;

public class A86mainTest01 {

	public static void main(String[] args) {
		// A86Notificacao notificacao = new A86Notificacao(); Erro

		A86Email email = new A86Email("Chaves", "Bom dia!");
		email.enviar();
		email.visualizarDetalhes();

		A86Whatsapp whatsapp = new A86Whatsapp("Gemini", "Give me your power!", "Windows");
		whatsapp.enviar();
		whatsapp.visualizarDetalhes();
		System.out.println(whatsapp);
		whatsapp.setDestinatario("ChatGPT");
		System.out.println("Destinatário mudado para ChatGPT"); // Teste mudar destinatário
		whatsapp.enviar();
		whatsapp.visualizarDetalhes();
		System.out.println(whatsapp);

	}

}
