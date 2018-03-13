package guvi;
import java.util.*;
public class string {
	public static void main(String[] args) {
		Scanner test1 =new Scanner(System.in);
		System.out.println("Enter given input");
		char ch=test1.next( ).charAt(0);
		if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		test1.close();
	
	}

}
