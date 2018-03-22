package basic;
import java.util.*;
public class words {
	  public static void main(String aa[]){
	      int count=0;
	      Scanner s=new Scanner(System.in);
	      String a=s.nextLine();
	     String d[]=a.split("\\s+");
	     for(int i=0;i<d.length;i++){
	         count++;
	     }
	     System.out.println(count);
	    }
}
