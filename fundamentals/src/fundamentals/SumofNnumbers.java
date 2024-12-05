package fundamentals;
import java.util.*;

public class SumofNnumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0, i=0;
		
		while (i<=n) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
		
		
		sc.close();
	}

}
