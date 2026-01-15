package exercicios.aulas.A99ExceptionPT4;

public class A99Cadastro {
	public static void main(String[] args) {
		try {
			salvar("admin");
		} catch (A99PersistenciaException e) {
			System.out.println("Tentando salvar em arquivo local...");
			e.printStackTrace();
		}
		
		
	}
	
	public static void salvar(String nome) throws  A99PersistenciaException {
		if (nome.isEmpty()) {
			throw new A99UsuarioInvalidoException();
		} else if (nome.equals("admin")) {
			throw new A99PersistenciaException();
		}
		
		
	}
}
