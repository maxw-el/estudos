package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom"); //print sem quebra de linha
		System.out.println(" dia!\n"); //print com quebra de linha
		System.out.printf("Salário: %.1f \n", 1234.5678); //print com formatação
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("\nNome = " + nome);
		
		entrada.close(); //fecha o Scanner
	}
}
