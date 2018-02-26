package navanee;

import java.util.*;

public class multiple5 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println(" Enter number");
		int a=s.nextInt();
		int count=0,n;
		for(int i=0;i<a;i++) {
			count=count+1;
			n=count*5;
			System.out.println(n);
		}
		s.close();
	}
	}

