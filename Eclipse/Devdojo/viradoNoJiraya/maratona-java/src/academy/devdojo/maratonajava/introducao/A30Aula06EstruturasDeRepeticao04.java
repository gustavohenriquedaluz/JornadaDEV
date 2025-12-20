package academy.devdojo.maratonajava.introducao;

public class A30Aula06EstruturasDeRepeticao04 {
	// Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
	// Condição é que valorParcela >= 1000
	public static void main(String[] args) {

		double valorCarro = 50000;
		double valorParcela = 1000;
		int parcela = 1;
		
		System.out.println("Valor do carro é R$" + valorCarro);
		
		while (valorParcela >= 1000 && valorParcela <= valorCarro) {
			valorParcela = valorCarro / parcela;
			
			if (valorParcela < 1000) {
				break;
			}
			System.out.println("Parcelando em " + parcela + "x" + " a parcela é de R$" + valorParcela);
			parcela++;
		}
	}

}
 