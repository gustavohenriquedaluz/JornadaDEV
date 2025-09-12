package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class A22CLogin {
	public static void main (String[] args) {
		/*
		Eu, como administrador do sistema, gostaria de permitir que os próprios
		usuários cadastrassem o nome de usuário (login) no sistema para agilizar
		o processo de migração do sistema antigo para o novo.

		O usuário não pode deixar o login vazio "", ou criar um usuário com o login "admin" ou "administrador".
		Se o valor entrado for válido, o sistema deverá exibir uma mensagem "<nome do usuário> cadastrado com sucesso"
		Senão o sistema deverá mostrar o erro "Usuário inválido"
		 */
		
		Scanner scanner = new Scanner(System.in); // Ferramenta para inputar dado no console
		
		System.out.println("Digite o usuário abaixo");
		System.out.println("OBS: Não pode ser um usuário vazio, com nome 'admin' ou 'adminstrador'");
		String usuario = scanner.nextLine(); // Captura a próxima linha
		
		System.out.println("Usuário digitado: " + usuario);
		
		if (usuario == null || usuario.isBlank() || usuario.equals("admin") || usuario.equals("Admin") || usuario.equals("administrador") || usuario.equals("Administrador")) {
			System.out.println("Usuário inválido, digite o usuário corretamente.");
		} else {
			System.out.println("Usuário " + usuario + " cadastrado com sucesso.");
		}
		
		scanner.close();
	}
}
