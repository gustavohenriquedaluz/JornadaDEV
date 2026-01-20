package academy.devdojo.maratonajava.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class A105Funcionario extends A105Pessoa {

	@Override
	public void salvar() throws A104LoginInvalidoException, ArithmeticException{
		System.out.println("Salvando funcionário");
	}
	
}
