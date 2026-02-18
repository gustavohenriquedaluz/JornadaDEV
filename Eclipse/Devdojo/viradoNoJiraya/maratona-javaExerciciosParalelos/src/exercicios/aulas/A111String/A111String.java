package exercicios.aulas.A111String;

public class A111String {
	public static void main(String[] args) {
		String dadosSujos = "   xMz-gUsTaVo lUz-iBm   ";
		System.out.println(dadosSujos);  //   xMz-gUsTaVo lUz-iBm 
		dadosSujos = dadosSujos.trim(); 
		System.out.println(dadosSujos); // xMz-gUsTaVo lUz-iBm
		dadosSujos = dadosSujos.replace("xMz-", "");
		System.out.println(dadosSujos); // gUsTaVo lUz-iBm
		dadosSujos = dadosSujos.replace("-", " ");
		System.out.println(dadosSujos); // gUsTaVo lUz iBm
		dadosSujos = dadosSujos.toUpperCase();
		System.out.println(dadosSujos); // GUSTAVO LUZ IBM
		String dadosLimpos = dadosSujos;
		
		StringBuilder sb = new StringBuilder(dadosLimpos); 
		sb.reverse();
		System.out.println(sb); // MBI ZUL OVATSUG
		sb = sb.append(" #DevJava");
		System.out.println(sb); // MBI ZUL OVATSUG #DevJava
	
	}
}
