package exercicios.aulas.domain;

public class A52Ferramentas {
	
	
	public double calculadoraMediaAritmetic(double... numeros) {
		
		if (numeros.length == 0){
			return 0;
		}
		
		double somaDosNumeros = 0;
		int tamanhodoArray = numeros.length;
		
		
		for (double iterador : numeros) {
			somaDosNumeros += iterador;
		}
		
		double resultado = somaDosNumeros / tamanhodoArray;
		return resultado;
	}
	
	
	public String juntadorDePalavaras(String separador, String... palavras) {
		
	String resultado = "";
	
	for (String iteradorPalavra : palavras) {
		
		if (iteradorPalavra == palavras[0]) {
			resultado += iteradorPalavra;
			continue;
		}
	resultado += separador + iteradorPalavra;
	}
		return resultado;
	}
	
	
	
}
