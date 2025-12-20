package academy.devdojo.lacosderepeticao.fors;

// Eu como usuário gostaria de um sistema que fizesse automaticamente a tabuada de 1 a 10

public class A35Aula03ExercicioForAninhado {
	public static void main (String[]args) {
		int numTabuada = 1;
		
		for (int i = 1; numTabuada <= 10; i++) {
			System.out.println(numTabuada + "*" + i + "=" + (numTabuada*i));
			if (i == 10) {
				numTabuada++;
				i = 0;
				System.out.println("-----------");
			}
		}		
	}
}
