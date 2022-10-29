package sample;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input= new Scanner(System.in);
		System.out.println("Accept Password");
		String acceptpassword=input.nextLine();
		System.out.println("Confirm Password");
		String confirmpassword=input.nextLine();
		if (confirmpassword.equals(acceptpassword)) {
			System.out.println("password be match, you can allow");
			
		}
		else
		{
			System.out.println("password be mismatch");
		}
	}

}
