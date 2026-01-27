package exercicios.aulas.A105Exception03;

import java.io.IOException;

public class A105ServicoAuditoria {
	
	public void processar() throws A105FalhaDeAuditoriaException{
		A105LeitorDeLog leitorDeLog = new A105LeitorDeLog();
		try {
			leitorDeLog.lerPrimeiraLinha();
		} catch (IOException e) {
			throw new A105FalhaDeAuditoriaException("Não foi possível auditar - ", e);
		//	e.printStackTrace(); Isso fica inútil, se no throw ele sai do catch
		}
	}
}
