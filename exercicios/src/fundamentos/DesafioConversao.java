package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.print("insira o primeiro salário: ");

		String salario1 = scanner.nextLine().replace(",", ".");


		System.out.print("insira o segundo salário: ");

		String salario2 = scanner.nextLine().replace(",", ".");


		System.out.print("insira o terceiro salário: ");

		String salario3 = scanner.nextLine().replace(",", ".");


		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);


		double media = (s1 + s2 + s3) / 3;
		System.out.println("a média salarial é: " + media);
		
		scanner.close();
	}

}
