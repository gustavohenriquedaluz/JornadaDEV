package exercicios.aulas.domain;

public class A61ModificadorStaticNaveEspacial {
	private String nome;
	private static int navesCriadas = 0;

	public A61ModificadorStaticNaveEspacial(String nome) {
		this.nome = nome;
		A61ModificadorStaticNaveEspacial.navesCriadas++;
		System.out.println("NavesCriadas = " + A61ModificadorStaticNaveEspacial.navesCriadas);
	}

	public static void consultaNavesCriadas() {
		System.out.println("NavesCriadas = " + A61ModificadorStaticNaveEspacial.navesCriadas);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
