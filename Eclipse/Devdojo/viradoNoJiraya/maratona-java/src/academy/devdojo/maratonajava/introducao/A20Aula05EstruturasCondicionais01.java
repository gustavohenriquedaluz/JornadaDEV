package academy.devdojo.maratonajava.introducao;

public class A20Aula05EstruturasCondicionais01 {
	public static void main(String[] args) {
		int idade = 20;
		boolean isAutorizadoComprarBebida = idade >=18;
		// !
		
		if (isAutorizadoComprarBebida != false) { // Se true
			System.out.println("Autorizado a comprar bebida alcólica");
		} else {
			System.out.println("Não autorizado a comprar bebida alcóliza");			
		}
		
		if (!isAutorizadoComprarBebida) { //Se false
			System.out.println("Não autorizado a comprar bebida alcóliza");
		}
		boolean c = true;
		if (c ==  false) {
			
		}
		
		System.out.println("Fora do IF");
	}
}
