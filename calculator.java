package string;
import java.util.*;
import java.util.InputMismatchException;
public class calculator {
	static void validate (double val1,double val2) throws Exception{    
	       if(val1<1 || val2<1){  


	        throw new Exception("");    
	    }  
	       else
	    	   System.out.println("Contine with the Inputs");

	}
 public static void main(String[] args)
 {

     double val1, val2;


     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the numbers");


     val1 = sc.nextDouble();

     val2 = sc.nextDouble();
     sc.close();
     try {
     validate(val1,val2);
     }
     catch(Exception e)
     {
     	System.out.println("Change your input");
     	System.exit(0);
     }



     System.out.println("Enter the operator (+,-,*,/)");

     char operator = sc.next().charAt(0);

     double num = 0;

     switch (operator) {


     case '+':

    	 num = val1 + val2;

         break;


     case '-':

    	 num = val1 - val2;

         break;


     case '*':

    	 num = val1 * val2;

         break;


     case '/':
     	try{

     		num = val1 / val2;;
     	}
     	catch(Exception e)
     	{
     		System.out.println("Please check the denominator");
     	}

         break;

     default:

         System.out.println("You enter wrong input");

         break;
     }

     System.out.println("The final result:");

     System.out.println();


     System.out.println(val1 + " " + operator + " " + val2
                        + " = " + num);

}

}
