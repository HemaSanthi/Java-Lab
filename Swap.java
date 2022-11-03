package sss;
import java.util.Scanner;
public class Swap {
	
	void swapvalue( ) {
		int a=10,b=20;
				
		int t;
		System.out.println("Before Swab a " +a+"b "+b);
		t=a;
		a=b;
		b=t;
		System.out.println("after Swab a " +a+"b "+b);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swap a =new Swap();
		
		a.swapvalue();

	}
}

