package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class A87FileLoader implements A87DataLoader, A88DataRemover {

	@Override
	public void load() {
		System.out.println("Carregando dados de um arquivo");

	}

	@Override
	public void remove() {
		System.out.println("Deletando dados de um arquivo");

	}

	@Override
	public void checkPermission() {
		System.out.println("Checando permissões do arquivo");
	}

}
