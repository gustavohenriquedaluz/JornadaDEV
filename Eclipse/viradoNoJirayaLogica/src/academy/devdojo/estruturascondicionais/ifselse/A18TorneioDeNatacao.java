package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class A18TorneioDeNatacao {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu nome");
		String nome = scanner.nextLine();
		
		System.out.println("Digite sua idade");
		int idade = scanner.nextInt();		
		
		if (idade <= 10) {
			System.out.println(nome + " participará da categoria Infantil.");
		} else if (idade <= 15) {
			System.out.println(nome + " participará da categoria Juvenil.");
		} else if (idade <= 19) {
			System.out.println(nome + " participará da categoria Pré-adulto.");
		} else if (idade >= 20) {
			System.out.println(nome + " particiará da categoria Adulto.");
		}
		
		scanner.close();
	}
}
