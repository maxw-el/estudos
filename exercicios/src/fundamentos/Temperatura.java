package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		final double AJUSTE = 32, FATOR = 5.0/9;
		double farenheight, celsius;
		
		System.out.println("Insira a temperatura em farenheight: ");
		farenheight = s.nextDouble();
		
		// (F° - 32) x 5/9 = C°
		celsius = (farenheight - AJUSTE) * FATOR;
		
		System.out.println("A temperatura em celsius °: " + celsius + "°C.");
		
	}
}
