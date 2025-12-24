package exercicios.aulas.A89Interfaces.domain;

public interface A89Monitoravel {
	public default void verificarPlaca() {
		System.out.println("Leitura padrão de placa (OCR básico)");
	}
}
