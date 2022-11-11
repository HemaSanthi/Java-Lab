package Demo;
import java.util.*;
public class Student_details {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        String Student_names[] = { "Hema", "sugan", "kirthi" };
	        int Student_marks[] = { 90,78,97 };
	        char student_Class[] = { 'S', 'A', 'S'};
	        
	        for(int i = 0; i < Student_names.length; i++)
	        {
	            System.out.println( Student_names[i] + " in class " + student_Class[i] + " got " + Student_marks[i] + " marks." );
	        }    
	    }
}
