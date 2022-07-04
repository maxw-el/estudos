package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		
		// SituaçãoA
		// JobT V && JobQ V = compra tv 50
		
		// SituaçãoB
		// JobT V && JobQ F = compra tv 32
		// JobT F && JobQ V = compra tv 32
		
		// SituaçãoC
		// JobT F && JobQ F = fica em casa
				
		// SituaçãoA V || SituaçãoB V = toma sorvete
		
		// TomaSorvete F = saudável
		
		// após, exibir todas as possibilidades no terminal
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + !comprouSorvete);
		
		
		
	}
}
