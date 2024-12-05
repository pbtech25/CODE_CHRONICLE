package fundamentals;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Hello " + name + "!");
		char ch = name.charAt(3);
		System.out.println(ch);
		
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		int c=a+b;
		System.out.println("Sum of first and second number is: "+c);
		
		
		
		sc.close();

	}

}
