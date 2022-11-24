package mapexample;

public class inheritanceClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parentclass p = new parentclass();
		Childclass c= new Childclass();
		p.Parentmethod();
		c.childmethod();
		c.Parentmethod();

	}

}
class parentclass{
	public void Parentmethod() {
		System.out.println("This is Parent Class");
	}
}

class Childclass extends parentclass{
	public void childmethod() {
		System.out.println("This is Child Class");
	}
}
