package exercicios.aulas.A99ExceptionPT1.domain;

import java.io.IOException;

public class TesteExceptions {

    public static void main(String[] args) {
        
        // DESAFIO 1:
        // A linha abaixo vai dar erro de compilação.
        // O Eclipse vai pedir um try-catch. Por que?
        // Resposta mental: Porque IOException é CHECKED.
        // Ação: Use a correção automática do Eclipse para envolver em try-catch.
        try {
			abrirArquivo("arquivo_bloqueado.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        System.out.println("-----------------");

        // DESAFIO 2:
        // A linha abaixo NÃO dá erro de compilação, mas vai quebrar o programa ao rodar.
        // Por que não pediu try-catch? 
        // Resposta mental: Porque IllegalArgumentException é UNCHECKED (RuntimeException).
        // Ação: Envolva em try-catch manualmente para capturar o erro e imprimir uma mensagem amigável.
        
        
        try {
        	calcularSalario(-500);
		} catch (IllegalArgumentException e) {
			System.out.println("Argumento inválido, não é possível calcular o salário com valor abaixo de 0");
			// throw e; Nesse caso precisa utilizar o throw? Pq a mensagem amigável está aqui, mas se não, nunca lançaria a exception do código matriz
		}
    }

    // ---------------------------------------------------------
    // MÉTODOS UTILITÁRIOS (Simulando o Backend)
    // ---------------------------------------------------------

    // Método que avisa: "Posso dar erro de disco!"
    // O 'throws IOException' é OBRIGATÓRIO aqui.
    private static void abrirArquivo(String nome) throws IOException {
        if (nome.equals("arquivo_bloqueado.txt")) {
            throw new IOException("Erro crítico: Disco protegido contra gravação.");
        }
        System.out.println("Arquivo aberto: " + nome);
    }

    // Método que diz: "Se passar valor negativo, o problema é seu."
    // NÃO precisa de 'throws' na assinatura.
    private static void calcularSalario(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Erro de lógica: Salário não pode ser negativo.");
        }
        System.out.println("Salário calculado: " + valor);
    }
}