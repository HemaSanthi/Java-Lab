package Demo;

public class Array { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] element1 = {4,7,3,9,2};
	      int[] element2 = {3,2,12,9,40,32,4};
	      
	      for(int i = 0;i < element1.length; i++) {
	         for(int j = 0; j < element2.length; j++) {
	            if(element1[i] == element2[j]) { 
	               System.out.println(element1[i]);
	            } 
	         } 
	      }

	}

}
