package fundamentos;

public class Wrappers {
	
	// WRAPEPERS SÃO AS VERSÕES EM OBJETOS DOS TIPOS PRIMITIVOS

	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;

		// Integer.parseInt(entrada.next()); isso converte uma string pra inteiro
		Integer i = 10000; // int
		Long l = 100000L;

		System.out.println(b.byteValue()); // mostra o valor do byte
		System.out.println(s.toString()); // coverte o Short s pra uma String
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); // converte uma String pra Boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // converte o Boolean pra String e depois pra caixa alta
		
		Character c = '#'; // char
		System.out.println(c + "...");
	}
}
