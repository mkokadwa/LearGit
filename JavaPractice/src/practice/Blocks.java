package practice;

public class Blocks {

	static int jhut;
	public Blocks() {
		System.out.println("Inside Constructor....");	
	}
	
		static
	{
		
		System.out.println("Inside static block....");
	}
	
	{
		System.out.println("Inside Non Static block....");
	}
	
	public static void main(String[] args) {
		
		Blocks n=new Blocks();
		n.main();
		jhut=99;
	}
	
	public  void main ()
	{
		jhut=9;
		System.out.println("inside mainnnn");
	}
}
