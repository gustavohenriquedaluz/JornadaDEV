package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import java.util.LinkedList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.A94Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.A94RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.A94RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.A94RepositorioMemoria;

public class A94RepositorioTest01 {
	public static void main(String[] args) {

		A94Repositorio repositorio = new A94RepositorioMemoria();
		repositorio.salvar();
		
		List<String> list = new LinkedList<>();
		list.add("Goku");
		list.add("Vegeta");
		list.add("Kuririn");
		System.out.println(list);
		
	}
}
