package ps_sprint_1;
import java.util.*;

public class CheckPrimality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		boolean isPrime = true;
		int div = 2;
		
		while(div <= n/2) {
			if(n%div==0) {
				isPrime = false;
				System.out.println("Number is Composite");
				return;
			}
			div++;
		}
		
		if(isPrime)
			System.out.println("Number is Prime");

		
		sc.close();
	}

}
