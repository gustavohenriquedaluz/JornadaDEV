package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface A87DataLoader {
	public static final int MAX_DATA_SIZE = 10;
	public abstract void load();

	default void checkPermission() {
		System.out.println("Fazendo checagem de permissões");
	}
	
	public static void retrieveMaxDataSzie() {
		System.out.println("Dentro do retrieveMaxDataSize na interface");
	}
}
