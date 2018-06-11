package guvi;

import java.util.Scanner;

public class stringKtime {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string");
	String S=scan.nextLine();
	System.out.println("enter the number");
	int n=scan.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println(S);
	}
	scan.close();
	
}
}
