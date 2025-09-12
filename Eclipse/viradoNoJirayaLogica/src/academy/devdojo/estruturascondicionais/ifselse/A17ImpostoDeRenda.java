package academy.devdojo.estruturascondicionais.ifselse;

public class A17ImpostoDeRenda {
public static void main (String[]args) {
	double salario = 3000;
	double resultado = 0;
	float aliquota = 0f;

	if (salario <= 1903.98) {
		System.out.println("Com base no seu salário de " + salario + ", você é isento de retenção de iR.");
		return;
	} else if (salario >= 1903.99 && salario <= 2826.65) {
		aliquota = 7.5f;
		resultado = (salario * (aliquota / 100)) - 142.80;
	} else if (salario >= 2826.66 && salario <= 3751.05) {
		aliquota = 15.0f;
		resultado = (salario * (aliquota / 100)) - 354.8;		
	} else if (salario >= 3751.06 && salario <= 4664.68) {
		aliquota = 22.5f;
		resultado = (salario * (aliquota / 100)) - 636.13;			
	} else {
		aliquota = 27.5f;
		resultado = (salario * (aliquota / 100)) - 869.36;			
	}
System.out.println("Com base no seu salário de " + salario + " , a alíquota aplica é "+ aliquota + "e o imposto de renda recolhido é :" + resultado + ".");
}

}







/*
Base de cálculo	Alíquota	Dedução
Até R$ 1.903,98	-	-
De R$ 1.903,99 até R$ 2.826,65	7,5%	R$ 142,80
De R$ 2.826,66 até R$ 3.751,05	15,0%	R$ 354,80
De R$ 3.751,06 até R$ 4.664,68	22,5%	R$ 636,13
		  Acima de R$ 4.664,68	27,5%	R$ 869,36
*/