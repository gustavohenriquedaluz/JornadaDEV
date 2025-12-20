package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.A61Carro;

public class A61CarroTest01 {

	public static void main(String[] args) {
		A61Carro.setVelocidadeLimite(180);

		A61Carro c1 = new A61Carro("BMW", 280);
		A61Carro c2 = new A61Carro("Mercedes", 275);
		A61Carro c3 = new A61Carro("Audi", 290);

		c1.imprime();
		c2.imprime();
		c3.imprime();
	}

}
