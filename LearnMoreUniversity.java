package mapexample;

import java.util.Scanner;

public class LearnMoreUniversity implements  Student, Employee{
	String Student_FirstName, Student_LastName, Employee_Firstname,Employee_Lastname,Employee_Departmentname, Employee_Desigination ;
	int Student_age,Course_Enrolmentnumber, Student_Id, Employee_age, Employee_Id;
	float Employee_Salary;
	public static Scanner Sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMoreUniversity l1= new LearnMoreUniversity();
		
		System.out.println("Enter the Detail Student / Employee");
		String Choice=Sc.next();
		if (Choice.equals("Student")) {
			
			l1.StudendDetails();
			l1.Print_StudendDetails();
		}
		else if (Choice.equals("Employee")) {
			l1.EmployeeDetails();
			l1.Print_EmployeeDetails();
			
		} 
		else {
			System.out.println("Pls Enter correct Choice");
		}

	}

	@Override
	public void EmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("First Name");
		Employee_Firstname=Sc.next();
		System.out.println("Last Name");
		Employee_Lastname=Sc.next();
		System.out.println("Age");
		Employee_age=Sc.nextInt();
		System.out.println("Employee_Id");
		Employee_Id=Sc.nextInt();
		System.out.println("Department Name");
		Employee_Departmentname=Sc.next();
		System.out.println("Department Desigination");
		Employee_Desigination=Sc.next();
		System.out.println("Salary");
		Employee_Salary=Sc.nextFloat();
	}

	@Override
	public void StudendDetails() {
		// TODO Auto-generated method stub
		System.out.println("First Name");
		Student_FirstName=Sc.next();
		System.out.println("Last Name");
		Student_LastName=Sc.next();
		System.out.println("Age");
		Student_age=Sc.nextInt();
		System.out.println("Course_Enrolment Number");
		Course_Enrolmentnumber=Sc.nextInt();
		System.out.println("Student_Id");
		Student_Id=Sc.nextInt();
	}

	@Override
	public void Print_EmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("First Name "+ Employee_Firstname + " Last Name " + Employee_Lastname + " Id "+Employee_Id + " Age " + Employee_age + " Salary " + Employee_Salary + " Department Name " + Employee_Departmentname +" Designation " + Employee_Desigination);
	}
 
	@Override
	public void Print_StudendDetails() {
		// TODO Auto-generated method stub
		System.out.println("First Name " + Student_FirstName + " Last Name " + Student_LastName + " Id "+Student_Id + " Age " + Student_age + " Course EnrolmentNumber " + Course_Enrolmentnumber );
	}

}
interface Student {
	public void StudendDetails();
	public void Print_StudendDetails();
		
	

}
interface Employee{
	public void EmployeeDetails();
	public void Print_EmployeeDetails();
	
}
