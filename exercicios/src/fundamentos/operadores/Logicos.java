package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // E
		System.out.println(condicao1 || condicao2); // OU
		System.out.println(condicao1 ^ condicao2); // OU Exclusivo
		System.out.println(!condicao1); // Negação
		System.out.println(!!condicao2); // Dupla Negação
		
		
		System.out.println("\nTABELA VERDADE E and: ");
		System.out.println(true && true); // = true
		System.out.println(true && false); // = false
		System.out.println(false && true); // = false
		System.out.println(false && false); // = false
		
		System.out.println("\nTABELA VERDADE OU or: ");
		System.out.println(true || true); // = true
		System.out.println(true || false); // = true
		System.out.println(false || true); // = true
		System.out.println(false || false); // = false
		
		System.out.println("\nTABELA VERDADE OU Exclusivo xor: ");
		System.out.println(true ^ true); // = false
		System.out.println(true ^ false); // = true
		System.out.println(false ^ true); // = true
		System.out.println(false ^ false); // = false
		
		System.out.println("\nTABELA VERDADE Negação NOT: ");
		System.out.println(!true); // = false
		System.out.println(!false); // = true
		
		
	}
}
