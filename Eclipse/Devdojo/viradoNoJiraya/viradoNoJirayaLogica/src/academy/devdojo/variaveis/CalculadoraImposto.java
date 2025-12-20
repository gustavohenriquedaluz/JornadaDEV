package academy.devdojo.variaveis;

public class CalculadoraImposto {
	public static void main(String[] args) {	
		float salary = 1500.00f;
		double ratePercent = 3.1;
		double percentValue = salary * (ratePercent / 100);
		System.out.println("A porcentagem de " + ratePercent + ", referente ao salário " + salary + ", é igual a " + percentValue + ".");
	}
}