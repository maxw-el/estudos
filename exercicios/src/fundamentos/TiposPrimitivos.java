package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoo = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F; //com casas decimais
		double vendasAcumuladas = 2_991_797_103.01; //dobro do float
		
		// Tipo booelano
		boolean estaDeFerias = false; //true
		
		// Tipo caractere
		char status = 'A'; //ativo
		
		
		
		
		// Dias da empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoo / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		
		System.out.println("Férias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
	}
}
