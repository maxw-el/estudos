package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde"; //Strings são objetos imutáveis.
		// s = s.toUpperCase(); Isso não é uma modificação.
		System.out.println(s.concat("!!!")); // função que concatena
		System.out.println(s + "!!!"); // similar à concatenação
		System.out.println(s.startsWith("Boa")); // confere se inicia com a sentença
		System.out.println(s.toLowerCase().startsWith("boa")); // primeiro define caixa baixa e depois verifica
		System.out.println(s.toUpperCase().endsWith("TARDE")); // primeiro define caixa alta e depois verifica
		System.out.println(s.length()); // informa a extensço da String
		System.out.println(s.toLowerCase().equals("boa tarde")); // define caixa baixa e verifica se é igual
		System.out.println(s.equalsIgnoreCase("boa tarde")); // define caixa alta e verifica se é igual
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.98;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nsalario: " + salario + "\n\n"); //não é o ideal
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.\n\n", nome, sobrenome, idade, salario); // %s referencia cada String, %d inteiros, %f float
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		// explore, em questão de estudo, a api de strings, é só digitar . (ponto) após uma e ver o que tem
	}
}
