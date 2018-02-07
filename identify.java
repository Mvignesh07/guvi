package navanee;
import java.util.*;
public class identify {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		if(a<0) {
			System.out.println("the give number is Negative");
		}
		else if(a>0){
			System.out.println("the give number is Positive");
		}
		else{
			System.out.println("the give number is Zero");
		}
		s.close();
	}
}
