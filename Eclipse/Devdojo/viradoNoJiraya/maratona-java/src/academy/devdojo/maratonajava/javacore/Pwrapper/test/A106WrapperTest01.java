package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class A106WrapperTest01 {

	public static void main(String[] args) {

		// Tipos primitivos
		byte byteP = 1;
		short shortP = 1;
		int intP = 1;
		long longP = 10L;
		float floatP = 10F;
		double doubleP = 10D;
		char charP = 'W';
		boolean booleanP = false;

		// Wrappers são objetos que simulam os tipos primitivos, mas com as
		// características positivas e negativas de serem objetos (null \ métodos e afins)
		// Autoboxing, faz o Java transformar o tipo primitivo em tipo wrapper
		Byte byteW = 1;
		Short shortW = 1;
		Integer intW = 1; // autoboxing, tipo primitivo e o java faz a conversão em wrapper
		Long longW = 10L;
		Float floatW = 10F;
		Double doubleW = 10D;
		Character charW = 'W';
		Boolean booleanW = false;
		
		int i = intW; // unboxing, wrapper > tipo primitivo
		// Se quiser transformar em wrapper, todas as classes tem um método interpretador \ parse
		Integer intW2 = Integer.parseInt("1"); // Parse = interpretar
		Integer intW3 = new Integer("1"); // Descontinuado
		// Float.parseFloat(null); // Exemplo
		Boolean verdadeiro1 = Boolean.parseBoolean("TrUe"); // True - Case insensitive
		Boolean verdadeiro2 = Boolean.parseBoolean("saas"); // false
		Boolean verdadeiro3 = Boolean.parseBoolean(null); // false
		System.out.println(verdadeiro1); // true
		
		
		System.out.println(Character.isDigit('A')); //false
		System.out.println(Character.isDigit('9')); //true
		System.out.println(Character.isLetterOrDigit('!')); //false
		System.out.println(Character.isUpperCase('A')); //true
		System.out.println(Character.isLowerCase('a')); //true
		System.out.println(Character.toUpperCase('a')); //A
		System.out.println(Character.toLowerCase('A')); //a
	}

}
