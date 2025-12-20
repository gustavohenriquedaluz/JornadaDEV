package exercicios.aulas.A69Scanner.domain;

import java.util.Scanner;

public class Candidato {
	private String nome;
	private int idade;
	private double pretensaoSalarial;
	private boolean isExperienteEmJava;
	private char sexo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void imprimeDadosCandidato() {
		System.out.print("O candidato " + this.nome + " tem " + this.idade + " anos de idade, sua pretenção salarial é R$ " + this.pretensaoSalarial);
		if (isExperienteEmJava == true) {
			System.out.print(", é experiente em Java e");
		} else {
			System.out.print(", não é experiente em Java e ");
		}

		if (this.sexo == 'M' || this.sexo == 'm') {
			System.out.print(" é do sexo masculino.");
		} else {
			System.out.print(" é do sexo feminino.");
		}

	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPretensaoSalarial() {
		return pretensaoSalarial;
	}

	public void setPretensaoSalarial(double pretensaoSalarial) {
		this.pretensaoSalarial = pretensaoSalarial;
	}

	public boolean isExperienteEmJava() {
		return isExperienteEmJava;
	}

	public void setExperienteEmJava(boolean isExperienteEmJava) {
		this.isExperienteEmJava = isExperienteEmJava;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
