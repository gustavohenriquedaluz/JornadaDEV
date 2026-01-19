package academy.devdojo.maratonajava.Oexception.error.test;

public class A95StackOverflowTest01 {

	public static void main(String[] args) {
		recursividade();
	}

	public static void recursividade() {
		recursividade();
	}
	
}
