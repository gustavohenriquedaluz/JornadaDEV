package exercicios.aulas.test;

import exercicios.aulas.domain.A58Filme;

public class A58FilmeTest01 {

	public static void main(String[] args) {
		A58Filme filme = new A58Filme("Nemo", "Zeca Pagodinho");
		
		A58Filme filme2 = new A58Filme("Os Incríveis", "Google Bard", 2077);
		
		System.out.println(filme.getTitulo());
		System.out.println(filme.getDiretor());
		System.out.println(filme.getAnoLancamento());
		filme.exibirDetalhes();
		
		
		System.out.println(filme2.getTitulo());
		System.out.println(filme2.getDiretor());
		System.out.println(filme2.getAnoLancamento());
		filme2.exibirDetalhes();
	}

}
