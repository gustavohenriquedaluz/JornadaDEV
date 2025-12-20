package academy.devdojo.lacosderepeticao.fors;

//Eu como usuário gostaria de um sistema que fizesse automaticamente a tabuada de 1 a 10

public class A35Aula03ExercicioForAninhadoV2 {
	public static void main (String[]args) {
		
		for (int tabuada = 1; tabuada <= 10; tabuada++) {
			System.out.println("Tabuada do " + tabuada);
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(tabuada + "*" + i + " = " + (tabuada * i));
			}
			System.out.println("-----------");
		}		
	}
}
