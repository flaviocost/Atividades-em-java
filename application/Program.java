package application;

import java.util.Locale;
import java.util.Scanner;
import entites.Triangules;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangules x, y;
		x = new Triangules();
		y = new Triangules();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f\nTriangle Y area: %.4f\n", areaX, areaY);
		
		String resultado = Triangules.verificacao(areaX, areaY);
		System.out.printf(resultado);
		sc.close();
	}

}
