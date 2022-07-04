package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Insira o primeiro número: ");
		Double n1 = scanner.nextDouble();
		
		System.out.print("Insira o segundo número: ");
		Double n2 = scanner.nextDouble();	
		
		System.out.print("Insira a operação: ");
		String op = scanner.next();
		
		
		Double resultado = op .equals("+") ? n1 + n2 : 0;
		resultado = "-" .equals(op) ? n1 - n2 : resultado;
		resultado = "*" .equals(op) ? n1 * n2 : resultado;
		resultado = "/" .equals(op) ? n1 / n2 : resultado;
		resultado = "%" .equals(op) ? n1 % n2 : resultado;

		
		System.out.printf("%.2f %s %.2f = %.2f: ", 
				n1, op, n2, resultado);
		
		scanner.close();
	}
}
