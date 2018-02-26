package navanee;

import java.util.*;

public class intravelPrime {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		 System.out.print( "Enter the lowest value");
		int a=s.nextInt();
		 System.out.print( "Enter the highest");
		int b=s.nextInt();
		 System.out.print("prime number are:");
	        while (a< b) {
	            boolean flag = false;

	            for(int i = 2; i <= a/2; ++i) {
	                if(a % i == 0) {
	                    flag = true;
	                    break;
	                }
	            }

	            if (!flag)
	                System.out.print(a + " ,");

	            ++a;
}
	        s.close();
}
}
