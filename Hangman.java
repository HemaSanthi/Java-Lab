package string;

import java.util.Scanner;
import java.lang.*;

public class Hangman {
	
	  
	    public static void main(String[] args)
	    {
	  
	        // Take input from the user
	        System.out.println("Enter a string ");
	        Scanner sc = new Scanner(System.in);
	        String word=sc.next();
	        int n=word.length();
	        String dashes="";
	        for(int i=0;i<n;i++){
	            dashes=dashes+"-";
	        }
	        System.out.println(dashes);
	        System.out.println("Enter a character :");
	        String Character=sc.next();
	        String finalstr="";
	        String missedletter="";
	        if (Character.length()==1){
	            for(int i=0;i<n;i++){
	                if (word.charAt(i)!=Character.charAt(0)){
	                    finalstr=finalstr+dashes.charAt(i);

	                }
	                else{
	                    finalstr=finalstr+Character.charAt(0);
	                }
	            }
	        }else{
	            System.out.println("enter only one character");
	            missedletter=Character;
	            System.out.println("Missed character"+missedletter);
	        }
	        System.out.println("\n");
	        System.out.println(finalstr);
	    }
	    

	
		
}




	


	

