package fundamentals;

import java.util.*;

public class FindCharCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str  = sc.next();
		
		char ch = sc.next().charAt(0);
		
		//int ascii_char = ch;  
//		System.out.println(chr);
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("1");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("0");
		} else {
			System.out.println("-1");
		}
		
		
		sc.close();
	}

}
