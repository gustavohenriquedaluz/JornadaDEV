package exercicios.aulas.A89Interfaces.domain;

public class A89ViaturaPolicia extends A89Veiculo implements A89Monitoravel {

	public A89ViaturaPolicia(String tipo, String placa) {
		super(tipo, placa);
	}

	@Override
	public void verificarPlaca() {
		System.out.println("Liberar cancela - Veículo Oficial");
	}
	
}
