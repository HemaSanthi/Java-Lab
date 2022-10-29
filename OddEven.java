package sample;

import java.util.Scanner;

public class OddEven {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter Number");
		value= num.nextInt();
		String result=(value % 2 == 0)? "even" :"Odd";
		System.out.println(value + " be a " + result+" number");
		

	}
