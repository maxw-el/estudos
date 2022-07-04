package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		
		// o interrogação é como se fosse um if (operador ternário)
		// o dois pontos separa as possibilidades
		// traduzindo: se a variável média for >= 7, preenche a String com "aprovado", se não... "reprovado"
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em ecuperação.";
		
		System.out.println("O aluno está " + resultadoFinal);
		
		
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7; //verdadeiro
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resultado);
	}
}
