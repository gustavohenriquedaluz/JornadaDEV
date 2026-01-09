package exercicios.aulas.A99ExceptionPT1.test;

import java.io.IOException;

import exercicios.aulas.A99ExceptionPT1.domain.A99SistemaLogin;

public class A99ExceptionTest01 {

	public static void main(String[] args) {

		
		try { // Teste com erros, imput de usuário e senha inválidos
			A99SistemaLogin.logar("teste", "banco_off");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Sistema indisponível, tente mais tarde.");
		}
//		Console:
//		java.io.IOException: Falha de conexão com o banco
//		Sistema indisponível, tente mais tarde.
//			at exercicios.aulas.A99ExceptionPT1.domain.A99SistemaLogin.logar(A99SistemaLogin.java:12)
//			at exercicios.aulas.A99ExceptionPT1.test.A99ExceptionTest01.main(A99ExceptionTest01.java:13)

		System.out.println("-----------------------");
		
		
		try { // Teste Sem erros
			A99SistemaLogin.logar("Ivaldo", "Carneiro22");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Sistema indisponível, tente mais tarde.");
		}

		System.out.println("-----------------------");
		
		
		// Aqui ele lança a exception illegalArgument, mas ele não imprime no console, pois não é pego no catch, uma vez que
		// não é IOException, mas como capturar isso então?
		try { // Teste com senha inválida
			A99SistemaLogin.logar("Ivaldo", null);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Sistema indisponível, tente mais tarde.");
		}
		
		
	}

}
