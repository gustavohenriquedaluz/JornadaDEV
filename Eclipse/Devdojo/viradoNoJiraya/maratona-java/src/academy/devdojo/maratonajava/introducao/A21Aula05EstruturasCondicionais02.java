package academy.devdojo.maratonajava.introducao;

public class A21Aula05EstruturasCondicionais02 {
	public static void main(String[] args) {
		// idade < 15 categoria infantil
		// idade >= 15 && idade <18 categoria juvenil
		// idade >= 18 categoria adulto
		
		int idade = 40;
		
		if (idade < 15) {
			System.out.println("A idade é " + idade + " portanto a categoria é Infantil.");
		} else if (idade >= 15 && idade < 18) {
			System.out.println("A idade é " + idade + " portanto a categoria é Juvenil.");
		} else if (idade >= 18) {
			System.out.println("A idade é " + idade + " portanto a categoria é Adulto.");
		} else {
			System.out.println("Verificar, está errado");
		}
		
	}
}
