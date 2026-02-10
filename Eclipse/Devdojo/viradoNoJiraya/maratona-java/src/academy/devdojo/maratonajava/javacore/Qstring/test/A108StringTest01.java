package academy.devdojo.maratonajava.javacore.Qstring.test;

public class A108StringTest01 {

	public static void main(String[] args) {
		// Strings são imutáveis
		String nome = "William"; // String Constant Pool: O Java verifica se já existe. Se sim, reutiliza.
									// Se não, cria. Economiza memória apontando referências para o mesmo local.

		String nome2 = "William";
		nome.concat(" Suane"); // Cria um NOVO objeto na memória ("William Suane").
								// Como não atribuímos (=), esse NOVO objeto vira lixo para o Garbage Collector.
								// A variável 'nome' continua apontando para "William".

		System.out.println(nome); // William - Imprime o original, pois String é imutável.

		System.out.println(nome == nome2); // True - Ambas apontam para o mesmo endereço no Pool.

		nome = nome.concat(" Suane"); // Agora sim: Mudamos a referência da variável 'nome' para o novo objeto.
		System.out.println(nome); // William Suane
									// OBS: O "William" antigo NÃO será comido pelo Garbage Collector ainda,
									// pois a variável 'nome2' (linha 11) continua segurando ele.

		String nome3 = new String("William"); // 1. Variável de referência, 2. Objeto na Heap (fora do Pool), 3. Literal
												// no Pool.
												// NÃO cria uma "nova pool", apenas cria um objeto duplicado na Heap
												// comum.

		System.out.println(nome2 == nome3); // False - Um está no Pool, o outro forçamos na Heap com 'new'.
											// Endereços de memória diferentes.

		// As strings são imutáveis. Para alterar o valor, precisamos criar um novo
		// objeto
		// e atualizar a referência (=), gerando lixo na memória se não cuidarmos.

	}

}