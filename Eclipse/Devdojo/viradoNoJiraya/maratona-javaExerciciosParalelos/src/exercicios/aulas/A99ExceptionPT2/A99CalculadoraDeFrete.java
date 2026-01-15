package exercicios.aulas.A99ExceptionPT2;

import java.io.IOException;

public class A99CalculadoraDeFrete {

	public static void main(String[] args) {
		try {
			calcular("SP");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------------------");
		
		try {
			calcular("SP");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static double calcular(String estado) throws IOException {
	
		if (estado.equals("SP")) {
			return obterPrecoCorreios(estado);
		} else {
			throw new IllegalArgumentException("Argumento inválido");
		}
		
	}

	public static double obterPrecoCorreios(String estado) throws IOException {
		
		if (estado.equals("SP")) {
			throw new IOException("API offline");
		}
		return 10;
	}
	
}
