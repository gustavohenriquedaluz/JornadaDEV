package exercicios.aulas.A94Polimorfismo.domain;

public class A94Pix implements A94Pagavel {

	@Override
	public void processarPagamento() {
		System.out.println("Pagando via Pix");
	}
	
	public void gerarQrCode() {
		System.out.println("Gerando QR Code...");
	}
	

}
