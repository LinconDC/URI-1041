package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira 2 valores com ponto flutuante: ");
		double numX = sc.nextDouble();
		double numY = sc.nextDouble();
		
		if (numX == 0.0 && numY == 0.0) {
			System.out.println("Origem");
		}
		else if (numX == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (numY == 0.0) {
			System.out.println("Eixo X");
		}
		else if (numX > 0.0 && numY > 0.0) {
			System.out.println("Quadrante 1");
		}
		else if (numX < 0.0 && numY > 0.0) {
			System.out.println("Quadrante 2");
		}
		else if (numX < 0.0 && numY < 0.0) {
			System.out.println("Quadrante 3");
		}
		else {
			System.out.println("Quadrante 4");
		}
		
		
		sc.close();

	}

}
