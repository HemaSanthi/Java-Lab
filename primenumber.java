package sss;
import java.util.Scanner; 
public class primenumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		boolean flag=false;
		System.out.println("enter value");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		for (i=2; i<= num /2; ++i ) {
			if (num %i ==0) {
				flag= true;
				break;
			}
		}
		if(!flag) {
			System.out.println(num+"Prime");
		}
		else {
			System.out.println(num+"not Prime");
		}

	}

}
