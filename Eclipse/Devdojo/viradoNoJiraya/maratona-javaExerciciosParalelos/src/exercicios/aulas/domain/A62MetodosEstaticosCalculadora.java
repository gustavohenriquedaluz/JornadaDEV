package exercicios.aulas.domain;

public class A62MetodosEstaticosCalculadora {
	private String historicoUltimaOperacao;
	private static double versao = 1.0;
	public static final int a = 10;
	public static final int b = 2;
	
	{
	System.out.println("Calculadora inicializada. Versão: " + A62MetodosEstaticosCalculadora.versao);
	}
	
	public static int somar(int a, int b) {
		return a+b;
	}
	
	public static int subtrair(int a, int b) {
		return a-b;
	}
	
	public static int multiplicar(int a, int b) {
		return a*b;
	}
	
	public static double dividir(double a, double b) {
		return a/b;
	}
	
	public void setHistoricoUltimaOperacao(String operacao) {
		this.historicoUltimaOperacao = operacao;
	}
	
	public String getHistoricoUltimaOperacao() {
		return this.historicoUltimaOperacao;
	}
	
	
}
