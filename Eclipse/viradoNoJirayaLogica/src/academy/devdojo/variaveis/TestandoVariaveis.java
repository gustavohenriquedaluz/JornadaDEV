package academy.devdojo.variaveis;

public class TestandoVariaveis {
	public static void main(String[] args) {
		char masculino = 'M';
		char feminino = 'F';
		String frase = "Aqui você pode colocar uma frase beeem grande!";
		boolean condicao = true;
		System.out.println(masculino + feminino); // Retorno 147
		System.out.println("" + masculino + feminino); // Retorno MF
		System.out.println(frase); // Retorno Aqui você pode colocar uma frase beeem grande!
		System.out.println(condicao); // Ao imprimir um boolean, o retorno se torna uma String
	}
}
