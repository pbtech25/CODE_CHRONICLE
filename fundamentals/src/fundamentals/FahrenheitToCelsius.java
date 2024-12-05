package fundamentals;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fahrenheit = 0.0, celcius = 0.0;
		
		System.out.println("Enter temperature in fahrenheit: ");
		fahrenheit = sc.nextDouble();
		
		celcius = (5.0/9)*(fahrenheit-32);
		
		System.out.println("Temperature in celcius is: " + celcius);
		
		
		
		
		sc.close();
	}

}
