package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.FileNotFoundException;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.A104LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.A105Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.A105Pessoa;

public class A105SobrescritaComExceptionTest01 {

	public static void main(String[] args) {
		A105Pessoa pessoa = new A105Pessoa();
		A105Funcionario funcionario = new A105Funcionario();
		try {
			pessoa.salvar();
		} catch (FileNotFoundException | A104LoginInvalidoException e) {
			e.printStackTrace();
		}
		
		try {
			funcionario.salvar();
		} catch (A104LoginInvalidoException e) {
			e.printStackTrace();
		}

	}

}
