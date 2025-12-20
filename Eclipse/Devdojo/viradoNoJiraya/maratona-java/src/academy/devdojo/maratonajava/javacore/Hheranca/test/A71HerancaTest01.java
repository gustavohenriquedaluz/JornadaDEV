package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.A71Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.A71Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.A71Pessoa;

public class A71HerancaTest01 {

	public static void main(String[] args) {
		A71Endereco endereco = new A71Endereco();
		endereco.setRua("Rua 3");
		endereco.setCep("012345-209");
		A71Pessoa pessoa =  new A71Pessoa("Toyohisa Shimazu");
		pessoa.setCpf("11111111");
		pessoa.setEndereco(endereco);
		pessoa.imprime();
		
		A71Funcionario funcionario = new A71Funcionario("Oda nobunaga");
		funcionario.setCpf("22222");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(20000);
		System.out.println("----------------");
		
		funcionario.imprime();

	}

}
