package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.domain.A87DataBaseLoeader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.A87DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.A87FileLoader;

public class A87DataLoaderTest01 {

	public static void main(String[] args) {
		A87DataBaseLoeader dataBaseLoeader = new A87DataBaseLoeader();
		A87FileLoader fileLoader = new A87FileLoader();
		dataBaseLoeader.load();
		fileLoader.load();
		
		dataBaseLoeader.remove();
		fileLoader.remove();
		
		dataBaseLoeader.checkPermission();
		fileLoader.checkPermission();
		
		A87DataBaseLoeader.retrieveMaxDataSzie();
		A87DataLoader.retrieveMaxDataSzie();
	}

}
