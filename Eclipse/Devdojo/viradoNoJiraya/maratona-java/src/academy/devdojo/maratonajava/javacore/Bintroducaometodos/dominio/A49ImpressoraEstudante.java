package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class A49ImpressoraEstudante {
	public void imprime(A49Estudante estudante) {
		
		System.out.println("------------------");
		
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);

		estudante.nome = "Gohan";
	}
	
	
	
}
