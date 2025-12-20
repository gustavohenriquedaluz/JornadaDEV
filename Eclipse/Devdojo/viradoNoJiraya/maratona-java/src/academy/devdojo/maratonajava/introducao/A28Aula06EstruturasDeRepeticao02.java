package academy.devdojo.maratonajava.introducao;

public class A28Aula06EstruturasDeRepeticao02 {
	public static void main (String[]srgs) {
		//Imprima todos os números pares de 0 até 1000000
		
		int i = 0;
		while (i <= 1000000) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		
	}
}
