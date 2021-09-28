import java.util.Scanner;

public class temp_conversion {
	public static void main(String[] args) {
		double Celsius, Fahrenheit;
		final double constant = 9.0 / 5.0;
		
		Scanner in = new Scanner(System.in);

		System.out.print("Degrees in Celsius: ");
		Celsius = in.nextDouble();
		Fahrenheit = Celsius * constant + 32;
		System.out.println("Degrees in Fahrenheit = " + Fahrenheit);
	}
}
