package exercicios.aulas.A89Interfaces.test;

import exercicios.aulas.A89Interfaces.domain.A89Caminhao;
import exercicios.aulas.A89Interfaces.domain.A89CarroPasseio;
import exercicios.aulas.A89Interfaces.domain.A89PassagemTributavel;
import exercicios.aulas.A89Interfaces.domain.A89ViaturaPolicia;

public class A89InterfaceExercicio01 {

	public static void main(String[] args) {
		// A89CarroPasseio.consultarTabelaPreco(); Erro
		A89PassagemTributavel.consultarTabelaPreco(); // Chamando pela interface
		
		A89CarroPasseio carroPasseio =  new A89CarroPasseio("Polo", "SBH-8R69");
		A89Caminhao caminhao =  new A89Caminhao("Caminhãozão", "YGV-7Q93");
		A89ViaturaPolicia viaturaPolicia =  new A89ViaturaPolicia("Honda Fit", "FMU-4R28");

		System.out.println(carroPasseio); // Teste toString
		
		carroPasseio.mostrarDetalhes();
		carroPasseio.verificarPlaca();
		System.out.println("Tarifa: R$" + carroPasseio.calcularTarifa());

		
		
		caminhao.mostrarDetalhes();
		caminhao.verificarPlaca();
		System.out.println("Tarifa: R$" + caminhao.calcularTarifa());

		
		viaturaPolicia.mostrarDetalhes();
		viaturaPolicia.verificarPlaca();
		// System.out.println("Tarifa: " + viaturaPolicia.calcularTarifa());; Erro pois o método não está implementado
		
	}

}
