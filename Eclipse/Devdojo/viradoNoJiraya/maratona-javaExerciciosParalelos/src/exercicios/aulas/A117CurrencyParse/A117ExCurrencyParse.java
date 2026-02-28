package exercicios.aulas.A117CurrencyParse;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class A117ExCurrencyParse {

	public static void main(String[] args) {
		String dataDaTransacaoBruto = "10/24/25";
		String pesoDaCargaBruto = "1,500,250.75";
		String valorDaTransacaoBruto = "$54,321.99";

		System.out.println("Data bruto: " + dataDaTransacaoBruto);
		System.out.println("Peso bruto: " + pesoDaCargaBruto);
		System.out.println("Valor bruto: " + valorDaTransacaoBruto);

		// Calendar calendar = Calendar.getInstance(); inútil?

		Locale localeUS = Locale.US;
		Locale localeBR = new Locale("pt", "BR");
		Locale localeJP = Locale.JAPAN;

		DateFormat dfUS = DateFormat.getDateInstance(DateFormat.SHORT, localeUS);
		DateFormat dfBR = DateFormat.getDateInstance(DateFormat.SHORT, localeBR);
		DateFormat dfJP = DateFormat.getDateInstance(DateFormat.SHORT, localeJP);

		NumberFormat nfNumberUS = NumberFormat.getInstance(localeUS);
		NumberFormat nfNumberBR = NumberFormat.getInstance(localeBR);
		NumberFormat nfNumberJP = NumberFormat.getInstance(localeJP);

		NumberFormat nfCurrencyUS = NumberFormat.getCurrencyInstance(localeUS);
		NumberFormat nfCurrencyBR = NumberFormat.getCurrencyInstance(localeBR);
		NumberFormat nfCurrencyJP = NumberFormat.getCurrencyInstance(localeJP);

		System.out.println("---------------------------------");

		// Teste para verificar o padrão para utilizar no parse
//		double valorTeste = 1264654464.49;
//		System.out.println(nfNumber.format(valorTeste)); 1,264,654,464.49 $1,264,654,464.49
//		System.out.println(nfCurrency.format(valorTeste));

		// Tirar dúvida disso, pq ser obrigado inicializar com null? Pq a variável morre
		// no bloco? Mas não da para usar try w resources pq não é closable

		// Convertendo data
		Date dataDaTransacaoConvertida = null;
		try {
			dataDaTransacaoConvertida = dfUS.parse(dataDaTransacaoBruto);
		} catch (ParseException e) {
			System.out.println("Revisar peso input do parse.");
			e.printStackTrace();
			return;
		}
		System.out.println("Data convertida: " + dataDaTransacaoConvertida);

		// Convertendo peso
		Double pesoDaCargaConvertida = null;
		try {
			pesoDaCargaConvertida = (Double) nfNumberUS.parse(pesoDaCargaBruto);
		} catch (ParseException e) {
			System.out.println("Revisar peso input do parse.");
			e.printStackTrace();
			return;
		}

		System.out.println("Peso convertido: " + pesoDaCargaConvertida);

		// convertendo
		Double valorDaTransacaoConvertida = null;

		try {
			valorDaTransacaoConvertida = (Double) nfCurrencyUS.parse(valorDaTransacaoBruto);
		} catch (ParseException e) {
			System.out.println("Revisar peso input do parse.");
			e.printStackTrace();
			return;
		}
		System.out.println("Valor convertido: " + valorDaTransacaoConvertida);

		// Conversão do dado convertido para padrão BR e JP
		String dataDaTransacaoBR = dfBR.format(dataDaTransacaoConvertida);
		String pesoDaCargaBR = nfNumberBR.format(pesoDaCargaConvertida);
		String valorDaTransacaoBR = nfCurrencyBR.format(valorDaTransacaoConvertida);
		String dataDaTransacaoJP = dfJP.format(dataDaTransacaoConvertida);
		String pesoDaCargaJP = nfNumberJP.format(pesoDaCargaConvertida);
		String valorDaTransacaoJP = nfCurrencyJP.format(valorDaTransacaoConvertida);

		System.out.println("---------------------------------");
		System.out.println("Dados convertidos para BR e JP:");
		System.out.println();
		System.out.println("Data da transação em ptBR: " + dataDaTransacaoBR);
		System.out.println("Peso da carga em ptBR: " + pesoDaCargaBR);
		System.out.println("Valor da carga em ptBR: " + valorDaTransacaoBR);
		System.out.println();
		System.out.println("Data da transação em JP: " + dataDaTransacaoJP);
		System.out.println("Peso da carga em JP: " + pesoDaCargaJP);
		System.out.println("Valor da carga em JP: " + valorDaTransacaoJP);

//		Data bruto: 10/24/25
//		Peso bruto: 1,500,250.75
//		Valor bruto: $54,321.99
//		---------------------------------
//		Data convertida: Fri Oct 24 00:00:00 BRT 2025 // Pq essa data ficou "longa" se determinei Short e não era para retornar data + time, pq havia determinado apenas data
//		Peso convertido: 1500250.75
//		Valor convertido: 54321.99
//		---------------------------------
//		Dados convertidos para BR e JP:
//
//		Data da transação em ptBR: 24/10/2025
//		Peso da carga em ptBR: 1.500.250,75
//		Valor da carga em ptBR: R$ 54.321,99 // Formato convertido, mas não considerado o cambio
//
//		Data da transação em JP: 2025/10/24
//		Peso da carga em JP: 1,500,250.75
//		Valor da carga em JP: ￥54,322 // Formato convertido, mas não considerado o cambio, e aqui ele arredondou para 322, pois Yen não tem casa decimal, pq?
	}

}
