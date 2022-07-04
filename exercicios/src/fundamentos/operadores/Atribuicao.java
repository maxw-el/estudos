package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // é o mesmo que: c = c + b
		c -= a; // é o mesmo que: c = c - a
		c *= b; // é o mesmo que: c = c * b
		c /= a; // é o mesmo que: c = c / a
		c %= 2; // é o mesmo que: c = c % 2 - se der 0 é par, se der 1 é ímpar
		
		System.out.println(c);
		
	}
}
