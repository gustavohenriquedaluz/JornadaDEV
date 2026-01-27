package exercicios.aulas.A105Exception03;

public class A105FalhaDeAuditoriaException extends Exception {

	public A105FalhaDeAuditoriaException (String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
