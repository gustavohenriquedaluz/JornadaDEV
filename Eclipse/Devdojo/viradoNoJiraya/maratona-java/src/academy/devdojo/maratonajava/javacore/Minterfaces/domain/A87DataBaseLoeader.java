package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class A87DataBaseLoeader implements A87DataLoader, A88DataRemover {

	//private -> default -> protected -> public
	
	@Override
	public void load() {
		System.out.println("Carregando dados de banco de dados");
	}

	@Override
	public void remove() {
		System.out.println("Removendo dados do banco de dados");
		
	}

	@Override
	public void checkPermission() {
		System.out.println("Checando permissão no banco de dados");
	}
	
	
	public static void retrieveMaxDataSzie() {
		System.out.println("Dentro do retrieveMaxDataSize na interface na classe DataBaseLoader");
	}
}
