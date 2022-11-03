package sss;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, temp,reminder;
		System.out.println("enter value");
		Scanner sc =new Scanner(System.in);
		int num= sc.nextInt();
		temp=num;
		while(num>0) {
			reminder=num%10;
			sum= (sum*10)+reminder;
			num=num/10;
			
		}
		if (temp==sum) {
			System.out.println("palindrome number");
			
		}
		else {
			System.out.println("not palindrome number");

			
		}
		

	}

}
