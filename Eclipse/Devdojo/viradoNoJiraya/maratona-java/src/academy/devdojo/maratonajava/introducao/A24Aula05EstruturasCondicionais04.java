package academy.devdojo.maratonajava.introducao;

/* se renda for menor que 34712, taxa 9.70%
se renda for maior ou igual a 34713 e menor que 68507, taxa 37.35%
se renda for maior ou igual a 68508, taxa 49.50% */

public class A24Aula05EstruturasCondicionais04 {
	public static void main(String[] args) {
		
		double salarioAnual = 20000.00D;
		double impostoDevido = 0;
		
		if (salarioAnual <= 34712) {
			impostoDevido = salarioAnual * 0.097;
		} else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
			impostoDevido = salarioAnual * 0.3735;
		} else if (salarioAnual >= 68508) {
			impostoDevido = salarioAnual * 0.4950;
		}
		System.out.println("Com base no seu salário anual de " + salarioAnual + ", o imposto devido é: " + impostoDevido);
	}
}