package guvi;
import java.util.*;
public class hour {
     public static void main(String[] args) {
    	 float t1,t2,t3,h3,m3;
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("Enter the starting time");
    	 float h1=s.nextFloat();
    	 float m1=s.nextFloat();
    	 System.out.println("Enter the Ending time");
    	 float h2=s.nextFloat();
    	 float m2=s.nextFloat();
    	 t1=(h1*60)+m1;
    	 t2=(h2*60)+m2;
    	 t3=t1-t2;
         h3=t3/60;
         m3=t3%60; 
         System.out.println("the given time is"+h3+" and "+m3);
    	 s.close();
     }

}
