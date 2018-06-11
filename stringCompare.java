package guvi;

import java.util.Scanner;

public class stringCompare {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String S1=s.nextLine();
	String S2=s.nextLine();
	if(S1.equals(S2)) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
	s.close();
}
}
