package fundamentals;
import java.util.*;

public class CheckIfPrime {
	
	public static void checkIfPrime(int n) {
		int i=0;
		
		if(n==2) {
			System.out.println("Number is prime!");
			return;
		}
		
		for(i=2; i<=n/2; i++) {
			if(n%i == 0) {
				System.out.println("Number is composite.");
				return;
			}
		}
		
		System.out.println("Number is prime!");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		checkIfPrime(n);;
		
//		if(result == 1) {
//			System.out.println("Number is prime!");
//		}else {
//			System.out.println("Number is composite.");
//		}

		
		sc.close();
	}

}
