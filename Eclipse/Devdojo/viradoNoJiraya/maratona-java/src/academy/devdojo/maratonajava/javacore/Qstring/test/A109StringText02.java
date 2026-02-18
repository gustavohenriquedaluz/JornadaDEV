package academy.devdojo.maratonajava.javacore.Qstring.test;

public class A109StringText02 {

	public static void main(String[] args) {
		String nome = "Luffy";
		String numeros = "012345";
		System.out.println(nome.charAt(0));
		System.out.println(nome.length());
		System.out.println(nome.replace("f", "l"));
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		System.out.println(numeros.length());
		System.out.println(numeros.substring(3, numeros.length())); // Primeiro número é inclusivo, começa a partir
																	// dele, o segundo é exclusivo, vai até ele mas não
																	// inclui ele
		System.out.println(numeros.substring(1, 3)); // 12 - Começa no 1, vai até o 3 mas não inclui ele, e sim o
														// restante de antes

		System.out.println(nome.trim()); // remove os espaços em branco

	}

}
