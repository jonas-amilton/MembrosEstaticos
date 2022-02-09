package application;

import java.util.Locale;
import java.util.Scanner;
import utilities.Calculator;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//Calculator calc = new Calculator();

		System.out.print("Enter the Radios: ");
		double radius = sc.nextDouble();

		double circ = Calculator.circumference(radius);
		double vol = Calculator.volume(radius);

		System.out.printf("circumference: %.2f%n", circ);
		System.out.printf("volume: %.2f%n", vol);
		System.out.printf("PI value is: %.2f%n", Calculator.pi);

		sc.close();

	}

}
