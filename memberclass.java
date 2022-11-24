package mapexample;

public class memberclass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e=new employee();
		e.name="xyz";
		e.age=21;
		e.phone_number=9123456789L;
		e.Salary=50000.00f;
		e.Department="aa";
		e.Specilization="ww";
		System.out.println("Employee Details");
		System.out.println("Name=" +e.name + "age= " + e.age + "phone number" + e.phone_number +"salary" + e.Salary + "Department" + e.Department + "Specilzation" + e.Specilization );
		Manager m=new Manager();
		m.name="abc";
		m.age=26;
		m.phone_number=97677456789L;
		m.Salary=75000.00f;
		m.Department="acca";
		m.Specilization="wwzx";	
		System.out.println("Manager Details");
		System.out.println("Name=" +m.name + "age= " + m.age + "phone number" + m.phone_number +"salary" + m.Salary + "Department" + m.Department + "Specilzation" + m.Specilization );
		

	}

}
class member{
	String name, Address;
	int age;
	long phone_number;
	float Salary;
	public void print_salary() {
		System.out.println("Salary"+ Salary);
	}
}

class employee extends member{
	String Specilization, Department;
	
	
}
class Manager extends member{
	String Specilization, Department;
