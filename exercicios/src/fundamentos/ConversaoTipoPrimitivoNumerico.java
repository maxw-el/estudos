package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // conversão implícita de inteiro pra double
		System.out.println(a);
		
		float b = (float) 1.123456788888; // conversão explícita por CAST de um literal double para float
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c; // conversão explícita por CAST de um literal int para byte
		System.out.println(d);
		
		// O ideal é sempre usar int e double e evitar CASTS
	}

}
