package exercicios.aulas.test;

import exercicios.aulas.domain.A61ModificadorStaticNaveEspacial;

public class A61ModificadorStaticNaveEspacialTest01 {

	public static void main(String[] args) {
		A61ModificadorStaticNaveEspacial nave1 = new A61ModificadorStaticNaveEspacial("Enterprise");
		A61ModificadorStaticNaveEspacial nave2 = new A61ModificadorStaticNaveEspacial("Millennium");
		A61ModificadorStaticNaveEspacial nave3 = new A61ModificadorStaticNaveEspacial("Falcon");
		A61ModificadorStaticNaveEspacial nave4 = new A61ModificadorStaticNaveEspacial("Serenity");

		System.out.println("A nave1 se chama " + nave1.getNome());
		System.out.println("A nave2 se chama " + nave2.getNome());
		System.out.println("A " + nave1.getNome() + " foi atualizada");
		nave1.setNome("Enterprise TURBO");
		System.out.println("A nave1 se chama " + nave1.getNome());

		A61ModificadorStaticNaveEspacial.consultaNavesCriadas();
	}

}
