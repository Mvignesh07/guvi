package guvi;
import java.util.*;

public class countingdigit {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
         int count=0;
         while(n!=0) {
        	 n=n/10;
        	 count++;
         }
         System.out.println(count);
         scan.close();
}
}
