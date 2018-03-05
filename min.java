package guvi;
import java.util.*;
public class min {
	public static void main(String[] args) {
   	 int n,max;
   	 Scanner s=new Scanner(System.in);
   	 System.out.println("enter the given number");
   	 n=s.nextInt();
   	 int a[]= new int[n];
   	 System.out.println("enter the elment");
   	 for(int i=0;i<n;i++) {
   		 a[i]=s.nextInt();
   		 
   	 }
   	 max=a[0];
   	 for(int i=0;i<n;i++) {
   		 if(max>a[i]) {
   			 max=a[i];
   		 }
   	 }
   	 System.out.println("The Smallest number is"+max);
   	 s.close();
    }
}
