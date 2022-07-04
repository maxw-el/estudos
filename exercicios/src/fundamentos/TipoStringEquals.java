package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		// A ideia aqui é usar o .equals para comparar Strings e não o ==
		
		System.out.println("2" == "2");
		
		
		String s1 = new String ("2");
		System.out.println("2" == s1); // isso dá false
		System.out.println("2" .equals(s1)); // isso dá true
		
		
		Scanner scanner = new Scanner(System.in);
		
		String s2 = scanner.next();
		System.out.println("2" == s2.trim());
		System.out.println("2" .equals(s2.trim()));
		
		scanner.close();
		
		
	}
}
