package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

/* 
 Apresentar ao usuário uma tela solicitando um login e depois uma senha,
 o usuário e senha corretos devem estar armazenados em constantes no seu programa.
 Se o usuário acertar o usuário e a senha exibir a mensagem ACESSO CONCEDIDO,
 caso contrário exibir a mensagem ACESSO NEGADO e voltar a pedir o usuário e senha,
 essa condição deve-se repetir até que o usuário acerte a combinação.
 */

public class A31Aula04ExercicioLogin {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String usuario = "admin";
		String senha = "senhacomplexa";
		

		
				
		System.out.println("Para acessar o sistema, entre com seu usuário e senha:");	
		System.out.println("Digite o usuário:");
		String imputUsuario =  scanner.nextLine();
		
		System.out.println("Digite a senha:");
		String imputSenha =  scanner.nextLine();		
		
		while (!imputUsuario.equalsIgnoreCase(usuario) || !imputSenha.equalsIgnoreCase(senha)) {
			System.out.println("Acesso negado, digite os dados corretos para prosseguir:");
			System.out.println("Digite o usuário:");
			imputUsuario =  scanner.nextLine();
				
			System.out.println("Digite a senha:");
			imputSenha =  scanner.nextLine();	
		}
		
		System.out.println("Acesso concedido.");		
		
		scanner.close();
	}
	
}