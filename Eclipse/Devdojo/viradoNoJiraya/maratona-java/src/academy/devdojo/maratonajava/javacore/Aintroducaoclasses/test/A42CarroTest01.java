package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.A42Carro;

public class A42CarroTest01 {
	public static void main(String[] args) {
		A42Carro carro1 = new A42Carro();
		A42Carro carro2 = new A42Carro();
		
		carro1.nome = "Fusca";
		carro1.modelo = "Classico Gasolina";
		carro1.ano = 1984;
		
		carro2.nome = "Polo";
		carro2.modelo = "Confort plus flex";
		carro2.ano = 2005;
		
		
		System.out.println("Carro " + carro1.nome + ", modelo " + carro1.modelo + ", " + carro1.ano);
		System.out.println("Carro " + carro2.nome + ", modelo " + carro2.modelo + ", " + carro2.ano);
		
	}
}
