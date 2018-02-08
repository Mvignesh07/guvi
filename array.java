package navanee;
import java.util.*;
public class array {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int n=s.nextInt();
	      int[] array = new int[n];
	      int sum = 0;
	      int k=0;
	      System.out.println("Enter number you want");
	      for (int i=0; i<n; i++)
	      {
	    	  array[i] = s.nextInt();
	      }
	      for( int num : array) {
	          sum = sum+num;
	          k=sum;
	      }
	      System.out.println("Sum of number is"+k);
	      s.close();
    }
}
