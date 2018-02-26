package navanee;

import java.util.Scanner;

public class intravenlodd {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println(" Enter first number:");
		int a=s.nextInt();
		System.out.println(" Enter last number:");
		int n=s.nextInt();
			System.out.println(" The Odd Numbers are:");
			for (int i = a; i <= n; i++) {
				if (i % 2 != 0) {
					System.out.print(i+ " , ");
			}
		}
		s.close();
}
}
