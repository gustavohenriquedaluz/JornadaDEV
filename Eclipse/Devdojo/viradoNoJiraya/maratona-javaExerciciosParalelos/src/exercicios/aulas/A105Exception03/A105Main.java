package exercicios.aulas.A105Exception03;

public class A105Main {
	public static void main(String[] args) {
		A105ServicoAuditoria servicoAuditoria = new A105ServicoAuditoria();
		try {
			servicoAuditoria.processar();
		} catch (A105FalhaDeAuditoriaException e) {
			e.printStackTrace();
		}
	}
}
