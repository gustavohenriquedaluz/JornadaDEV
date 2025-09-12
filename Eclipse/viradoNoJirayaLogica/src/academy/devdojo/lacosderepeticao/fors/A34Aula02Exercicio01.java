package academy.devdojo.lacosderepeticao.fors;

/*
Elaborar um programa que apresente os quadrados dos números inteiros existentes 
na faixa de valores de 15 até 200.
*/

public class A34Aula02Exercicio01 {
	public static void main (String[]args) {
		
		for (int i = 15;i <= 200; i++) {
			System.out.println(i + "²: " + (i*i));
		}
	}
}
