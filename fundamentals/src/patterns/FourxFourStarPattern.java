package patterns;
import java.util.*;

public class FourxFourStarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter index: ");
		int n = sc.nextInt();
		
		int i=1;
		
		while (i<=n) {
			int j=1;
			
			while(j<=n) {
				System.out.print("*" + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	
		
		
		
		sc.close();
	}

}
