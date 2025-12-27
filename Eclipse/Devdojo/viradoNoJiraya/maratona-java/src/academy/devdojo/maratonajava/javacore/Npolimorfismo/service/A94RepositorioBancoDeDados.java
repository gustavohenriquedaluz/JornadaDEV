package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.A94Repositorio;

public class A94RepositorioBancoDeDados implements A94Repositorio {
	
	@Override
	public void salvar() {
		System.out.println("Salvando em um banco de dados");
	}
}
