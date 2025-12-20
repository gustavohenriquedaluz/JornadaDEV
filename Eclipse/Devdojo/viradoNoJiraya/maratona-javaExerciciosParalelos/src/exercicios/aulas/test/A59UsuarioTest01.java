package exercicios.aulas.test;

import exercicios.aulas.domain.A59Usuario;

public class A59UsuarioTest01 {

	public static void main(String[] args) {
		A59Usuario usuario01 = new A59Usuario("Benedito", "benedito@gmail.com");

		System.out.println(usuario01.getApelido()); // teste para ver se retorna null e IF funciona

		A59Usuario usuario02 = new A59Usuario("Fernando", "fer@gmail.com", -20, "Fernandera");

		A59Usuario usuario03 = new A59Usuario("Gustavo", "gstv@gmail.com", "Gustavo Rei do Java");

		System.out.println("--------------");
		usuario01.mostrarPerfil();
		System.out.println("--------------");
		usuario02.mostrarPerfil();
		usuario02.setIdade(54); // Corrigindo idade
		System.out.println("Idade corrigida para 54");
		usuario02.mostrarPerfil();
		System.out.println("--------------");
		usuario03.mostrarPerfil();
	}

}
