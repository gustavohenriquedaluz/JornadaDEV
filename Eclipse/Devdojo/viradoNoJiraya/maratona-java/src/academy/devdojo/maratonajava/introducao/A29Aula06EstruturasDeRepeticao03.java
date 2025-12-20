package academy.devdojo.maratonajava.introducao;

public class A29Aula06EstruturasDeRepeticao03 {
	// Imprima os primeiros 25 números de um dado valor. por exemplo, 50.
	public static void main(String[] args) {

		int numeroBase = 50;
		int numerofinal = numeroBase + 25;

		numeroBase = 50;
		while (numeroBase < 100) {
			System.out.println(numeroBase);
			if (numeroBase == numerofinal) {
				break;
			}
			numeroBase = numeroBase + 1;
		}
		
		//Professor
		
		int valorMax = 50;
		for (int i = 0; i <= valorMax; i++) {
			if (i > 25) {
				break;
			}
			System.out.println(i);
		}
	}
}
