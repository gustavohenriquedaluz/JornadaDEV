package exercicios.aulas.A105Exception03;

import java.io.IOException;

public class A105LeitorDeLog {

	public void lerPrimeiraLinha() throws IOException {
		throw new IOException("Arquivo corrompido no setor 0");
	}
	
}
