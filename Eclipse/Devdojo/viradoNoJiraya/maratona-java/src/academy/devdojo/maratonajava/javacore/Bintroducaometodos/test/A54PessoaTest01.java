package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.A54Pessoa;

public class A54PessoaTest01 {

	public static void main(String[] args) {
		A54Pessoa pessoa = new A54Pessoa();
		//pessoa.nome = "Jiraya";
		pessoa.setNome("Jiraya");
		pessoa.setIdade(70);
		//pessoa.imprime()
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
	}

}
