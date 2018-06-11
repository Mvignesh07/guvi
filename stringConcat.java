package guvi;

import java.util.Scanner;

public class stringConcat {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String S1=scan.nextLine();
	String S2=scan.nextLine();
	String S3=S1.concat(S2);	
	System.out.println(S3);
	 scan.close();
}
}
