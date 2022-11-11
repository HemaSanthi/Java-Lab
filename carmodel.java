package Demo;

public class carmodel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enum car{Maruthi(1984),tata(2010),Audi(2019);
			
		private int value;  
		private car(int value){  
		this.value=value;  
		}  
		}
		
		//Printing the enum with all values and constants.
		System.out.println("    Car Name\tModel Year");
		for(car c : car.values())
			System.out.println("    "+c+"\t"+c.value);
	}

	

}
